package com.ToolsQA.TestSetupPackages.BookStoreSetup;

import com.ToolsQA.BookStoreApplicationSection.BooksPage;
import com.ToolsQA.BookStoreApplicationSection.LoginPage;
import com.ToolsQA.TestSetupPackages.BaseTest;
import commonLibs.implementation.ElementControl;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import java.io.IOException;
import java.time.Duration;

public class BooksPageSetup extends BaseTest {
    protected BooksPage booksPage;
    protected LoginPage login;
    protected WebDriver driver;
    protected ElementControl elementControl;


    @BeforeClass
    @Override
    public void setUpBeforeTestClass() {

    }

    @BeforeMethod
    @Override
    public void setUpBeforeTestMethod() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        booksPage = new BooksPage(driver);
        login = new LoginPage(driver);
        elementControl = new ElementControl(driver);
        driver.get("https://demoqa.com/login");
        login.loginToApplication("markitj", "Sifra6969!");
        Thread.sleep(3000);
    }

    @AfterMethod
    @Override
    public void tearDownAfterTestMethod() throws IOException {
        driver.quit();
    }

    @AfterClass
    @Override
    public void tearDownAfterTestClass() throws IOException {

    }
}
