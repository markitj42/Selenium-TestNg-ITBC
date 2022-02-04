package com.ToolsQA.TestSetupPackages.ElementSectionSetup;

import com.ToolsQA.ElementsSection.WebTables;
import com.ToolsQA.TestSetupPackages.BaseTest;
import commonLibs.implementation.SetupDriver;
import enums.DriverType;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;

import java.io.IOException;

public class WebTablesSetup extends BaseTest {
    private SetupDriver setupDriver;
    protected WebTables webTables;
    protected WebDriver driver;

    @BeforeClass
    @Override
    public void setUpBeforeTestClass() {
        setupDriver = new SetupDriver(DriverType.CHROME);
    }

    @BeforeMethod
    @Override
    public void setUpBeforeTestMethod() {
        setupDriver.navigateToUrl("https://demoqa.com/webtables");
        driver = setupDriver.getDriver();
        webTables = new WebTables(driver);
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
