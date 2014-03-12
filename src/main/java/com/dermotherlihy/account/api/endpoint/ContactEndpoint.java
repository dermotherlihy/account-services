package com.dermotherlihy.account.api.endpoint;

import com.dermotherlihy.account.api.resource.AccountResource;
import com.dermotherlihy.account.api.resource.ContactResource;
import com.dermotherlihy.account.api.resource.factory.AccountResourceFactory;
import com.dermotherlihy.account.domain.model.Account;
import com.dermotherlihy.account.domain.model.Contact;
import com.dermotherlihy.account.domain.model.Sex;
import com.dermotherlihy.account.domain.service.AccountService;
import com.dermotherlihy.account.domain.service.ContactService;

import javax.annotation.Resource;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: dermot.herlihy
 * Date: 12/03/2014
 * Time: 19:00
 * To change this template use File | Settings | File Templates.
 */
@Path("/contact")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class ContactEndpoint {

    @Resource
    private ContactService contactService;

    public ContactEndpoint(ContactService accountService) {
        this.contactService=accountService;
    }

    @POST
    public void create(ContactResource accountResource){

    }
}
