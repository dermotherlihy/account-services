package com.dermotherlihy.account.config.spring;

/**
 * Created with IntelliJ IDEA.
 * User: dermot.herlihy
 * Date: 01/04/2014
 * Time: 13:38
 * To change this template use File | Settings | File Templates.
 */

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

/**
 Main Spring Configuration
 */
@Configuration
@ComponentScan(basePackages = "com.dermotherlihy.account.*")
@ImportResource({"classpath:applicationContext-infrastructure-config.xml"})
public class AccountServicesSpringConfiguration {

}
