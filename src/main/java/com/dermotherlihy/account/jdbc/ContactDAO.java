package com.dermotherlihy.account.jdbc;

import com.dermotherlihy.account.domain.model.Contact;
import com.dermotherlihy.account.jdbc.mapper.ContactMapper;
import org.skife.jdbi.v2.sqlobject.Bind;
import org.skife.jdbi.v2.sqlobject.BindBean;
import org.skife.jdbi.v2.sqlobject.SqlQuery;
import org.skife.jdbi.v2.sqlobject.SqlUpdate;
import org.skife.jdbi.v2.sqlobject.customizers.Mapper;
import org.springframework.stereotype.Repository;

/**
 * Created with IntelliJ IDEA.
 * User: dermot.herlihy
 * Date: 12/03/2014
 * Time: 19:03
 * To change this template use File | Settings | File Templates.
 */
@Repository
public interface ContactDAO {

    void insert(@BindBean Contact contact);

    Contact findContactById(@Bind("id") Integer id);
}
