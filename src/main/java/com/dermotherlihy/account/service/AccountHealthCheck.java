package com.dermotherlihy.account.service;

import com.yammer.metrics.core.HealthCheck;

/**
 * Created with IntelliJ IDEA.
 * User: dermot.herlihy
 * Date: 14/01/2014
 * Time: 19:28
 * To change this template use File | Settings | File Templates.
 */
public class AccountHealthCheck extends HealthCheck{

    private final String template;

    protected AccountHealthCheck(String template) {
        super(template);
        this.template = template;
    }

    @Override
    protected Result check() throws Exception {
        final String saying = String.format(template,"REST");

        if(!saying.contains("TEST")){
            return Result.unhealthy("template does not include a name");

        }
       return Result.healthy();
     }
}
