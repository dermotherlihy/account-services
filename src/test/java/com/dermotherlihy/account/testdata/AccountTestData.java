package com.dermotherlihy.account.testdata;

import com.dermotherlihy.account.domain.model.Account;

import java.sql.ResultSet;

/**
 * Created with IntelliJ IDEA.
 * User: dermot.herlihy
 * Date: 06/02/2014
 * Time: 19:30
 * To change this template use File | Settings | File Templates.
 */
public class AccountTestData {

    public Account getTestAccount(){
        return new Account.Builder().setId(22233).setUserName("Dermot").build();
    }

}
