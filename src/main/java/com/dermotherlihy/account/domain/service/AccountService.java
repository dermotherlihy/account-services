package com.dermotherlihy.account.domain.service;

import com.dermotherlihy.account.domain.model.Account;
import com.dermotherlihy.account.domain.model.AccountDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created with IntelliJ IDEA.
 * User: dermot.herlihy
 * Date: 21/01/2014
 * Time: 18:57
 * To change this template use File | Settings | File Templates.
 */
@Service
public class AccountService {

    @Autowired
    private AccountDAO accountDAO;

    public AccountService(AccountDAO accountDAO) {
        this.accountDAO=accountDAO;
    }
    public void insert(Account account){
        accountDAO.insert(account.getId(), account.getUserName());
    }
    public Account getByName(String name){
        return accountDAO.findNameByName(name);
    }

}
