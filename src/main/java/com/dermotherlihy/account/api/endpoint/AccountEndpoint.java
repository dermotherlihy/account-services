package com.dermotherlihy.account.api.endpoint;

import com.dermotherlihy.account.api.resource.AccountResource;
import com.dermotherlihy.account.api.resource.mapper.AccountResourceMapper;
import com.dermotherlihy.account.domain.model.Account;
import com.dermotherlihy.account.domain.model.Sex;
import com.dermotherlihy.account.domain.service.AccountService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.net.URI;
import java.net.URISyntaxException;
import java.security.NoSuchAlgorithmException;

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
@Service
public class AccountEndpoint {

    @Resource
    private AccountService accountService;

    @GET
    public AccountResource getAccountById(@QueryParam("id") String id){
        Account account= accountService.findById(id);
        return AccountResourceMapper.createAccountResource(account);
    }

    @GET
    public AccountResource getAccountByUserName(@QueryParam("username") String username){
      Account account= accountService.findByUsername(username);
      return AccountResourceMapper.createAccountResource(account);
    }

    @POST
    public Response create(AccountResource accountResource) throws URISyntaxException, NoSuchAlgorithmException {
        Account account = new Account.Builder().setUsername(accountResource.getUsername()).setSex(Sex.valueOf(accountResource.getSex())).setDob(accountResource.getDateOfBirth()).build();
        account=accountService.insert(account);
        return Response.status(Response.Status.CREATED).contentLocation(new URI(new StringBuilder("/account").append("/").append(account.getId()).toString())).build();
    }
}
