package com.dermotherlihy.account.config;

import com.dermotherlihy.account.domain.model.AccountDAO;
import com.dermotherlihy.account.domain.service.AccountService;
import com.dermotherlihy.account.jdbi.serializer.DateAsTimestampArgument;
import com.dermotherlihy.account.jdbi.serializer.SexAsStringArgument;
import com.dermotherlihy.account.api.endpoint.HealthCheckEndpoint;
import com.dermotherlihy.account.api.endpoint.AccountEndpoint;
import com.yammer.dropwizard.Service;
import com.yammer.dropwizard.config.Bootstrap;
import com.yammer.dropwizard.config.Environment;
import com.yammer.dropwizard.db.DatabaseConfiguration;
import com.yammer.dropwizard.jdbi.DBIFactory;
import com.yammer.dropwizard.json.ObjectMapperFactory;
import com.yammer.dropwizard.migrations.MigrationsBundle;
import org.skife.jdbi.v2.DBI;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;


import javax.ws.rs.Path;

/**
 * Created with IntelliJ IDEA.
 * User: dermot.herlihy
 * Date: 14/01/2014
 * Time: 18:54
 * To change this template use File | Settings | File Templates.
 */
@ComponentScan(basePackages= "com.dermotherlihy",
        includeFilters={@Filter(Path.class)})
public class AccountServiceConfig extends Service<BasicConfiguration>{

    public static void main(String[] args) throws Exception{
        new AccountServiceConfig().run(args);
    }

    @Override
    public void initialize(Bootstrap<BasicConfiguration> bootstrap) {
        bootstrap.setName("hello-world");
        bootstrap.addBundle(new MigrationsBundle<BasicConfiguration>() {
            @Override
            public DatabaseConfiguration getDatabaseConfiguration(BasicConfiguration configuration) {
                return configuration.getDatabaseConfiguration();
            }
        });
    }

    @Override
    public void run(BasicConfiguration basicConfiguration, Environment environment) throws Exception {
       final DBIFactory factory = new DBIFactory();
       final DBI jdbi = factory.build(environment, basicConfiguration.getDatabaseConfiguration(), "mysql");
       jdbi.registerArgumentFactory(new SexAsStringArgument());
       jdbi.registerArgumentFactory(new DateAsTimestampArgument());

       final AccountDAO accountDAO = jdbi.onDemand(AccountDAO.class);
       AccountService accountService = new AccountService(accountDAO);
       environment.addResource(new AccountEndpoint(accountService));
       environment.addHealthCheck(new HealthCheckEndpoint("Hello"));
       ObjectMapperFactory objectMapperFactory = new ObjectMapperFactory();
       environment.addResource(objectMapperFactory);

    }
}
