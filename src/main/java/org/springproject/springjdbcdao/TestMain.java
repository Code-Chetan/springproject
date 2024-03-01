package org.springproject.springjdbcdao;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestMain {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext("org.springproject.springjdbcdao");

        AccountDao accountDaoImpl = applicationContext.getBean("accountDaoImpl", AccountDao.class);

        Account account1=new Account();

    //    account1.setAccountName("ICICI Bank Account");
     //   account1.setAccountType("Current");

     //   int result = accountDaoImpl.save(account1);
     //   System.out.println(result +" row inserted");

        Account account = accountDaoImpl.selectOne(2);
        System.out.println(account);

     //   Account account2=new Account();
     //   account2.setAccountType("Demat");
     //   account2.setAccountNo(1);

     //   int result1 = accountDaoImpl.update(account2);
     //   System.out.println(result1 + " row updated");

    //    System.out.println(accountDaoImpl.selectAll());

     //   System.out.println(accountDaoImpl.delete(1));
    }
}
