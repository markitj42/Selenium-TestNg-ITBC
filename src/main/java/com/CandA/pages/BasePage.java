package com.CandA.pages;

import commonLibs.implementation.ElementControl;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {
    public ElementControl elementControl;
    WebDriver driver;


    public BasePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        elementControl = new ElementControl(driver);
    }

}
