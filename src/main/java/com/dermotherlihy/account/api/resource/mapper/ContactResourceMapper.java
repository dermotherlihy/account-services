package com.dermotherlihy.account.api.resource.mapper;

import com.dermotherlihy.account.api.resource.ContactResource;
import com.dermotherlihy.account.domain.model.Contact;
import org.springframework.stereotype.Component;

/**
 * Created with IntelliJ IDEA.
 * User: dermot.herlihy
 * Date: 18/03/2014
 * Time: 19:25
 * To change this template use File | Settings | File Templates.
 */
@Component
public class ContactResourceMapper {

    public Contact mapContact(ContactResource contactResource) {
        Contact contact = new Contact.Builder().setAccountId(Integer.valueOf(contactResource.getAccountId())).setTitle(contactResource.getTitle()).setFirstName(contactResource.getFirstName()).setMiddleName(contactResource.getMiddleName()).setSurname(contactResource.getSurname()).setEmail(contactResource.getEmail()).
                setPostcode(contactResource.getPostcode()).setAddressLine4(contactResource.getAddressLine4()).setAddressLine3(contactResource.getAddressLine3()).setAddressLine2(contactResource.getAddressLine2())
                .setAddressLine1(contactResource.getAddressLine1()).setIsoCountryCode(contactResource.getIsoCountryCode()).setHomePhone(contactResource.getHomePhone()).setMobilePhone(contactResource.getMobilePhone()).setWorkPhone(contactResource.getWorkPhone()).build();

        return contact;
    }

    public ContactResource mapContactResource(Contact contact) {
        ContactResource contactResource = new ContactResource();
        contactResource.setEmail(contact.getEmail().orNull());

        contactResource.setTitle(contact.getTitle().orNull());
        contactResource.setFirstName(contact.getFirstName());
        contactResource.setMiddleName(contact.getMiddleName().orNull());
        contactResource.setSurname(contact.getSurname());

        contactResource.setAddressLine1(contact.getAddressLine1().orNull());
        contactResource.setAddressLine2(contact.getAddressLine2().orNull());
        contactResource.setAddressLine3(contact.getAddressLine3().orNull());
        contactResource.setAddressLine4(contact.getAddressLine4().orNull());
        contactResource.setPostcode(contact.getPostcode().orNull());

        contactResource.setIsoCountryCode(contact.getIsoCountryCode().orNull());

        contactResource.setAccountId(contact.getAccountId().toString());
        contactResource.setMobilePhone(contact.getMobilePhone().orNull());
        contactResource.setHomePhone(contact.getHomePhone().orNull());
        contactResource.setWorkPhone(contact.getWorkPhone().orNull());

        contactResource.setCreated(contact.getCreated());
        contactResource.setModified(contact.getModified());
        contactResource.setId(contact.getId().toString());
        contactResource.setAccountId(contact.getAccountId().toString());

        contactResource.setIsoCountryCode(contact.getIsoCountryCode().orNull());

        return contactResource;
    }
}
