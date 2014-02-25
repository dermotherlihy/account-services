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
    private Date modified;
    private Date created;

    private Account(Builder builtObject) {
        this.id = builtObject.getId();
        this.username =builtObject.getUsername();
        this.sex=builtObject.getSex();
        this.created=builtObject.getCreated();
        this.modified=builtObject.getModified();
        this.dob=builtObject.getDob();
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
        private Date dob;
        private Date modified;
        private Date created;

        public Builder setId(int id) {
            this.id = id;
            return this;
        }
        public int getId() {
            return id;
        }

        public String getUsername() {
            return username;
        }

        public Sex getSex() {
            return sex;
        }

        public Builder setUsername(String username) {
            this.username = username;
            return this;
        }

        public Builder setSex(String sex) {
           this.sex = Sex.valueOf(sex.charAt(0));
           return this;
        }
        public Builder setSex(Sex sex) {
            this.sex = sex;
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

       public Date getDob() {
           return dob;
       }

       public Date getModified() {
           return modified;
       }

       public Date getCreated() {
           return created;
       }

       public Account build(){
            return new Account(this);
        }
    }



}
