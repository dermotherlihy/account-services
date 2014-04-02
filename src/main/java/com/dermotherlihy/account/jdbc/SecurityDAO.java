package com.dermotherlihy.account.jdbc;

import org.springframework.stereotype.Repository;

/**
 * Created with IntelliJ IDEA.
 * User: dermot.herlihy
 * Date: 27/03/2014
 * Time: 19:39
 * To change this template use File | Settings | File Templates.
 */
@Repository
public interface SecurityDAO {

    void insert(int accountId, String password);
    String findPasswordByAccountId(int accountId);

}


