package com.dermotherlihy.account.domain.model;

import com.google.common.base.Optional;
import org.apache.commons.lang.RandomStringUtils;
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import org.junit.Assert;
import org.junit.Test;

import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: dermot.herlihy
 * Date: 18/03/2014
 * Time: 18:53
 * To change this template use File | Settings | File Templates.
 */
public class ContactUTest {

    private DateTimeFormatter dateTimeFormatter = DateTimeFormat.forPattern("yyyy-MM-dd");
    private int id = 2;
    private int accountId = 3;
    private String addressLine1 = RandomStringUtils.random(12);
    private String addressLine2 = RandomStringUtils.random(12);;
    private String addressLine3 = RandomStringUtils.random(12);;
    private String addressLine4 = RandomStringUtils.random(12);;
    private String email = RandomStringUtils.random(12)+""+RandomStringUtils.random(6)+".com";
    private String homePhone = RandomStringUtils.randomNumeric(8);
    private String mobilePhone = RandomStringUtils.randomNumeric(8);;
    private String isoCountryCode= "IRE";
    private Date created = DateTime.now().toDate();
    private Date modified= DateTime.parse("2010-12-28", dateTimeFormatter).toDate();


   @Test
   public void testContactCreation(){
        Contact contact = new Contact.Builder().setAccountId(accountId).setId(id).setAddressLine1(addressLine1).setAddressLine2(addressLine2).
                setAddressLine3(addressLine3).setAddressLine4(addressLine4).setEmail(email).setHomePhone(homePhone).setMobilePhone(mobilePhone).setIsoCountryCode(isoCountryCode).setCreated(created).setModified(modified).build();
       Assert.assertEquals(id, contact.getId());
       Assert.assertEquals(accountId, contact.getAccountId());
       Assert.assertEquals(addressLine1, contact.getAddressLine1().get());
       Assert.assertEquals(addressLine2, contact.getAddressLine2().get());
       Assert.assertEquals(addressLine3, contact.getAddressLine3().get());
       Assert.assertEquals(addressLine4, contact.getAddressLine4().get());
       Assert.assertEquals(email, contact.getEmail().get());
       Assert.assertEquals(homePhone, contact.getHomePhone().get());
       Assert.assertEquals(mobilePhone, contact.getMobilePhone().get());
       Assert.assertEquals(isoCountryCode, contact.getIsoCountryCode().get());
       Assert.assertEquals(created, contact.getCreated());
       Assert.assertEquals(modified, contact.getModified());
   }

}
