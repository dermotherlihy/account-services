package com.dermotherlihy.account.api.resource.mapper;

import com.dermotherlihy.account.api.resource.ContactResource;
import com.dermotherlihy.account.api.resource.testdata.ContactResourceTestData;
import com.dermotherlihy.account.domain.model.Contact;


import org.junit.Test;
import org.apache.commons.lang.RandomStringUtils;
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import org.junit.Assert;

import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: dermot.herlihy
 * Date: 18/03/2014
 * Time: 19:28
 * To change this template use File | Settings | File Templates.
 */
public class ContactResourceMapperUTest {

    private ContactResourceMapper testObj = new ContactResourceMapper();


    @Test
    public void testMappingFromResourceToModelObject(){
        ContactResource contactResource = ContactResourceTestData.createRandomFullResourceWithoutId();
        Contact contact = testObj.mapContact(contactResource);
        Assert.assertNull(contact.getCreated());
        Assert.assertNull(contact.getModified());
        Assert.assertEquals(Integer.valueOf(contactResource.getAccountId()),Integer.valueOf(contact.getAccountId()));
        Assert.assertEquals(contactResource.getAddressLine1(),contact.getAddressLine1().get());
        Assert.assertEquals(contactResource.getAddressLine2(),contact.getAddressLine2().get());
        Assert.assertEquals(contactResource.getAddressLine3(),contact.getAddressLine3().get());
        Assert.assertEquals(contactResource.getAddressLine4(),contact.getAddressLine4().get());
        Assert.assertEquals(contactResource.getEmail(),contact.getEmail().get());
        Assert.assertEquals(contactResource.getMobilePhone(),contact.getMobilePhone().get());
        Assert.assertEquals(contactResource.getMobilePhone(),contact.getMobilePhone().get());
        Assert.assertEquals(contactResource.getIsoCountryCode(),contact.getIsoCountryCode().get());
    }





}
