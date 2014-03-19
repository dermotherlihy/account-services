package com.dermotherlihy.account.jdbi.mapper;

import com.dermotherlihy.account.domain.model.Account;
import com.dermotherlihy.account.domain.model.Contact;
import com.google.common.base.Optional;
import org.skife.jdbi.v2.StatementContext;
import org.skife.jdbi.v2.tweak.ResultSetMapper;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created with IntelliJ IDEA.
 * User: dermot.herlihy
 * Date: 19/03/2014
 * Time: 18:09
 * To change this template use File | Settings | File Templates.
 */
public class ContactMapper implements ResultSetMapper<Contact> {

    @Override
    public Contact map(int i, ResultSet resultSet, StatementContext statementContext) throws SQLException {

        Integer id = resultSet.getInt("ID");
        Integer accountId = resultSet.getInt("ACCOUNT_ID");
        String title = resultSet.getString("TITLE");
        String firstName=resultSet.getString("FIRST_NAME");
        String middleName= resultSet.getString("MIDDLE_NAME");
        String surname=resultSet.getString("SURNAME");
        String addressLine1= resultSet.getString("ADDRESS_LINE_1");
        String addressLine2= resultSet.getString("ADDRESS_LINE_2");
        String addressLine3= resultSet.getString("ADDRESS_LINE_3");
        String addressLine4= resultSet.getString("ADDRESS_LINE_4");
        String email= resultSet.getString("EMAIL");
        String homePhone= resultSet.getString("HOME_PHONE");
        String workPhone= resultSet.getString("WORK_PHONE");
        String mobilePhone= resultSet.getString("MOBILE_PHONE");
        String isoCountryCode= resultSet.getString("COUNTRY_ISO_CODE");
        Date created=resultSet.getDate("CREATED");
        Date modified=resultSet.getDate("MODIFIED");

        Contact contact = new Contact.Builder().setAccountId(accountId).setId(id).setTitle(title).setFirstName(firstName).setMiddleName(middleName).setSurname(surname).setAddressLine1(addressLine1).setAddressLine2(addressLine2).
                setAddressLine3(addressLine3).setAddressLine4(addressLine4).setEmail(email).setHomePhone(homePhone).setMobilePhone(mobilePhone).setWorkPhone(workPhone).setIsoCountryCode(isoCountryCode).setCreated(created).setModified(modified).build();
        return contact;
     }

}
