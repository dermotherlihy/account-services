package com.dermotherlihy.account.api.endpoint;

import com.dermotherlihy.account.domain.model.Account;
import com.dermotherlihy.account.domain.model.Sex;
import com.dermotherlihy.account.domain.service.AccountService;
import com.dermotherlihy.account.api.resource.AccountResource;
import com.google.common.base.Optional;

import javax.annotation.Resource;
import javax.validation.Valid;
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

@Path("/member")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class AccountEndpoint {

    @Resource
    private AccountService accountService;

    public AccountEndpoint(AccountService accountService) {
        this.accountService=accountService;
    }

    @GET
    public AccountResource getMember(@QueryParam("name") Optional<String> name){
      Account account= accountService.getByName(name.get());
      AccountResource accountResource = new AccountResource();
      accountResource.setId(account.getId());
      accountResource.setUsername(account.getUsername());
      accountResource.setSex(account.getSex().getCode());
      return accountResource;
    }

    @POST
    public void addMember(@Valid JsonAccountResource accountResource){
        Account account = new Account.Builder().setUsername(accountResource.getUsername()).setCreated(new Date()).setModified(new Date()).setSex(Sex.valueOf(accountResource.getSex())).build();
        accountService.insert(account);
    }

}
