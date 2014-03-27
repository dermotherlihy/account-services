package com.dermotherlihy.account.domain.service;

import com.dermotherlihy.account.domain.model.Account;
import com.dermotherlihy.account.jdbi.AccountDAO;
import com.dermotherlihy.account.jdbi.SecurityDAO;
import org.eclipse.jetty.util.security.Credential;
import org.skife.jdbi.v2.sqlobject.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * Created with IntelliJ IDEA.
 * User: dermot.herlihy
 * Date: 21/01/2014
 * Time: 18:57
 * To change this template use File | Settings | File Templates.
 */
@Service
public class AccountService {

    private AccountDAO accountDAO;

    private SecurityDAO securityDAO;

    public AccountService(AccountDAO accountDAO, SecurityDAO securityDAO) {
        this.securityDAO=securityDAO;
        this.accountDAO=accountDAO;
    }

    @Transaction
    public Account insert(Account account) throws NoSuchAlgorithmException {
        accountDAO.insert(account);
        Account createdAccount= accountDAO.findNameByUsername(account.getUsername());
        MessageDigest messageDigest = MessageDigest.getInstance("MD5");
        String digestedPassword= new String(messageDigest.digest(account.getPassword().getBytes()));
        securityDAO.insert(createdAccount.getId(), digestedPassword);
        return createdAccount;
    }

    public Account findByUsername(String username){
        return accountDAO.findNameByUsername(username);
    }

    public Account findById(String id) {
        return accountDAO.findById(id);
    }
}
