package com.dermotherlihy.account.domain.model;

import com.dermotherlihy.account.infrastructure.jdbc.AccountMapper;
import org.skife.jdbi.v2.sqlobject.Bind;
import org.skife.jdbi.v2.sqlobject.BindBean;
import org.skife.jdbi.v2.sqlobject.SqlQuery;
import org.skife.jdbi.v2.sqlobject.SqlUpdate;
import org.skife.jdbi.v2.sqlobject.customizers.Mapper;
import org.springframework.stereotype.Repository;

import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: dermot.herlihy
 * Date: 21/01/2014
 * Time: 20:00
 * To change this template use File | Settings | File Templates.
 */
@Repository
public interface AccountDAO {

    @SqlUpdate("insert into Account (username, dob, sex, modified, created) values (:username, :dob, :sex, :modified, :created)")
    void insert(@BindBean Account account);

    @SqlQuery("select * from Account where username = :username")
    @Mapper(AccountMapper.class)
    Account findNameByName(@Bind("username") String username);


}
