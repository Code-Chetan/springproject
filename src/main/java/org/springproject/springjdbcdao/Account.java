package org.springproject.springjdbcdao;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Account {

    private int accountNo;
    private String accountName;
    private String accountType;
}
