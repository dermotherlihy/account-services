package com.dermotherlihy.account.jdbi;

import com.dermotherlihy.account.domain.model.Account;
import com.dermotherlihy.account.jdbi.mapper.AccountMapper;
import org.skife.jdbi.v2.sqlobject.*;
import org.skife.jdbi.v2.sqlobject.customizers.Mapper;
import org.springframework.stereotype.Repository;

/**
 * Created with IntelliJ IDEA.
 * User: dermot.herlihy
 * Date: 21/01/2014
 * Time: 20:00
 * To change this template use File | Settings | File Templates.
 */
@Repository
public interface AccountDAO {

    @Transaction
    @SqlUpdate("insert into Account (username, dob, sex) values (:username, :dob, :sex)")
    void insert(@BindBean Account account);


    @SqlQuery("select * from Account where username = :username")
    @Mapper(AccountMapper.class)
    Account findNameByUsername(@Bind("username") String username);

    @SqlQuery("select * from Account where id = :id")
    @Mapper(AccountMapper.class)
    Account findById(String id);

}
