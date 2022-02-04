package com.ToolsQA.TestsPackages.BookStoreTests;


import com.ToolsQA.TestSetupPackages.BookStoreSetup.LoginPageSetup;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class LogInTest extends LoginPageSetup {

    /**
     * TestCase
     * 
     * @throws InterruptedException
     */
    @Parameters ({"email", "password"})
    @Test
    public void logInHappyPath(String email, String password) throws InterruptedException {

    }

}
