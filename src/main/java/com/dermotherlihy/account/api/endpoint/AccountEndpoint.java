package com.dermotherlihy.account.api.endpoint;

import com.dermotherlihy.account.api.resource.AccountResource;
import com.dermotherlihy.account.api.resource.factory.AccountResourceFactory;
import com.dermotherlihy.account.domain.model.Account;
import com.dermotherlihy.account.domain.model.Sex;
import com.dermotherlihy.account.domain.service.AccountService;

import javax.annotation.Resource;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: dermot.herlihy
 * Date: 14/01/2014
 * Time: 19:15
 * To change this template use File | Settings | File Templates.
 */

@Path("/account")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class AccountEndpoint {

    @Resource
    private AccountService accountService;

    public AccountEndpoint(AccountService accountService) {
        this.accountService=accountService;
    }

    @GET
    public AccountResource getAccountByUserName(@QueryParam("username") String username){
      Account account= accountService.findByUsername(username);
      return AccountResourceFactory.createAccountResource(account);
    }

    @POST
    public void create(AccountResource accountResource){
        Account account = new Account.Builder().setUsername(accountResource.getUsername()).setSex(Sex.valueOf(accountResource.getSex())).setDob(accountResource.getDateOfBirth()).setCreated(new Date()).setModified(new Date()).build();
        accountService.insert(account);
    }

}
