package com.dermotherlihy.account.infrastructure.jdbc;

import com.dermotherlihy.account.domain.model.Account;
import org.skife.jdbi.v2.StatementContext;
import org.skife.jdbi.v2.tweak.ResultSetMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created with IntelliJ IDEA.
 * User: dermot.herlihy
 * Date: 06/02/2014
 * Time: 19:21
 * To change this template use File | Settings | File Templates.
 */
public class AccountMapper implements ResultSetMapper<Account>{


    @Override
    public Account map(int i, ResultSet resultSet, StatementContext statementContext) throws SQLException {
        String id= resultSet.getString("id");
        String name= resultSet.getString("name");
        return new Account.Builder().setId(Integer.valueOf(id)).setUserName(name).build();
    }
}
