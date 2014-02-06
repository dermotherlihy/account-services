package com.dermotherlihy.account.domain.model;

import org.skife.jdbi.v2.sqlobject.Bind;

import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: dermot.herlihy
 * Date: 21/01/2014
 * Time: 18:57
 * To change this template use File | Settings | File Templates.
 */
public class Account {

    private int id;
    protected String userName;
    private Title title;
    private String firstName;
    private String middleName;
    private String surname;
    private Date dob;
    private Sex sex;
    private Date modified;
    private Date created;

    private Account(Builder builtObject) {
        this.id = builtObject.getId();
        this.userName=builtObject.getUserName();
    }
    public int getId() {
        return id;
    }

    public String getUserName() {
        return userName;
    }

    public static class Builder {

        private int id;
        private String userName;

        public Builder setId(int id) {
            this.id = id;
            return this;
        }
        public int getId() {
            return id;
        }

        public String getUserName() {
            return userName;
        }

        public Builder setUserName(String userName) {
            this.userName = userName;
            return this;
        }

        public Account build(){
            return new Account(this);
        }
    }



}
