package io.zipcoder;
import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SavingsTest {

    private SavingsAccount savingsAccount;
    //    @BeforeEach
    public void setUp(){ savingsAccount = new SavingsAccount("eddie", 1.0, 500.0, "123@123.com", 12345, 2.0, true, 500.0);
    }
   @Test
    public void savingsDepositTest(){
    setUp();
    savingsAccount.savingsDeposit(50.0);
    //Given
    Double expectedSavingsBalance = 550.0;


    //When
    Double actualSavingsBalance = savingsAccount.getSavingsBalance();

    //Then
        Assert.assertEquals(actualSavingsBalance, expectedSavingsBalance);
}
    @Test
    public void savingsWithdrawTest(){
        setUp();
        savingsAccount.savingsWithD(50.0);
        //Given
        Double expectedSavingsBalance = 450.0;


        //When
        Double actualSavingsBalance = savingsAccount.getSavingsBalance();

        //Then
        Assert.assertEquals(actualSavingsBalance, expectedSavingsBalance);
    }

    @Test
    public void savingsWithdrawTest1(){
        setUp();
        savingsAccount.savingsWithD(620.0);
        //Given

        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            savingsAccount.deposit(150.0);
        });

        String expectedMessage = "Withdraw Limit";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));
        assertEquals(0.0, savingsAccount.getSavingsBalance()); // Balance should remain unchanged
    }



}




















