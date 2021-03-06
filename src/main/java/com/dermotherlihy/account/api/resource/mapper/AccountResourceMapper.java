package com.dermotherlihy.account.api.resource.mapper;

import com.dermotherlihy.account.api.resource.AccountResource;
import com.dermotherlihy.account.domain.model.Account;
import org.springframework.stereotype.Component;

/**
 * Created with IntelliJ IDEA.
 * User: dermot.herlihy
 * Date: 05/03/2014
 * Time: 19:37
 * To change this template use File | Settings | File Templates.
 */
@Component
public class AccountResourceMapper {

    public static AccountResource createAccountResource(Account account){
        AccountResource accountResource = new AccountResource();
        accountResource.setId(account.getId());
        accountResource.setDateOfBirth(account.getDob());
        accountResource.setUsername(account.getUsername());
        accountResource.setSex(account.getSex().getCode());
        accountResource.setModified(account.getModified());
        accountResource.setCreated(account.getCreated());
        return accountResource;
     }

}
