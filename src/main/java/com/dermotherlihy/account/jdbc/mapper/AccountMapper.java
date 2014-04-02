package com.dermotherlihy.account.jdbc.mapper;

import com.dermotherlihy.account.domain.model.Account;
import org.skife.jdbi.v2.StatementContext;
import org.skife.jdbi.v2.tweak.ResultSetMapper;
import org.springframework.jdbc.core.simple.ParameterizedRowMapper;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created with IntelliJ IDEA.
 * User: dermot.herlihy
 * Date: 06/02/2014
 * Time: 19:21
 * To change this template use File | Settings | File Templates.
 */
public class AccountMapper implements ParameterizedRowMapper<Account> {

    @Override
    public Account mapRow(ResultSet resultSet, int i) throws SQLException {
        Integer id= resultSet.getInt("ID");
        String userName= resultSet.getString("USERNAME");
        String sex= resultSet.getString("SEX");
        Date dob= resultSet.getDate("DOB");
        Date created = resultSet.getDate("CREATED");
        Date modified =resultSet.getDate("MODIFIED");
        return new Account.Builder().setId(id).setUsername(userName).setSex(sex).setDob(dob).setCreated(created).setModified(modified).build();
    }
}
