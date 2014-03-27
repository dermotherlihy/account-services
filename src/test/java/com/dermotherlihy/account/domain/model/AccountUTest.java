package com.dermotherlihy.account.domain.model;

import org.junit.Assert;
import org.junit.Test;

import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: dermot.herlihy
 * Date: 21/01/2014
 * Time: 19:07
 * To change this template use File | Settings | File Templates.
 */
public class AccountUTest {


    @Test
    public void testAccountBuilder(){
        int id=22233;
        String username="Dermot";
        Date created = new Date();
        Date modified = new Date();
        Date dateOfBirth = new Date();
        Sex male= Sex.MALE;
        String password = "password";

        Account account = new Account.Builder().setUsername(username).setId(id).setModified(modified).setCreated(created).setDob(dateOfBirth).setSex(male).setPassword(password).build();

        Assert.assertEquals(username,account.getUsername());
        Assert.assertEquals(created,account.getCreated());
        Assert.assertEquals(dateOfBirth,account.getDob());
        Assert.assertEquals(modified,account.getModified());
        Assert.assertEquals(male,account.getSex());
        Assert.assertEquals(password,account.getPassword());
    }




}
