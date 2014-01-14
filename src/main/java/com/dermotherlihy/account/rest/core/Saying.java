package com.dermotherlihy.account.rest.core;

/**
 * Created with IntelliJ IDEA.
 * User: dermot.herlihy
 * Date: 14/01/2014
 * Time: 19:10
 * To change this template use File | Settings | File Templates.
 */
public class Saying {

    private final long id;
    private final String content;

    public Saying(long id, String content){
        this.id=id;
        this.content=content;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}
