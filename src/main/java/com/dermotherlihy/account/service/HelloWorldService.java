package com.dermotherlihy.account.service;

import com.dermotherlihy.account.rest.resources.HelloWorldResource;
import com.yammer.dropwizard.Service;
import com.dermotherlihy.account.config.BasicConfiguration;
import com.yammer.dropwizard.config.Bootstrap;
import com.yammer.dropwizard.config.Environment;

/**
 * Created with IntelliJ IDEA.
 * User: dermot.herlihy
 * Date: 14/01/2014
 * Time: 18:54
 * To change this template use File | Settings | File Templates.
 */
public class HelloWorldService extends Service<BasicConfiguration>{

    public static void main(String[] args) throws Exception{
        new HelloWorldService().run(args);
    }

    @Override
    public void initialize(Bootstrap<BasicConfiguration> bootstrap) {
        bootstrap.setName("hello-world");
    }

    @Override
    public void run(BasicConfiguration basicConfiguration, Environment environment) throws Exception {
       final String template = basicConfiguration.getTemplate();
       final String defaultName=  basicConfiguration.getDefaultName();
       environment.addResource(new HelloWorldResource(template,defaultName));
       environment.addHealthCheck(new AccountHealthCheck(template));
        //To change body of implemented methods use File | Settings | File Templates.
    }
}
