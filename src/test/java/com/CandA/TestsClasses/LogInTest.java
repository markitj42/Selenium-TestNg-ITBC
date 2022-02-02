package com.CandA.TestsClasses;


import com.CandA.TestSetupClasses.LoginSetup;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class LogInTest extends LoginSetup {

    /**
     * TestCase
     * 
     * @throws InterruptedException
     */
    @Parameters ({"email", "password"})
    @Test
    public void logInHappyPath(String email, String password) throws InterruptedException {
        logIn.loginToApplication(email, password);
        Assert.assertEquals(elementControl.getTextFromElement(logIn.myAccMail), "offendor1000@gmail.com");
    }

}
