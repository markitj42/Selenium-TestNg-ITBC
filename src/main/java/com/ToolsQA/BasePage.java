package com.ToolsQA;

import commonLibs.implementation.ElementControl;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {
    public ElementControl elementControl;
    protected WebDriver driver;


    public BasePage(WebDriver driver) {
        this.driver = driver;
        elementControl = new ElementControl(driver);
        PageFactory.initElements(driver, this);
    }

}
