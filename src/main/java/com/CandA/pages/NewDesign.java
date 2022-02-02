package com.CandA.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewDesign extends BasePage{

    @FindBy(className = "cxpbanner__slider--switch-to-cxp")
    WebElement acceptButton;
    @FindBy(name = "Let's go")
    WebElement letsGoButton;

    @FindBy(className = "cxpbanner__close-modal")
    WebElement declineButton;
    @FindBy(xpath = "//a[contains(text(),'To the old online store')]")
    WebElement toTheOldStore;

    public NewDesign(WebDriver driver) {
        super(driver);
    }

    public void testNewPageDesign() {
        elementControl.clickElement(acceptButton);
    }

    public void dontTestNewPageDesign() {
        elementControl.clickElement(toTheOldStore);
    }

    //TODO smisliti sta uraditi sa pop up new design kad iskoci
}
