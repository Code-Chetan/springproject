package org.springproject.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springproject.aop.Model.Account;
import org.springproject.aop.dao.AccountDao;

public class TestMain {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext("org.springproject.aop");

        AccountDao accountDaoImpl = applicationContext.getBean("accountDaoImpl", AccountDao.class);

        Account account1=new Account();

     //   account1.setAccountName("Axis Bank Account");
     //   account1.setAccountType("Loan Account");

     //   int result = accountDaoImpl.save(account1);
     //   System.out.println(result +" row inserted");

        Account account = accountDaoImpl.selectOne(2);
        System.out.println(account);

     //   Account account2=new Account();
     //   account2.setAccountType("Credit Card Account");
     //   account2.setAccountNo(9);

     //   int result1 = accountDaoImpl.update(account2);
     //   System.out.println(result1 + " row updated");

    //    System.out.println(accountDaoImpl.selectAll());

     //   System.out.println(accountDaoImpl.delete(1));

      //  accountDaoImpl.getDemoException();
    }
}
