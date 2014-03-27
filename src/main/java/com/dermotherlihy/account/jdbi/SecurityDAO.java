package com.dermotherlihy.account.jdbi;

import com.dermotherlihy.account.domain.model.Account;
import com.dermotherlihy.account.jdbi.mapper.AccountMapper;
import org.skife.jdbi.v2.sqlobject.*;
import org.skife.jdbi.v2.sqlobject.customizers.Mapper;

/**
 * Created with IntelliJ IDEA.
 * User: dermot.herlihy
 * Date: 27/03/2014
 * Time: 19:39
 * To change this template use File | Settings | File Templates.
 */
public interface SecurityDAO {

    @Transaction
    @SqlUpdate("insert into account_password(account_id, password) values (:accountId, :password)")
    void insert(@Bind int accountId, @Bind String password);

    @SqlQuery("select password from account_password where account_id = :accountId")
    String findPasswordByAccountId(@Bind int accountId);

}


