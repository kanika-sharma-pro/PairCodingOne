package io.zipcoder;

import com.sun.org.apache.xpath.internal.operations.Bool;

public class InvestmentAccount extends Account{
    Double interestRate;
    Boolean hasOverdraftProtection;
    public InvestmentAccount(String accountHolder, Double accountNumber, Double accountBalance, String accountEmail, Integer accountPhoneNumber, Boolean hasOverdraftProtection, Double interestRate) {
        super(accountHolder, accountNumber, accountBalance, accountEmail, accountPhoneNumber);
    }


}
