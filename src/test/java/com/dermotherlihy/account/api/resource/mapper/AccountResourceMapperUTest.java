package com.dermotherlihy.account.api.resource.mapper;

import com.dermotherlihy.account.api.resource.AccountResource;
import com.dermotherlihy.account.domain.model.Account;
import com.dermotherlihy.account.testdata.AccountTestData;
import org.junit.Test;
import org.junit.Assert;

/**
 * Created with IntelliJ IDEA.
 * User: dermot.herlihy
 * Date: 05/03/2014
 * Time: 19:41
 * To change this template use File | Settings | File Templates.
 */
public class AccountResourceMapperUTest {



    @Test
    public void testAccountResourceCreation(){

         Account account = AccountTestData.getTestAccount();
         AccountResource accountResource = AccountResourceMapper.createAccountResource(account);
         Assert.assertEquals(account.getDob(), accountResource.getDateOfBirth());
         Assert.assertEquals(account.getUsername(), accountResource.getUsername());
         Assert.assertEquals(account.getSex().getCode(), accountResource.getSex());
         Assert.assertEquals(account.getModified(), accountResource.getModified());
         Assert.assertEquals(account.getCreated(), accountResource.getCreated());
         Assert.assertEquals(account.getId(), accountResource.getId());
    }


}
