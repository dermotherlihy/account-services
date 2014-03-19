package com.dermotherlihy.account.domain.service;

import com.dermotherlihy.account.domain.model.Account;
import com.dermotherlihy.account.domain.model.Contact;
import com.dermotherlihy.account.jdbi.AccountDAO;
import com.dermotherlihy.account.jdbi.ContactDAO;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created with IntelliJ IDEA.
 * User: dermot.herlihy
 * Date: 12/03/2014
 * Time: 19:16
 * To change this template use File | Settings | File Templates.
 */
public class ContactService {

    private ContactDAO contactDAO;

    public ContactService(ContactDAO contactDAO) {
        this.contactDAO=contactDAO;
    }
    public void insert(Contact contact){
        contactDAO.insert(contact);
    }

    public Contact findContactById(Integer contactId) {
        return contactDAO.findContactById(contactId);
    }
}
