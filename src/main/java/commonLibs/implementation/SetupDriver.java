package commonLibs.implementation;

import enums.DriverType;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.IOException;
import java.time.Duration;

public class SetupDriver {
    private WebDriver driver;
    private int pageLoadTime;
    private int elementDetectionTimeout;

    public SetupDriver(DriverType browserType) {
            pageLoadTime = 10;
            elementDetectionTimeout = 10;

            switch (browserType) {
                case CHROME -> {
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
                }
                case FIREFOX -> {
                    WebDriverManager.firefoxdriver().setup();
                    driver = new FirefoxDriver();
                }
                case EDGE -> {
                    WebDriverManager.edgedriver().setup();
                    driver = new EdgeDriver();
                }
            }
            driver.manage().window().maximize();
            driver.manage().deleteAllCookies();

        }

    public void navigateToUrl(String url) {
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(pageLoadTime));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(elementDetectionTimeout));
        driver.get(url);
    }

    public void closeAllBrowsers() throws IOException {
        driver.quit();
        //Runtime.getRuntime().exec("taskkill /F /IM chromedriver.exe /T");
    }

    public void closeBrowser() {
        driver.close();
    }

    public void setPageLoadTime(int pageLoadTime) {
        this.pageLoadTime = pageLoadTime;
    }

    public void setElementDetectionTimeout(int elementDetectionTimeout) {
        this.elementDetectionTimeout = elementDetectionTimeout;
    }

    public WebDriver getDriver() {
        return driver;
    }

    public String getTitleOfPage() {
        return driver.getTitle();
    }
}
