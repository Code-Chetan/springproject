package org.springproject.aop.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;
import org.springproject.aop.Model.Account;

import java.sql.ResultSet;
import java.util.List;

@Repository
public class AccountDaoImpl implements AccountDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    //For Inserting new record
    @Transactional(isolation = Isolation.SERIALIZABLE)
    @Override
    public int save(Account account) {
        String query="INSERT INTO account(accountName,accountType) VALUES(?,?)";
        return jdbcTemplate.update(query, account.getAccountName(), account.getAccountType());
    }

    //For Update the existing record
    @Transactional
    @Override
    public int update(Account account) {
       String query="UPDATE account SET accountType=? WHERE accountNo=?";
       return jdbcTemplate.update(query,account.getAccountType(),account.getAccountNo());
    }

    //For selecting(fetching) record from DB
    @Override
    public Account selectOne(int accountNo) {
        String query="SELECT * FROM account where accountNo=?";

        Account account1 = jdbcTemplate.queryForObject(query, (ResultSet rs, int rowNo) -> {
            Account account = new Account();
            account.setAccountNo(rs.getInt(1));
            account.setAccountName(rs.getString(2));
            account.setAccountType(rs.getString(3));
            return account;
        }, accountNo);
        return account1;
    }

    //For selecting all rows from DB
    @Override
    public List<Account> selectAll() {
        String query="select * from account";

        RowMapper rowMapper=new RowMapperImpl();
        List<Account> results = jdbcTemplate.query(query, rowMapper);
        return results;
    }

    //For delete record
    @Transactional
    @Override
    public int delete(int accountNo) {
       String query="delete from account where accountNo=?";

        int result = jdbcTemplate.update(query, accountNo);
        return result;
    }

    @Override
    public void getDemoException(){

            throw new ArithmeticException("Arithmetic exception has occured");

    }
}
