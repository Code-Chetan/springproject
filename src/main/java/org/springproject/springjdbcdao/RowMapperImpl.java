package org.springproject.springjdbcdao;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component
public class RowMapperImpl implements RowMapper<Account> {
    @Override
    public Account mapRow(ResultSet rs, int rowNum) throws SQLException {
        Account account = new Account();
        account.setAccountNo(rs.getInt(1));
        account.setAccountName(rs.getString(2));
        account.setAccountType(rs.getString(3));
        return account;
    }
}
