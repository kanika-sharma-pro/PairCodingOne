package io.zipcoder;

public class SavingsAccount extends Account {
    Double savingsBalance;

    public SavingsAccount(String accountHolder, Double accountNumber, Double accountBalance, String accountEmail, Integer accountPhoneNumber, Double interestRate, Boolean hasOverdraftProtection, Double savingsBalance) {
        super(accountHolder, accountNumber, accountBalance, accountEmail, accountPhoneNumber);
        this.savingsBalance = savingsBalance;

    }

    public double calculateInterest() {
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

    public Double getSavingsBalance() {
        return savingsBalance;
    }

    public void savingsDeposit(Double amount) {

            if (amount < 0) {
                throw new IllegalArgumentException("deposit cannot be negative");
            } else {
                savingsBalance += amount;



        }
    }

        public void savingsWithD(Double amount) throws IllegalArgumentException {
            if (!this.hasOverdraftProtection) {
                if (amount > savingsBalance - 100.00) {
                    throw new IllegalArgumentException("Withdraw limit");
                } else {
                    savingsBalance -= amount;
                }


            }


        }



}
