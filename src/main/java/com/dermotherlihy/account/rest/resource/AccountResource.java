package com.dermotherlihy.account.rest.resource;

/**
 * Created with IntelliJ IDEA.
 * User: dermot.herlihy
 * Date: 14/01/2014
 * Time: 19:10
 * To change this template use File | Settings | File Templates.
 */
public class AccountResource {

    private final int id;
    private final String userName;

    public AccountResource(int id, String userName){
        this.id=id;
        this.userName =userName;
    }

    public int getId() {
        return id;
    }

    public String getUserName() {
        return userName;
    }
}
