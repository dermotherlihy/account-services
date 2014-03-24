package com.dermotherlihy.account.jdbi;

import com.dermotherlihy.account.domain.model.Account;
import com.dermotherlihy.account.domain.model.Contact;
import com.dermotherlihy.account.jdbi.mapper.AccountMapper;
import com.dermotherlihy.account.jdbi.mapper.ContactMapper;
import org.skife.jdbi.v2.sqlobject.Bind;
import org.skife.jdbi.v2.sqlobject.BindBean;
import org.skife.jdbi.v2.sqlobject.SqlQuery;
import org.skife.jdbi.v2.sqlobject.SqlUpdate;
import org.skife.jdbi.v2.sqlobject.customizers.Mapper;

/**
 * Created with IntelliJ IDEA.
 * User: dermot.herlihy
 * Date: 12/03/2014
 * Time: 19:03
 * To change this template use File | Settings | File Templates.
 */
public interface ContactDAO {

    @SqlUpdate("insert into contact (account_id, title, first_name, middle_name, surname, home_phone, work_phone, mobile_phone, address_line_1, address_line_2, address_line_3, address_line_4, postcode, country_iso_code, email) values " +
                                   "(:accountId, :title, :firstName, :middleName, :surname, :homePhone, :workPhone, :mobilePhone, :addressLine1, :addressLine2, :addressLine3, :addressLine4, :postcode, :isoCountryCode, :email)")
    void insert(@BindBean Contact contact);

    @SqlQuery("select * from contact where id = :id")
    @Mapper(ContactMapper.class)
    Contact findContactById(@Bind("id") Integer id);
}
