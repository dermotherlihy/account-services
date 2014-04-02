package com.dermotherlihy.account.jdbc.impl;

import com.dermotherlihy.account.jdbc.SecurityDAO;
import org.skife.jdbi.v2.sqlobject.Bind;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * Created with IntelliJ IDEA.
 * User: dermot.herlihy
 * Date: 02/04/2014
 * Time: 19:30
 * To change this template use File | Settings | File Templates.
 */
@Repository
public class SecurityDAOImpl implements SecurityDAO{

    @Autowired
    private NamedParameterJdbcTemplate jdbcTemplate;



    @Override
    public void insert(int accountId, String password) {

        String sql = "insert into account_password(account_id, password) values (:accountId, :password)";
        MapSqlParameterSource paramMap = new MapSqlParameterSource();
        paramMap.addValue("accountId", accountId);
        paramMap.addValue("password", password);
        jdbcTemplate.update(sql, paramMap);
    }

    @Override
    public String findPasswordByAccountId(int accountId) {

        String sql = "select password from account_password where account_id = :accountId";
        MapSqlParameterSource paramMap = new MapSqlParameterSource();
        paramMap.addValue("accountId",accountId);
        return jdbcTemplate.queryForObject(sql, paramMap, String.class);
    }
}
