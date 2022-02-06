package com.ToolsQA.TestSetupPackages.StudentRegFormSetup;

import com.ToolsQA.PracticeForm.StudentRegistrationForm;
import com.ToolsQA.TestSetupPackages.BaseTest;
import commonLibs.implementation.SetupDriver;
import enums.DriverType;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import java.io.IOException;

public class StudentRegFormSetup extends BaseTest {
    protected StudentRegistrationForm studentRegistrationForm;
    protected SetupDriver setupDriver;
    protected WebDriver driver;

    @BeforeClass
    @Override
    public void setUpBeforeTestClass() {
        setupDriver = new SetupDriver(DriverType.CHROME);
    }

    @BeforeMethod
    @Override
    public void setUpBeforeTestMethod() throws InterruptedException {
        setupDriver.navigateToUrl("https://demoqa.com/automation-practice-form");
        driver = setupDriver.getDriver();
        studentRegistrationForm = new StudentRegistrationForm(driver);
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
