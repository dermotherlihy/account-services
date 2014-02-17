package com.dermotherlihy.account.testdata;

import com.dermotherlihy.account.domain.model.Account;
import com.dermotherlihy.account.domain.model.Sex;

import java.sql.ResultSet;
import java.util.Calendar;
import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: dermot.herlihy
 * Date: 06/02/2014
 * Time: 19:30
 * To change this template use File | Settings | File Templates.
 */
public class AccountTestData {


    public static final int ID=22233;
    public static final String USERNAME="Dermot";
    public static final Date CREATED = new Date();
    public static final Date MODIFIED = new Date();
    public static final Date DATE_OF_BIRTH = new Date();
    public static final Sex SEX_MALE= Sex.MALE;

    public static Account getTestAccount(){
        return new Account.Builder().setId(ID).setUserName(USERNAME).setCreated(CREATED).setModified(MODIFIED).setSex(SEX_MALE).setUserName(USERNAME).setDob(DATE_OF_BIRTH).build();
    }

}
