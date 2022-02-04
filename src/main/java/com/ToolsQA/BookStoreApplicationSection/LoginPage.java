package com.ToolsQA.BookStoreApplicationSection;

import com.ToolsQA.BasePage;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {

    //login elements



    //constructor
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    /**
     * This method logs you in on the BookStore
     * @param email user email
     * @param password user password
     */
    public void loginToApplication(String email, String password) {

    }
}
