package com.dermotherlihy.account.api.resource.testdata;

import com.dermotherlihy.account.api.resource.ContactResource;
import org.apache.commons.lang.RandomStringUtils;
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: dermot.herlihy
 * Date: 18/03/2014
 * Time: 19:34
 * To change this template use File | Settings | File Templates.
 */
public class ContactResourceTestData {

    private static DateTimeFormatter dateTimeFormatter = DateTimeFormat.forPattern("yyyy-MM-dd");
    private static String id = "2";
    private static String accountId = "3";
    private static String addressLine1 = RandomStringUtils.random(12);
    private static String addressLine2 = RandomStringUtils.random(12);;
    private static String addressLine3 = RandomStringUtils.random(12);;
    private static String addressLine4 = RandomStringUtils.random(12);;
    private static String email = RandomStringUtils.random(12)+""+RandomStringUtils.random(6)+".com";
    private static String homePhone = RandomStringUtils.randomNumeric(8);
    private static String mobilePhone = RandomStringUtils.randomNumeric(8);;
    private static String isoCountryCode= "IRE";
    private static Date created = DateTime.now().toDate();
    private static Date modified= DateTime.parse("2010-12-28", dateTimeFormatter).toDate();


    public static ContactResource createRandomFullResource(){
        ContactResource contactResource = new ContactResource();
        contactResource.setId(id);
        contactResource.setCreated(created);
        contactResource.setAccountId(accountId);
        contactResource.setAddressLine1(addressLine1);
        contactResource.setAddressLine2(addressLine2);
        contactResource.setAddressLine3(addressLine3);
        contactResource.setAddressLine4(addressLine4);
        contactResource.setEmail(email);
        contactResource.setIsoCountryCode(isoCountryCode);
        contactResource.setCreated(created);
        contactResource.setModified(modified);
        contactResource.setHomePhone(homePhone);
        contactResource.setMobilePhone(mobilePhone);
        return contactResource;
    }

    public static ContactResource createRandomFullResourceWithoutId(){
        ContactResource contactResource = new ContactResource();
        contactResource.setCreated(created);
        contactResource.setAccountId(accountId);
        contactResource.setAddressLine1(addressLine1);
        contactResource.setAddressLine2(addressLine2);
        contactResource.setAddressLine3(addressLine3);
        contactResource.setAddressLine4(addressLine4);
        contactResource.setEmail(email);
        contactResource.setIsoCountryCode(isoCountryCode);
        contactResource.setCreated(created);
        contactResource.setModified(modified);
        contactResource.setHomePhone(homePhone);
        contactResource.setMobilePhone(mobilePhone);
        return contactResource;
    }


}
