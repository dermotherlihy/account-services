package com.dermotherlihy.account.domain.model;

import com.dermotherlihy.account.infrastructure.jdbc.AccountMapper;
import org.skife.jdbi.v2.sqlobject.Bind;
import org.skife.jdbi.v2.sqlobject.SqlQuery;
import org.skife.jdbi.v2.sqlobject.SqlUpdate;
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

    @SqlUpdate("insert into Account (id, name) values (:id, :name)")
    void insert(@Bind("id") int id, @Bind("name") String name);

    @SqlQuery("select name from Account where id = :id")
    @Mapper(AccountMapper.class)
    Account findNameByName(@Bind("name") String name);


}
