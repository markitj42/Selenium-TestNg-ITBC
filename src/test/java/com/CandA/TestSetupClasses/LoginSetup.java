package com.CandA.TestSetupClasses;

import com.CandA.pages.LoginPage;
import commonLibs.implementation.ElementControl;
import commonLibs.implementation.SetupDriver;
import enums.DriverType;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import java.io.IOException;

public class LoginSetup extends BaseTest {
    protected SetupDriver setupDriver;
    protected LoginPage logIn;
    protected String url;
    protected WebDriver driver;
    protected ElementControl elementControl;

    @BeforeClass
    @Override
    public void setUpBeforeTestClass() {
    }

    @BeforeMethod
    @Override
    public void setUpBeforeTestMethod() {
        url = "https://www.c-and-a.com/eu/en/shop";
        setupDriver = new SetupDriver(DriverType.CHROME);
        driver = setupDriver.getDriver();
        logIn = new LoginPage(driver);
        elementControl = new ElementControl(driver);
        setupDriver.navigateToUrl(url);
    }

    @AfterMethod
    @Override
    public void tearDownAfterTestMethod() throws IOException {
        setupDriver.closeAllBrowsers();
    }

    @AfterClass
    @Override
    public void tearDownAfterTestClass() {
    }
}
