package com.dermotherlihy.account.domain.model;

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
    protected String username;
    private Date dob;
    private Sex sex;
    private String password;
    private Date modified;
    private Date created;

    private Account(Builder builtObject) {
        this.id = builtObject.id;
        this.username =builtObject.username;
        this.sex=builtObject.sex;
        this.created=builtObject.created;
        this.modified=builtObject.modified;
        this.dob=builtObject.dob;
        this.password=builtObject.password;
    }
    public int getId() {
        return id;
    }
    public String getUsername() {
        return username;
    }

    public Date getDob() {
        return dob;
    }

    public Sex getSex() {
        return sex;
    }

    public String getPassword() {
        return password;
    }

    public Date getModified() {
        return modified;
    }

    public Date getCreated() {
        return created;
    }

    public static class Builder {

        private int id;
        private String username;
        private Sex sex;
        private String password;
        private Date dob;
        private Date modified;
        private Date created;

        public Builder setId(int id) {
            this.id = id;
            return this;
        }

        public Builder setPassword(String password) {
            this.password = password;
            return this;
        }


        public String getUsername() {
            return username;
        }

        public Builder setUsername(String username) {
            this.username = username;
            return this;
        }

        public Builder setSex(Sex sex) {
            this.sex = sex;
            return this;
        }
        public Builder setSex(String sex) {
           this.sex = Sex.valueOf(sex.charAt(0));
           return this;
        }

        public Builder setCreated(Date created) {
           this.created = created;
           return this;
        }
        public Builder setModified(Date modified) {
           this.modified = modified;
           return this;
        }
        public Builder setDob(Date dob) {
            this.dob = dob;
            return this;
        }

       public Account build(){
            return new Account(this);
        }
    }



}
