package com.dermotherlihy.account.api.resource.mapper;

import com.dermotherlihy.account.api.resource.ContactResource;
import com.dermotherlihy.account.domain.model.Contact;

/**
 * Created with IntelliJ IDEA.
 * User: dermot.herlihy
 * Date: 18/03/2014
 * Time: 19:25
 * To change this template use File | Settings | File Templates.
 */
public class ContactResourceMapper {

    public Contact mapContact(ContactResource contactResource) {
        Contact contact = new Contact.Builder().setAccountId(Integer.valueOf(contactResource.getAccountId())).setEmail(contactResource.getEmail()).
                setAddressLine4(contactResource.getAddressLine4()).setAddressLine3(contactResource.getAddressLine3()).setAddressLine2(contactResource.getAddressLine2())
                .setAddressLine1(contactResource.getAddressLine1()).setHomePhone(contactResource.getHomePhone()).setMobilePhone(contactResource.getMobilePhone()).setIsoCountryCode(contactResource.getIsoCountryCode()).build();

        return contact;
    }

    public ContactResource mapContactResource(Contact contact) {
        return null;  //To change body of created methods use File | Settings | File Templates.
    }
}
