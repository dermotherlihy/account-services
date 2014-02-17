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
public class AccountContact {

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

    public int getId() {
        return id;
    }

    public int getAccountId() {
        return accountId;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    public Optional<String> getAddressLine1() {
        return addressLine1;
    }

    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = Optional.of(addressLine1);
    }

    public Optional<String> getAddressLine2() {
        return addressLine2;
    }

    public void setAddressLine2(String addressLine2) {
        this.addressLine2 = Optional.of(addressLine2);
    }

    public Optional<String> getAddressLine3() {
        return addressLine3;
    }

    public void setAddressLine3(String addressLine3) {
        this.addressLine3 = Optional.of(addressLine3);
    }

    public Optional<String> getAddressLine4() {
        return addressLine4;
    }

    public void setAddressLine4(String addressLine4) {
        this.addressLine4 = Optional.of(addressLine4);
    }

    public Optional<String> getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = Optional.of(email);
    }

    public Optional<String> getHomePhone() {
        return homePhone;
    }

    public void setHomePhone(String homePhone) {
        this.homePhone = Optional.of(homePhone);
    }

    public Optional<String> getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = Optional.of(mobilePhone);
    }

    public Optional<String> getIsoCountryCode() {
        return isoCountryCode;
    }

    public void setIsoCountryCode(String isoCountryCode) {
        this.isoCountryCode = Optional.of(isoCountryCode);
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Date getModified() {
        return modified;
    }

    public void setModified(Date modified) {
        this.modified = modified;
    }
}
