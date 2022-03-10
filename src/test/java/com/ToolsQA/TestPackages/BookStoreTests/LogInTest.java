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
     *
     * 1. Open url "https://demoqa.com/login"
     * 2. Enter valid username and password
     * 3. Click Login button
     * 4. Assert that user is logged in
     *
     * Expected results: Profile page is shown
     * @param userName User name
     * @param password User password
     */
    @Parameters ({"userName", "password"})
    @Test
    public void loginToBookStore(String userName, String password) {
        logIn.loginToApplication(userName, password);
        Assert.assertEquals(logIn.getUserNameValue(), userName);
        elementControl.clickElement(logIn.logOutButton);
    }

    /**
     * Unhappy path test
     * This test is trying to log in with invalid credentials (password)
     * Steps to reproduce:
     *
     * 1. Open url "https://demoqa.com/login
     * 2. Enter a valid username and invalid password (in this case correct password is "Sifra6969!" we just enters first letter as lowercase "sifra6969!")
     * 3. Assert that alert message is shown, that says "Invalid username or password!"
     *
     * Expected results: Invalid message is shown on the screen
     * Test failing - bug found - Jira NI8
     *
     */
    @Test
    public void loginToBookStoreWithInvalidPassword() {
        logIn.loginToApplication("markitj", "sifra6969!");
        Assert.assertTrue(driver.getPageSource().contains("Invalid username or password!"));
        elementControl.clickElement(logIn.logOutButton);
    }

    /**
     * Unhappy path test
     * This test is trying to log in with invalid credentials (password)
     * Steps to reproduce:
     *
     * 1. Open url "https://demoqa.com/login
     * 2. Enter invalid username and valid password
     * 3. Assert that alert message is shown, that says "Invalid username or password!"
     *
     * Expected results: Invalid message should be shown on the screen
     */
    @Test
    public void loginToBookStoreWithInvalidUserName() {
        logIn.loginToApplication("maaaaarkitj", "Sifra6969!");
        Assert.assertEquals(logIn.invalidMessage.getText(), "Invalid username or password!");
    }

}
