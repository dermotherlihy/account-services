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
    private final String username;
    private final char sex;


    public AccountResource(int id, String username, char sex){
        this.id=id;
        this.username =username;
        this.sex=sex;
    }

    public int getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public char getSex() {
        return sex;
    }
}
