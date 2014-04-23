package com.dermotherlihy.account.jdbc;

import com.dermotherlihy.account.domain.model.Account;
import com.dermotherlihy.account.jdbc.mapper.AccountMapper;
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
public interface AccountDAO {
    void insert(@BindBean Account account);
    Account findNameByUsername(@Bind("username") String username);
    Account findById(Integer id);

}
