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
    private Optional<String> addressLine1;
    private Optional<String> addressLine2;
    private Optional<String> addressLine3;
    private Optional<String> addressLine4;
    private Optional<String> email;
    private Optional<String> homePhone;
    private Optional<String> mobilePhone;
    private Optional<String> isoCountryCode;
    private Date created;
    private Date modified;

    private Contact(Builder builder) {
        this.id=builder.id;
        this.accountId=builder.accountId;
        this.addressLine1 = Optional.of(builder.addressLine1);
        this.addressLine2 = Optional.of(builder.addressLine2);
        this.addressLine3 = Optional.of(builder.addressLine3);
        this.addressLine4 = Optional.of(builder.addressLine4);
        this.email=Optional.of(builder.email);
        this.homePhone=Optional.of(builder.homePhone);
        this.mobilePhone=Optional.of(builder.mobilePhone);
        this.isoCountryCode=Optional.of(builder.isoCountryCode);
        this.created=builder.created;
        this.modified=builder.modified;
    }

    public int getId() {
        return id;
    }

    public int getAccountId() {
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
        private String addressLine1;
        private String addressLine2;
        private String addressLine3;
        private String addressLine4;
        private String email;
        private String homePhone;
        private String mobilePhone;
        private String isoCountryCode;
        private Date created;
        private Date modified;

        public Builder setId(int id) {
            this.id = id;
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

        public Contact build(){
            return new Contact(this);
        }
    }
 }
