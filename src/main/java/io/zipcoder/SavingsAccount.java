package io.zipcoder;

public class SavingsAccount extends Account{
    public SavingsAccount(String accountHolder, Double accountNumber, Double accountBalance, String accountEmail, Integer accountPhoneNumber,Double interestRate, Boolean hasOverdraftProtection) {
        super(accountHolder, accountNumber, accountBalance, accountEmail, accountPhoneNumber);

    }

    public double calculateInterest(){
        return this.interestRate * this.getAccountBalance();
    }

    public Double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(Double interestRate) {
        this.interestRate = interestRate;
    }

    public Boolean getHasOverdraftProtection() {
        return hasOverdraftProtection;
    }

    public void setHasOverdraftProtection(Boolean hasOverdraftProtection) {
        this.hasOverdraftProtection = hasOverdraftProtection;
    }
}
