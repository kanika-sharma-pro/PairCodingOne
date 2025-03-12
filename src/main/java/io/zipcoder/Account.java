package io.zipcoder;


import java.util.ArrayList;

public abstract class Account {
    private String accountHolder = " ";
    private String businessName;
    private Double accountNumber;
    private Double accountBalance;
    private String accountEmail;
    private Integer accountPhoneNumber;
    Boolean hasOverdraftProtection;
    private ArrayList<Transaction>  transactionHistory = new ArrayList<>();


        //personal Account
        public Account(String accountHolder, Double accountNumber, Double accountBalance, String accountEmail, Integer accountPhoneNumber){
            this.accountHolder = accountHolder;
            this.accountBalance = accountBalance;
            this.accountNumber = accountNumber;
            this.accountEmail = accountEmail;
            this.accountPhoneNumber = accountPhoneNumber;
        }
        //business account
        public Account(String businessName, Double accountNumber, Double accountBalance, String accountEmail){
            this.businessName = businessName;
            this.accountBalance = accountBalance;
            this.accountNumber = accountNumber;
            this.accountEmail = accountEmail;
        }

    public Account(String string) {
            this.accountHolder = string;
    }


    //checking account
//        public Account(String accountHolder, Double accountNumber, Double accountBalance, String accountEmail, Integer accountPhoneNumber, Boolean hasOverdraftProtection){
//
//        }

    public String getAccountHolder() {
        return this.accountHolder;
    }

    public Double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(Double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public String getBusinessName() {
        return businessName;
    }

    public void setBusinessName(String businessName) {
        this.businessName = businessName;
    }

    public String getAccountEmail() {
        return accountEmail;
    }

    public void setAccountEmail(String accountEmail) {
        this.accountEmail = accountEmail;
    }

    public Integer getAccountPhoneNumber() {
        return accountPhoneNumber;
    }

    public void setAccountPhoneNumber(Integer accountPhoneNumber) {
        this.accountPhoneNumber = accountPhoneNumber;
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
