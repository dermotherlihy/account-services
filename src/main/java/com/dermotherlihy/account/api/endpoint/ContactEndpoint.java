package com.dermotherlihy.account.api.endpoint;

import com.dermotherlihy.account.api.resource.ContactResource;
import com.dermotherlihy.account.api.resource.mapper.ContactResourceMapper;
import com.dermotherlihy.account.domain.model.Contact;
import com.dermotherlihy.account.domain.service.ContactService;

import javax.annotation.Resource;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

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


    private ContactService contactService;
    private ContactResourceMapper contactResourceMapper;

    public ContactEndpoint(ContactService accountService) {
        this.contactService=accountService;
        this.contactResourceMapper = new ContactResourceMapper();
    }

    @POST
    public void create(ContactResource contactResource){
        Contact contact = contactResourceMapper.mapContact(contactResource);
        contactService.insert(contact);
    }

    @GET
    public ContactResource getContact(@QueryParam("contactId") Integer contactId){
         Contact contact = contactService.findContactById(contactId);
         return contactResourceMapper.mapContactResource(contact);
    }

}
