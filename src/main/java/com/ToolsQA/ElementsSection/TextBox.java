package com.ToolsQA.ElementsSection;

import com.ToolsQA.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TextBox extends BasePage {

    public TextBox(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "userName")
    public WebElement fullNameBox;
    @FindBy(id = "userEmail")
    WebElement emailBox;
    @FindBy(id = "currentAddress")
    WebElement currentAddress;
    @FindBy(id = "permanentAddress")
    WebElement permanentAddress;
    @FindBy(id = "submit")
    WebElement submitButton;
    @FindBy(className = "border")
    public WebElement boxWithData;

    /** This method enters all the data in the Text Box Elements section and click submit button
     *
     * @param fullName Full name
     * @param userEmail User email
     * @param cAddress Current address
     * @param pAddress Permanent Address
     */
    public void enterDataInTextBox(String fullName, String userEmail, String cAddress, String pAddress) {
        elementControl.sendText(fullNameBox, fullName);
        elementControl.sendText(emailBox, userEmail);
        elementControl.sendText(currentAddress, cAddress);
        elementControl.sendText(permanentAddress, pAddress);
        elementControl.clickElement(submitButton);
    }

    // this method enters full name
    public void enterFullName(String name) {
        elementControl.sendText(fullNameBox, name);
    }

    // this method enters user email
    public void enterEmail(String email) {
        elementControl.sendText(emailBox, email);
    }

    // this method enters current address
    public void enterCurrentAddress(String address) {
        elementControl.sendText(currentAddress, address);
    }

    // this method enters permanent address
    public void enterPermanentAddress(String address) {
        elementControl.sendText(permanentAddress, address);
    }

    // this method clicks submit button
    public void clickSubmitButton() {
        elementControl.clickElement(submitButton);
    }
}
