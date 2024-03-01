package org.springproject.springjdbcdao;

import java.util.List;

public interface AccountDao {
    int save(Account account);

    int update(Account account);
    Account selectOne(int accountNo);

    List<Account> selectAll();

    int delete(int accountNo);
}
