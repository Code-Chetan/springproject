package org.springproject.aop.dao;

import org.springproject.aop.Model.Account;

import java.util.List;

public interface AccountDao {
    int save(Account account);

    int update(Account account);
    Account selectOne(int accountNo);

    List<Account> selectAll();

    int delete(int accountNo);

    public void getDemoException();
}
