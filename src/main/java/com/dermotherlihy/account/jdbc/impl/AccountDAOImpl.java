package com.dermotherlihy.account.jdbc.impl;

import com.dermotherlihy.account.domain.model.Account;
import com.dermotherlihy.account.jdbc.AccountDAO;
import com.dermotherlihy.account.jdbc.mapper.AccountMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * Created with IntelliJ IDEA.
 * User: dermot.herlihy
 * Date: 02/04/2014
 * Time: 19:29
 * To change this template use File | Settings | File Templates.
 */
@Repository
public class AccountDAOImpl implements AccountDAO{

    @Autowired
    private NamedParameterJdbcTemplate jdbcTemplate;

    @Override
    public void insert(Account account) {
        String sql =  "insert into Account (username, dob, sex) values (:username, :dob, :sex)";
        MapSqlParameterSource paramMap = new MapSqlParameterSource();
        paramMap.addValue("username", account.getUsername());
        paramMap.addValue("dob", account.getDob());
        paramMap.addValue("sex", account.getSex().getCode());

        jdbcTemplate.update(sql, paramMap);
    }

    @Override
    public Account findNameByUsername(String username) {
        String sql = "select * from Account where username = :username";

        MapSqlParameterSource paramMap = new MapSqlParameterSource();
        paramMap.addValue("username", username);

        return jdbcTemplate.queryForObject(sql,paramMap,new AccountMapper());
   }

    @Override
    public Account findById(String id) {
        String sql = "select * from Account where id = :id";

        MapSqlParameterSource paramMap = new MapSqlParameterSource();
        paramMap.addValue("id", id);

        return jdbcTemplate.queryForObject(sql,paramMap,new AccountMapper());
     }
}
