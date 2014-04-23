package com.dermotherlihy.account.infrastructure.jdbc;
import com.dermotherlihy.account.domain.model.Contact;
import com.dermotherlihy.account.jdbc.mapper.ContactMapper;
import com.dermotherlihy.account.testdata.ContactTestData;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.skife.jdbi.v2.StatementContext;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created with IntelliJ IDEA.
 * User: dermot.herlihy
 * Date: 19/03/2014
 * Time: 18:09
 * To change this template use File | Settings | File Templates.
 */
public class ContactMapperUTest {

    private ContactMapper testObj = new ContactMapper();

    @Mock
    private StatementContext statementContext;

    @Before
    public void beforeTest(){
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testContactRowMapper() throws Exception{
        Contact testContact = ContactTestData.getTestAccount();
        ResultSet testResultSet = getTestContactResultSet(testContact);
        Contact contact = testObj.mapRow(testResultSet,0);
        Assert.assertEquals(testContact.getId(), contact.getId());
        Assert.assertEquals(testContact.getAccountId(), contact.getAccountId());
        Assert.assertEquals(testContact.getFirstName(), contact.getFirstName());
        Assert.assertEquals(testContact.getMiddleName().get(), contact.getMiddleName().get());
        Assert.assertEquals(testContact.getSurname(), contact.getSurname());
        Assert.assertEquals(testContact.getHomePhone().get(), contact.getHomePhone().get());
        Assert.assertEquals(testContact.getWorkPhone().get(), contact.getWorkPhone().get());
        Assert.assertEquals(testContact.getMobilePhone().get(), contact.getMobilePhone().get());
        Assert.assertEquals(testContact.getAddressLine1().get(), contact.getAddressLine1().get());
        Assert.assertEquals(testContact.getAddressLine2().get(), contact.getAddressLine2().get());
        Assert.assertEquals(testContact.getAddressLine3().get(), contact.getAddressLine3().get());
        Assert.assertEquals(testContact.getAddressLine4().get(), contact.getAddressLine4().get());
        Assert.assertEquals(testContact.getPostcode().get(), contact.getPostcode().get());
        Assert.assertEquals(testContact.getIsoCountryCode().get(), contact.getIsoCountryCode().get());
        Assert.assertEquals(testContact.getEmail().get(), contact.getEmail().get());
        Assert.assertEquals(testContact.getCreated(), contact.getCreated());
        Assert.assertEquals(testContact.getModified(), contact.getModified());
    }

    private ResultSet getTestContactResultSet(Contact testAccount) throws SQLException {
        ResultSet resultSetMock = Mockito.mock(ResultSet.class);
        Mockito.when(resultSetMock.next()).thenReturn(true).thenReturn(false);
        Mockito.when(resultSetMock.getInt("ID")).thenReturn(testAccount.getId());
        Mockito.when(resultSetMock.getInt("ACCOUNT_ID")).thenReturn(testAccount.getAccountId());
        Mockito.when(resultSetMock.getString("TITLE")).thenReturn(testAccount.getTitle().get());
        Mockito.when(resultSetMock.getString("FIRST_NAME")).thenReturn(testAccount.getFirstName());
        Mockito.when(resultSetMock.getString("MIDDLE_NAME")).thenReturn(testAccount.getMiddleName().get());
        Mockito.when(resultSetMock.getString("SURNAME")).thenReturn(testAccount.getSurname());
        Mockito.when(resultSetMock.getString("HOME_PHONE")).thenReturn(testAccount.getHomePhone().get());
        Mockito.when(resultSetMock.getString("WORK_PHONE")).thenReturn(testAccount.getWorkPhone().get());
        Mockito.when(resultSetMock.getString("MOBILE_PHONE")).thenReturn(testAccount.getMobilePhone().get());
        Mockito.when(resultSetMock.getString("HOME_PHONE")).thenReturn(testAccount.getHomePhone().get());
        Mockito.when(resultSetMock.getString("ADDRESS_LINE_1")).thenReturn(testAccount.getAddressLine1().get());
        Mockito.when(resultSetMock.getString("ADDRESS_LINE_2")).thenReturn(testAccount.getAddressLine2().get());
        Mockito.when(resultSetMock.getString("ADDRESS_LINE_3")).thenReturn(testAccount.getAddressLine3().get());
        Mockito.when(resultSetMock.getString("ADDRESS_LINE_4")).thenReturn(testAccount.getAddressLine4().get());
        Mockito.when(resultSetMock.getString("POSTCODE")).thenReturn(testAccount.getPostcode().get());
        Mockito.when(resultSetMock.getString("COUNTRY_ISO_CODE")).thenReturn(testAccount.getIsoCountryCode().get());
        Mockito.when(resultSetMock.getString("EMAIL")).thenReturn(testAccount.getEmail().get());
        Mockito.when(resultSetMock.getDate("CREATED")).thenReturn(new java.sql.Date(testAccount.getCreated().getTime()));
        Mockito.when(resultSetMock.getDate("MODIFIED")).thenReturn(new java.sql.Date(testAccount.getModified().getTime()));
        return resultSetMock;
    }
}
