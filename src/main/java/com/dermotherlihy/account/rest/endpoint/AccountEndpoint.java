package com.dermotherlihy.account.rest.endpoint;

import com.dermotherlihy.account.domain.model.Account;
import com.dermotherlihy.account.domain.service.AccountService;
import com.dermotherlihy.account.rest.resource.AccountResource;
import com.google.common.base.Optional;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.concurrent.atomic.AtomicLong;

/**
 * Created with IntelliJ IDEA.
 * User: dermot.herlihy
 * Date: 14/01/2014
 * Time: 19:15
 * To change this template use File | Settings | File Templates.
 */

@Path("/member")
@Produces(MediaType.APPLICATION_JSON)
public class AccountEndpoint {

    @Resource
    private AccountService accountService;

    public AccountEndpoint(AccountService accountService) {
        this.accountService=accountService;
    }

    @GET
    public AccountResource getMember(@QueryParam("name") Optional<String> name){
      Account account= accountService.getByName(name.get());
      return new AccountResource(account.getId(),account.getUserName());
    }

    @POST
    public void addMember(AccountResource accountResource){
        accountService.insert(new Account.Builder().setId(accountResource.getId()).setUserName(accountResource.getUserName()).build());
    }

}
