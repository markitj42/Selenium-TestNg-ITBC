package commonLibs.implementation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class ElementControl {
    WebDriver driver;

    public ElementControl(WebDriver driver) {
        this.driver = driver;
    }

    public void clickElement(WebElement element) {
        element.click();
    }

    public void clearElement(WebElement element) {
        element.clear();
    }

    public void sendText(WebElement element, String text) {
        element.sendKeys(text);
    }

    public String getTextFromElement(WebElement element) {
        return element.getText();
    }

    public boolean isEnabled(WebElement element) {
        return element.isEnabled();
    }

    public boolean isDisplayed(WebElement element) {
        return element.isDisplayed();
    }

    public void acceptAlert() {
        driver.switchTo().alert().accept();
    }

    public String getTextFromAlert() {
        return driver.switchTo().alert().getText();
    }

    public void selectViaVisibleText(WebElement element, String text) {
        Select dropDown = new Select(element);
        dropDown.selectByVisibleText(text);
    }

    public void selectByValue(WebElement element, String value) {
        Select dropDown = new Select(element);
        dropDown.selectByValue(value);
    }

    public void hoverOverElement(WebElement element) {
        Actions hover = new Actions(driver);
        hover.moveToElement(element).build().perform();
    }
    public void clickOnHoveredElement(WebElement element) {
        Actions hover = new Actions(driver);
        hover.moveToElement(element).click().build().perform();
    }

}
