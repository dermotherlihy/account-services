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



    public static ContactResource createRandomFullResource(){
        ContactResource contactResource = new ContactResource();

        String id = "2";
        String accountId = "3";
        String title = "Mrs";
        String firstName= RandomStringUtils.randomAlphabetic(12);
        String middleName= RandomStringUtils.randomAlphabetic(12);
        String surname= RandomStringUtils.randomAlphabetic(12);
        String addressLine1 = RandomStringUtils.randomAlphabetic(12);
        String addressLine2 = RandomStringUtils.randomAlphabetic(12);
        String addressLine3 = RandomStringUtils.randomAlphabetic(12);
        String addressLine4 = RandomStringUtils.randomAlphabetic(12);
        String postcode = RandomStringUtils.randomAlphabetic(12);
        String email = RandomStringUtils.random(12)+""+RandomStringUtils.randomAlphabetic(6)+".com";
        String homePhone = RandomStringUtils.randomNumeric(8);
        String mobilePhone = RandomStringUtils.randomNumeric(8);;
        String isoCountryCode= "IRE";
        Date created = DateTime.now().toDate();
        Date modified= DateTime.parse("2010-12-28", dateTimeFormatter).toDate();

        contactResource.setId(id);
        contactResource.setCreated(created);
        contactResource.setAccountId(accountId);
        contactResource.setTitle(title);
        contactResource.setFirstName(firstName);
        contactResource.setMiddleName(middleName);
        contactResource.setSurname(surname);
        contactResource.setAddressLine1(addressLine1);
        contactResource.setAddressLine2(addressLine2);
        contactResource.setAddressLine3(addressLine3);
        contactResource.setAddressLine4(addressLine4);
        contactResource.setPostcode(postcode);
        contactResource.setEmail(email);
        contactResource.setIsoCountryCode(isoCountryCode);
        contactResource.setCreated(created);
        contactResource.setModified(modified);
        contactResource.setHomePhone(homePhone);
        contactResource.setMobilePhone(mobilePhone);
        return contactResource;
    }

    public static ContactResource createRandomFullResourceWithoutId(){
        String id = "2";
        String accountId = "3";
        String title = "Mrs";
        String firstName= RandomStringUtils.randomAlphabetic(12);
        String middleName= RandomStringUtils.randomAlphabetic(12);
        String surname= RandomStringUtils.randomAlphabetic(12);
        String addressLine1 = RandomStringUtils.random(12);
        String addressLine2 = RandomStringUtils.random(12);
        String addressLine3 = RandomStringUtils.random(12);
        String addressLine4 = RandomStringUtils.random(12);
        String postcode = RandomStringUtils.random(12);
        String email = RandomStringUtils.random(12)+""+RandomStringUtils.random(6)+".com";
        String homePhone = RandomStringUtils.randomNumeric(8);
        String mobilePhone = RandomStringUtils.randomNumeric(8);
        String workPhone = RandomStringUtils.randomNumeric(8);
        String isoCountryCode= "IRE";
        Date created = DateTime.now().toDate();
        Date modified= DateTime.parse("2010-12-28", dateTimeFormatter).toDate();

        ContactResource contactResource = new ContactResource();
        contactResource.setCreated(created);
        contactResource.setAccountId(accountId);
        contactResource.setTitle(title);
        contactResource.setWorkPhone(workPhone);
        contactResource.setFirstName(firstName);
        contactResource.setMiddleName(middleName);
        contactResource.setSurname(surname);
        contactResource.setAddressLine1(addressLine1);
        contactResource.setAddressLine2(addressLine2);
        contactResource.setAddressLine3(addressLine3);
        contactResource.setAddressLine4(addressLine4);
        contactResource.setPostcode(postcode);
        contactResource.setEmail(email);
        contactResource.setIsoCountryCode(isoCountryCode);
        contactResource.setCreated(created);
        contactResource.setModified(modified);
        contactResource.setHomePhone(homePhone);
        contactResource.setMobilePhone(mobilePhone);
        return contactResource;
    }


}
