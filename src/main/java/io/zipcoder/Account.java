package io.zipcoder;

import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.ArrayList;

public abstract class Account {
    private String accountHolder;
    private Double accountNumber;
    private Double accountBalance;
    private Boolean buisnessAcoount;
    private ArrayList<Transaction>  transactionHistory = new ArrayList<>();

        public Account(String accountHolder, Double accountNumber, Double accountBalance, Boolean buisnessAcoount, Transaction transactionHistory){
            this.accountHolder = accountHolder;
            this.accountBalance = accountBalance;
            this.accountNumber = accountNumber;
           // this.transactionHistory = Transaction transactionHistory;
        }

    public String getAccountHolder() {
        return accountHolder;
    }

    public Double getAccountBalance() {
        return accountBalance;
    }
    public Boolean getBuisnessAcoount() {
        return buisnessAcoount;
    }

    public void setAccountBalance(Double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public Double getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(Double accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }
}
