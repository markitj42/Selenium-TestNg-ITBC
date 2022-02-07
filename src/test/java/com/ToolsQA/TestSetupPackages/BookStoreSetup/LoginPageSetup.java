package com.ToolsQA.TestSetupPackages.BookStoreSetup;

import com.ToolsQA.BookStoreApplicationSection.LoginPage;
import com.ToolsQA.TestSetupPackages.BaseTest;
import commonLibs.implementation.ElementControl;
import commonLibs.implementation.SetupDriver;
import enums.DriverType;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import java.io.IOException;

public class LoginPageSetup extends BaseTest {
    protected SetupDriver setupDriver;
    protected LoginPage logIn;
    protected WebDriver driver;
    protected ElementControl elementControl;

    @BeforeClass
    @Override
    public void setUpBeforeTestClass() {
        setupDriver = new SetupDriver(DriverType.CHROME);
    }

    @BeforeMethod
    @Override
    public void setUpBeforeTestMethod() {
        driver = setupDriver.getDriver();
        logIn = new LoginPage(driver);
        setupDriver.navigateToUrl("https://demoqa.com/login");
        elementControl = new ElementControl(driver);
    }

    @AfterMethod
    @Override
    public void tearDownAfterTestMethod() throws IOException {

    }

    @AfterClass
    @Override
    public void tearDownAfterTestClass() throws IOException {
        setupDriver.closeAllBrowsers();
    }
}
