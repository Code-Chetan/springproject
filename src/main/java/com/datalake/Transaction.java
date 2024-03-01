package com.datalake;

import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class Transaction {
    private int transactionId;

    private double transactionAmount;

    private LocalDate transactionDate;

    public Transaction() {
        this.transactionId = 324;
        this.transactionAmount = 50674;
        this.transactionDate = LocalDate.now();
    }

  public void getTransactionDetails(){
      System.out.println("Transaction Id :" + transactionId + "TransactionAmount: "
              + transactionAmount + "Transaction Date: "+ transactionDate);
  }
}
