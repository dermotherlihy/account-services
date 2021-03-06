package com.dermotherlihy.account.api.resource;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.base.Optional;
import org.joda.time.DateTime;

import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: dermot.herlihy
 * Date: 12/03/2014
 * Time: 19:24
 * To change this template use File | Settings | File Templates.
 */
@JsonIgnoreProperties(ignoreUnknown=true)
public class ContactResource {

    @JsonProperty(value = "id")
    private String id;
    @JsonProperty(value = "account-id")
    private String accountId;
    @JsonProperty(value = "title")
    private String title;
    @JsonProperty(value = "first-name")
    private String firstName;
    @JsonProperty(value = "middle-name")
    private String middleName;
    @JsonProperty(value = "surname")
    private String surname;
    @JsonProperty(value = "address-line-1")
    private String addressLine1;
    @JsonProperty(value = "address-line-2")
    private String addressLine2;
    @JsonProperty(value = "address-line-3")
    private String addressLine3;
    @JsonProperty(value = "address-line-4")
    private String addressLine4;
    @JsonProperty(value = "postcode")
    private String postcode;
    @JsonProperty(value = "email")
    private String email;
    @JsonProperty(value = "work-phone")
    private String workPhone;
    @JsonProperty(value = "home-phone")
    private String homePhone;
    @JsonProperty(value = "mobile-phone-number")
    private String mobilePhone;
    @JsonProperty(value = "iso-country-code")
    private String isoCountryCode;
    @JsonProperty(value = "created")
    private Date created;
    @JsonProperty(value = "modified")
    private Date modified;



    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }


    public String getWorkPhone() {
        return workPhone;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Date getModified() {
        return modified;
    }

    public void setModified(Date modified) {
        this.modified = modified;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public String getIsoCountryCode() {
        return isoCountryCode;
    }

    public void setIsoCountryCode(String isoCountryCode) {
        this.isoCountryCode = isoCountryCode;
    }

    public String getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    public String getHomePhone() {
        return homePhone;
    }

    public void setHomePhone(String homePhone) {
        this.homePhone = homePhone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddressLine4() {
        return addressLine4;
    }

    public void setAddressLine4(String addressLine4) {
        this.addressLine4 = addressLine4;
    }

    public String getAddressLine3() {
        return addressLine3;
    }

    public void setAddressLine3(String addressLine3) {
        this.addressLine3 = addressLine3;
    }

    public String getAddressLine2() {
        return addressLine2;
    }

    public void setAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public String getAddressLine1() {
        return addressLine1;
    }

    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }

    public void setWorkPhone(String workPhone) {
        this.workPhone = workPhone;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public String getPostcode() {
        return postcode;
    }
}
