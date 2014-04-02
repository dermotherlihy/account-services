package com.dermotherlihy.account.jdbc.impl;

import com.dermotherlihy.account.domain.model.Contact;
import com.dermotherlihy.account.jdbc.ContactDAO;
import com.dermotherlihy.account.jdbc.mapper.ContactMapper;
import org.skife.jdbi.v2.sqlobject.Bind;
import org.skife.jdbi.v2.sqlobject.BindBean;
import org.skife.jdbi.v2.sqlobject.SqlQuery;
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
public class ContactDAOImpl implements ContactDAO{

    @Autowired
    private NamedParameterJdbcTemplate jdbcTemplate;


    @Override
    public void insert(Contact contact) {
        String sql =  " insert into contact (account_id, title, first_name, middle_name, surname, home_phone, work_phone, mobile_phone, address_line_1, address_line_2, address_line_3, address_line_4, postcode, country_iso_code, email) values " +
                "(:accountId, :title, :firstName, :middleName, :surname, :homePhone, :workPhone, :mobilePhone, :addressLine1, :addressLine2, :addressLine3, :addressLine4, :postcode, :isoCountryCode, :email)";

        MapSqlParameterSource paramMap = new MapSqlParameterSource();

        paramMap.addValue("account_id", contact.getAccountId());
        paramMap.addValue("title", contact.getTitle());
        paramMap.addValue("first_name", contact.getFirstName());
        paramMap.addValue("middle_name", contact.getMiddleName());
        paramMap.addValue("surname", contact.getSurname());
        paramMap.addValue("home_phone", contact.getHomePhone());
        paramMap.addValue("work_phone", contact.getWorkPhone());
        paramMap.addValue("mobile_phone", contact.getMobilePhone());
        paramMap.addValue("address_line_1", contact.getAddressLine1());
        paramMap.addValue("address_line_2", contact.getAddressLine2());
        paramMap.addValue("address_line_3", contact.getAddressLine3());
        paramMap.addValue("address_line_4", contact.getAddressLine4());
        paramMap.addValue("postcode", contact.getPostcode());
        paramMap.addValue("country_iso_code", contact.getIsoCountryCode());
        paramMap.addValue("email", contact.getEmail());

        jdbcTemplate.update(sql, paramMap);


    }

    @Override
    public Contact findContactById(Integer id) {
        String sql = "select * from contact where id = :id";
        MapSqlParameterSource paramMap = new MapSqlParameterSource();
        paramMap.addValue("id", id);
        return jdbcTemplate.queryForObject(sql,paramMap, new ContactMapper());
    }


}
