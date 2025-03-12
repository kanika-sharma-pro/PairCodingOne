package io.zipcoder;

import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.Test;

public class AccountTest {
    private Account account;
//    @BeforeEach
    public void setUp(){
      account = new BusinessAccount("eddie", 1.0, 500.0, "123@123.com");
    }

    @Test
    public void getBusinessNameTest(){
        setUp();
        //Given
        String expectedBusinessName = "eddie";


        //When
        String actualBusinessName = account.getBusinessName();

        //Then
        Assert.assertEquals(actualBusinessName, expectedBusinessName);
    }

    @Test
    public void getAccountNumberTest(){
        setUp();
        //Given
        Double expectedAccountNumber = 1.0;


        //When
        Double actualAccountNumber = account.getAccountNumber();

        //Then
        Assert.assertEquals(actualAccountNumber, expectedAccountNumber);
    }

    @Test
    public void getAccountEmail(){
        setUp();
        //Given
        String expectedAccountEmail = "123@123.com";


        //When
        String actualAccountEmail = account.getAccountEmail();

        //Then
        Assert.assertEquals(expectedAccountEmail, actualAccountEmail);
    }
    @Test
    public void WithdrawlTest() throws IllegalAccessException {
        setUp();
        account.withDrawl(50.0);
        //Given
        Double expectedAccountBalance = 450.0;


        //When
        Double actualAccountBalance = account.getAccountBalance();

        //Then
        Assert.assertEquals(expectedAccountBalance, actualAccountBalance);
    }
 @Test
    public void DepositTest() throws IllegalAccessException {
        setUp();
        account.deposit(500.0);
        //Given
        Double expectedAccountBalance = 1000.0;


        //When
        Double actualAccountBalance = account.getAccountBalance();

        //Then
        Assert.assertEquals(expectedAccountBalance, actualAccountBalance);
    }







}




