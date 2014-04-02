package com.dermotherlihy.account.config;

import com.dermotherlihy.account.config.spring.AccountServicesSpringConfiguration;
import com.dermotherlihy.account.config.spring.SpringContextLoaderListener;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.yammer.dropwizard.Service;
import com.yammer.dropwizard.config.Bootstrap;
import com.yammer.dropwizard.config.Environment;
import com.yammer.dropwizard.db.DatabaseConfiguration;
import com.yammer.dropwizard.jdbi.DBIFactory;
import com.yammer.dropwizard.json.ObjectMapperFactory;
import com.yammer.dropwizard.migrations.MigrationsBundle;
import com.yammer.dropwizard.tasks.Task;
import com.yammer.metrics.core.HealthCheck;
import org.skife.jdbi.v2.DBI;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;

import javax.ws.rs.Path;
import javax.ws.rs.ext.Provider;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: dermot.herlihy
 * Date: 14/01/2014
 * Time: 18:54
 * To change this template use File | Settings | File Templates.
 */

public class AccountServiceConfig extends Service<BasicConfiguration>{




    public static void main(String[] args) throws Exception {
        new AccountServiceConfig().run(args);
    }

    @Override
    public void initialize(Bootstrap<BasicConfiguration> bootstrap) {
        bootstrap.setName("account-service");
        bootstrap.getObjectMapperFactory().setSerializationInclusion(JsonInclude.Include.NON_NULL);
        bootstrap.addBundle(new MigrationsBundle<BasicConfiguration>() {
            @Override
            public DatabaseConfiguration getDatabaseConfiguration(BasicConfiguration configuration) {
                return configuration.getDatabaseConfiguration();
            }
        });


    }

    @Override
    public void run(BasicConfiguration configuration, Environment environment) throws Exception {

        //init Spring context
        //before we init the app context, we have to create a parent context with all the config objects others rely on to get initialized
        AnnotationConfigWebApplicationContext parent = new AnnotationConfigWebApplicationContext();
        AnnotationConfigWebApplicationContext ctx = new AnnotationConfigWebApplicationContext();

        parent.refresh();
        parent.getBeanFactory().registerSingleton("configuration",configuration);
        parent.registerShutdownHook();
        parent.start();

        //the real main app context has a link to the parent context
        ctx.setParent(parent);
        ctx.register(AccountServicesSpringConfiguration.class);
        ctx.refresh();
        ctx.registerShutdownHook();
        ctx.start();

        //now that Spring is started, let's get all the beans that matter into DropWizard

        //health checks
        Map<String, HealthCheck> healthChecks = ctx.getBeansOfType(HealthCheck.class);
        for(Map.Entry<String,HealthCheck> entry : healthChecks.entrySet()) {
            environment.addHealthCheck(entry.getValue());
        }

        //resources
        Map<String, Object> resources = ctx.getBeansWithAnnotation(Path.class);
        for(Map.Entry<String,Object> entry : resources.entrySet()) {
            environment.addResource(entry.getValue());
        }

        //tasks
        Map<String, Task> tasks = ctx.getBeansOfType(Task.class);
        for(Map.Entry<String,Task> entry : tasks.entrySet()) {
            environment.addTask(entry.getValue());
        }

        //JAX-RS providers
        Map<String, Object> providers = ctx.getBeansWithAnnotation(Provider.class);
        for(Map.Entry<String,Object> entry : providers.entrySet()) {
            environment.addProvider(entry.getValue());
        }

        //last, but not least, let's link Spring to the embedded Jetty in Dropwizard
        environment.addServletListeners(new SpringContextLoaderListener(ctx));

        ObjectMapperFactory objectMapperFactory = new ObjectMapperFactory();
        environment.addResource(objectMapperFactory);

   }

}
