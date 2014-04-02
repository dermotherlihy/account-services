package com.dermotherlihy.account.domain.service;

import com.dermotherlihy.account.domain.model.Contact;
import com.dermotherlihy.account.jdbc.ContactDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created with IntelliJ IDEA.
 * User: dermot.herlihy
 * Date: 12/03/2014
 * Time: 19:16
 * To change this template use File | Settings | File Templates.
 */
@Service
public class ContactService {

    @Autowired
    private ContactDAO contactDAO;


    public void insert(Contact contact){
        contactDAO.insert(contact);
    }

    public Contact findContactById(Integer contactId) {
        return contactDAO.findContactById(contactId);
    }
}
