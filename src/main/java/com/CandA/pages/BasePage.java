package com.CandA.pages;

import commonLibs.implementation.ElementControl;
import org.openqa.selenium.WebDriver;

public abstract class BasePage {
    public ElementControl elementControl;
    WebDriver driver;


    public BasePage(WebDriver driver) {
        this.driver = driver;
        elementControl = new ElementControl(driver);
    }

}
