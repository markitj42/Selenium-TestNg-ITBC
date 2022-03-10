package com.ToolsQA.BookStoreApplicationSection;

import com.ToolsQA.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

    //login elements
    @FindBy(id = "userName")
    WebElement uName;
    @FindBy(id = "password")
    WebElement pass;
    @FindBy(id = "login")
    WebElement loginButton;
    @FindBy(id = "userName-value")
    WebElement userNameValue;
    @FindBy(id = "name")
    public WebElement invalidMessage;
    @FindBy(xpath = "//button[contains(text(),'Log out')]")
    public WebElement logOutButton;

    //constructor
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    /**
     * This method logs you in on the BookStore
     * @param userName User name
     * @param password user password
     */
    public void loginToApplication(String userName, String password) {
        elementControl.sendText(uName, userName);
        elementControl.sendText(pass, password);
        elementControl.clickElement(loginButton);
    }

    public String getUserNameValue() {
        return elementControl.getTextFromElement(userNameValue);
    }

    public String getInvalidMessage() {
        return elementControl.getTextFromElement(invalidMessage);
    }

}
