package com.dermotherlihy.account.domain.model;

import com.google.common.base.Optional;

import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: dermot.herlihy
 * Date: 21/01/2014
 * Time: 19:34
 * To change this template use File | Settings | File Templates.
 */
public class Contact {

    private int id;
    private int accountId;
    private Optional<String> title;
    private String firstName;
    private Optional<String> middleName;
    private String surname;
    private Optional<String> addressLine1;
    private Optional<String> addressLine2;
    private Optional<String> addressLine3;
    private Optional<String> addressLine4;
    private Optional<String> email;
    private Optional<String> homePhone;
    private Optional<String> workPhone;
    private Optional<String> mobilePhone;
    private Optional<String> isoCountryCode;
    private Date created;
    private Date modified;

    private Contact(Builder builder) {
        this.id=builder.id;
        this.accountId=builder.accountId;
        this.title=Optional.fromNullable(builder.title);
        this.firstName=builder.firstName;
        this.middleName=Optional.fromNullable(builder.middleName);
        this.surname=builder.surname;
        this.addressLine1 = Optional.fromNullable(builder.addressLine1);
        this.addressLine2 = Optional.fromNullable(builder.addressLine2);
        this.addressLine3 = Optional.fromNullable(builder.addressLine3);
        this.addressLine4 = Optional.fromNullable(builder.addressLine4);
        this.email=Optional.fromNullable(builder.email);
        this.homePhone=Optional.fromNullable(builder.homePhone);
        this.workPhone=Optional.fromNullable(builder.workPhone);
        this.mobilePhone=Optional.fromNullable(builder.mobilePhone);
        this.isoCountryCode=Optional.fromNullable(builder.isoCountryCode);
        this.created=builder.created;
        this.modified=builder.modified;

    }

    public Optional<String> getTitle() {
        return title;
    }

    public String getFirstName() {
        return firstName;
    }

    public Optional<String> getMiddleName() {
        return middleName;
    }

    public String getSurname() {
        return surname;
    }

    public Integer getId() {
        return id;
    }

    public Integer getAccountId() {
        return accountId;
    }

    public Optional<String> getAddressLine1() {
        return addressLine1;
    }

    public Optional<String> getAddressLine2() {
        return addressLine2;
    }
    public Optional<String> getAddressLine3() {
        return addressLine3;
    }

    public Optional<String> getAddressLine4() {
        return addressLine4;
    }

    public Optional<String> getEmail() {
        return email;
    }

    public Optional<String> getHomePhone() {
        return homePhone;
    }

    public Optional<String> getWorkPhone() {
        return workPhone;
    }

    public Optional<String> getMobilePhone() {
        return mobilePhone;
    }

    public Optional<String> getIsoCountryCode() {
        return isoCountryCode;
    }

    public Date getCreated() {
        return created;
    }

    public Date getModified() {
        return modified;
    }

    public static class Builder {

        private int id;
        private int accountId;
        private String title;
        private String firstName;
        private String middleName;
        private String surname;
        private String addressLine1;
        private String addressLine2;
        private String addressLine3;
        private String addressLine4;
        private String email;
        private String homePhone;
        private String workPhone;
        private String mobilePhone;
        private String isoCountryCode;
        private Date created;
        private Date modified;


        public Builder setId(int id) {
            this.id = id;
            return this;
        }

        public Builder setTitle(String title) {
            this.title = title;
            return this;
        }

        public Builder setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder setMiddleName(String middleName) {
            this.middleName = middleName;
            return this;
        }

        public Builder setSurname(String surname) {
            this.surname = surname;
            return this;
        }

        public Builder setAccountId(int accountId) {
            this.accountId = accountId;
            return this;
        }

        public Builder setAddressLine1(String addressLine1) {
            this.addressLine1 = addressLine1;
            return this;
        }

        public Builder setAddressLine2(String addressLine2) {
            this.addressLine2 = addressLine2;
            return this;
        }

        public Builder setAddressLine3(String addressLine3) {
            this.addressLine3 = addressLine3;
            return this;
        }

        public Builder setAddressLine4(String addressLine4) {
            this.addressLine4 = addressLine4;
            return this;
        }

        public Builder setEmail(String email) {
            this.email = email;
            return this;
        }

        public Builder setHomePhone(String homePhone) {
            this.homePhone = homePhone;
            return this;
        }

        public Builder setMobilePhone(String mobilePhone) {
            this.mobilePhone = mobilePhone;
            return this;
        }

        public Builder setIsoCountryCode(String isoCountryCode) {
            this.isoCountryCode = isoCountryCode;
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

        public Builder setWorkPhone(String workPhone) {
            this.workPhone = workPhone;
            return this;
        }

        public Contact build(){
            return new Contact(this);
        }
    }

 }
