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
    private Date dob;
    private Sex sex;
    private Date modified;
    private Date created;

    private Account(Builder builtObject) {
        this.id = builtObject.getId();
        this.userName=builtObject.getUserName();
        this.sex=builtObject.getSex();
        this.created=builtObject.getCreated();
        this.modified=builtObject.getModified();
        this.dob=builtObject.getDob();
    }
    public int getId() {
        return id;
    }
    public String getUserName() {
        return userName;
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
        private String userName;
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

        public String getUserName() {
            return userName;
        }

        public Sex getSex() {
            return sex;
        }

        public Builder setUserName(String userName) {
            this.userName = userName;
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
