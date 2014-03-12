package com.dermotherlihy.account.api.resource;

import com.dermotherlihy.account.api.mapper.JsonDateDeserializer;
import com.dermotherlihy.account.api.mapper.JsonDateSerializer;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: dermot.herlihy
 * Date: 14/01/2014
 * Time: 19:10
 * To change this template use File | Settings | File Templates.
 */
@JsonIgnoreProperties(ignoreUnknown=true)
public class AccountResource {

    @JsonProperty(value = "id")
    private int id;

    @JsonProperty (value = "username")
    private String username;

    @JsonProperty (value = "sex")
    private char sex;

    @JsonProperty (value = "dateOfBirth")
    @JsonSerialize(using = JsonDateSerializer.class)
    @JsonDeserialize(using = JsonDateDeserializer.class)
    private Date dateOfBirth;

    @JsonProperty(value = "modified")
    @JsonSerialize(using = JsonDateSerializer.class)
    private Date modified;

    @JsonSerialize(using = JsonDateSerializer.class)
    @JsonProperty (value = "created")
    private Date created;


    public AccountResource() {
        super();
    }

    public int getId() {
        return id;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getUsername() {
        return username;
    }

    public char getSex() {
        return sex;
    }

    public Date getModified() {
        return modified;
    }

    public Date getCreated() {
        return created;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public void setModified(Date modified) {
        this.modified = modified;
    }

    public void setCreated(Date created) {
        this.created = created;
    }
}
