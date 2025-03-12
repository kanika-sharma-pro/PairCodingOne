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
}
