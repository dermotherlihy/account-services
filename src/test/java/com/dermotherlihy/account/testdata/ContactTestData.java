package com.dermotherlihy.account.testdata;

import com.dermotherlihy.account.domain.model.Contact;
import org.apache.commons.lang.RandomStringUtils;
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: dermot.herlihy
 * Date: 19/03/2014
 * Time: 18:10
 * To change this template use File | Settings | File Templates.
 */
public class ContactTestData {

    public static Contact getTestAccount(){
        DateTimeFormatter dateTimeFormatter = DateTimeFormat.forPattern("yyyy-MM-dd");
        Integer id = Integer.valueOf(2);
        Integer accountId = Integer.valueOf(3);
        String title = "Mrs";
        String firstName= RandomStringUtils.randomAlphabetic(12);
        String middleName= RandomStringUtils.randomAlphabetic(12);
        String surname= RandomStringUtils.randomAlphabetic(12);
        String addressLine1 = RandomStringUtils.random(12);
        String addressLine2 = RandomStringUtils.random(12);;
        String addressLine3 = RandomStringUtils.random(12);;
        String addressLine4 = RandomStringUtils.random(12);;
        String email = RandomStringUtils.random(12)+""+RandomStringUtils.random(6)+".com";
        String homePhone = RandomStringUtils.randomNumeric(8);
        String workPhone = RandomStringUtils.randomNumeric(8);
        String mobilePhone = RandomStringUtils.randomNumeric(8);;
        String isoCountryCode= "IRE";
        Date created = DateTime.now().toDate();
        Date modified= DateTime.parse("2010-12-28", dateTimeFormatter).toDate();

        return new Contact.Builder().setId(id).setTitle(title).setFirstName(firstName).setMiddleName(middleName).setSurname(surname).setModified(modified).setCreated(created).setAccountId(accountId).setAddressLine1(addressLine1).setAddressLine2(addressLine2).setAddressLine3(addressLine3).setAddressLine4(addressLine4)
                .setEmail(email).setHomePhone(homePhone).setMobilePhone(mobilePhone).setWorkPhone(workPhone).setIsoCountryCode(isoCountryCode).build();

    }

}
