package com.ToolsQA.TestSetupPackages.ElementSectionSetup;

import com.ToolsQA.ElementsSection.CheckBox;
import com.ToolsQA.TestSetupPackages.BaseTest;
import commonLibs.implementation.SetupDriver;
import enums.DriverType;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import java.io.IOException;

public class CheckBoxSetup extends BaseTest {
    private SetupDriver setupDriver;
    protected CheckBox checkBox;
    private WebDriver driver;

    @BeforeClass
    @Override
    public void setUpBeforeTestClass() {
        setupDriver = new SetupDriver(DriverType.CHROME);
    }

    @BeforeMethod
    @Override
    public void setUpBeforeTestMethod() {
        setupDriver.navigateToUrl("https://demoqa.com/checkbox");
        driver = setupDriver.getDriver();
        checkBox = new CheckBox(driver);

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
