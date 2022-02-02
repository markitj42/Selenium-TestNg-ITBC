package com.CandA.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage {

    //login elements
    @FindBy(id = "doNotTrack-header-username")
    public WebElement profileIcon;
    @FindBy(className = "header__user-menu-label-logged-in")
    WebElement profileIconLoggedIn;
    @FindBy(className = "js-email")
    WebElement emailBox;
    @FindBy(className = "cxp-password")
    WebElement passwordBox;
    @FindBy(xpath = "//button[contains(text(),'Log in')]")
    WebElement logInButton;

    @FindBy(className = "my-profile-nav__mail")
    public WebElement myAccMail;

    @FindBy(id = "onetrust-accept-btn-handler")
    WebElement acceptAllCookies;


    //constructor
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    /**
     * This method logs you in on the C&A site
     * @param email user email
     * @param password user password
     */
    public void loginToApplication(String email, String password) throws InterruptedException {
        elementControl.clickElement(acceptAllCookies);
        Thread.sleep(3000);
        elementControl.clickElement(profileIcon);
        elementControl.sendText(emailBox, email);
        elementControl.sendText(passwordBox, password);
        elementControl.clickElement(logInButton);
        elementControl.clickElement(profileIconLoggedIn);
    }
}
