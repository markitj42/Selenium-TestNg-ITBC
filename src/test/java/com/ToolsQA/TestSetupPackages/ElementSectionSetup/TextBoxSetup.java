package com.ToolsQA.TestSetupPackages.ElementSectionSetup;

import com.ToolsQA.ElementsSection.TextBox;
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

public class TextBoxSetup extends BaseTest {
     private SetupDriver setupDriver;
     protected TextBox textBox;
     String url;
     WebDriver driver;
     public ElementControl elementControl;


    @BeforeClass
    @Override
    public void setUpBeforeTestClass() {
        setupDriver = new SetupDriver(DriverType.CHROME);
    }

    @BeforeMethod
    @Override
    public void setUpBeforeTestMethod() {
        url = "https://demoqa.com/text-box";
        setupDriver.navigateToUrl(url);
        driver = setupDriver.getDriver();
        textBox = new TextBox(driver);
        elementControl = new ElementControl(driver);
    }

    @AfterMethod
    @Override
    public void tearDownAfterTestMethod() throws IOException {
    //setupDriver.closeBrowser();
    }

    @AfterClass
    @Override
    public void tearDownAfterTestClass() throws IOException {
        setupDriver.closeAllBrowsers();
    }
}
