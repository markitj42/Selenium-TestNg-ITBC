package com.ToolsQA.TestPackages.BookStoreTests;


import com.ToolsQA.TestSetupPackages.BookStoreSetup.LoginPageSetup;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class LogInTest extends LoginPageSetup {

    /**
     * HappyPath test
     * This test check login functionality with valid parameters
     * Steps to reproduce:
     * 1. Open url "https://demoqa.com/login"
     * 2. Enter valid username and password
     * 3. Click Login button
     * 4. Assert that user is logged in
     * @param userName User name
     * @param password User password
     */
    @Parameters ({"userName", "password"})
    @Test
    public void loginToBookStore(String userName, String password) {
        logIn.loginToApplication(userName, password);
        Assert.assertEquals(logIn.getUserNameValue(), userName);
    }

}
