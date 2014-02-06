package com.dermotherlihy.account.infrastructure.jdbc;

import com.dermotherlihy.account.domain.model.Account;
import com.dermotherlihy.account.infrastructure.jdbc.AccountMapper;

import com.dermotherlihy.account.testdata.AccountTestData;
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
 * Date: 06/02/2014
 * Time: 19:24
 * To change this template use File | Settings | File Templates.
 */
public class AccountMapperUTest {

    private AccountMapper testObj = new AccountMapper();

    @Mock
    private StatementContext statementContext;

    @Before
    public void beforeTest(){
        MockitoAnnotations.initMocks(this);
    }
    @Test
    public void testAccountRowMapper() throws Exception{
       Account testAccount = new AccountTestData().getTestAccount();
       Account account = testObj.map(0,getTestAccountResultSet(testAccount),statementContext);
       Assert.assertEquals(testAccount.getId(), account.getId());
       Assert.assertEquals(testAccount.getUserName(), account.getUserName());
    }
    private ResultSet getTestAccountResultSet(Account testAccount) throws SQLException {
        ResultSet resultSetMock = Mockito.mock(ResultSet.class);
        Mockito.when(resultSetMock.next()).thenReturn(true).thenReturn(false);
        Mockito.when(resultSetMock.getString("id")).thenReturn(""+testAccount.getId());
        Mockito.when(resultSetMock.getString("name")).thenReturn(testAccount.getUserName());
        return resultSetMock;
    }

}
