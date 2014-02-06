package com.dermotherlihy.account.domain.model;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 * User: dermot.herlihy
 * Date: 21/01/2014
 * Time: 19:07
 * To change this template use File | Settings | File Templates.
 */
public class AccountUTest {


    @Test
    public void testAccountCreationWithUserNameOnly(){
        String username="Dermot";
        Account account = new Account.Builder().setUserName("Dermot").build();
        Assert.assertTrue("Dermot".equals(account.getUserName()));
        Assert.assertTrue(account.getId()==0);

    }




}
