package com.ToolsQA.ElementsSection;

import com.ToolsQA.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class CheckBox extends BasePage {
    public CheckBox(WebDriver driver) {
        super(driver);
    }

    @FindBy(className = "rct-icon-check")
    List<WebElement> checkedList;
    @FindBy(className = "rct-icon-uncheck")
    List<WebElement> uncheckedList;
    @FindBy(className = "rct-title")
    List<WebElement> listOfElementNames;
    @FindBy(className = "rct-icon-expand-all")
    WebElement expandAll;
    @FindBy(className = "rct-icon-collapse-all")
    WebElement collapseAll;

    /**
     * This method expand the list of elements
     */
    public void expandAll() {
        elementControl.clickElement(expandAll);
    }

    /**
     * This method collapse the list of elements
     */
    public void collapseAll() {
        elementControl.clickElement(collapseAll);
    }

    /**
     * This method clicks the box for which the user previously specified a name
     * @param name Name of the box that user want to check
     */
    public void checkBoxByName(String name) {
        //elementControl.clickElement(expandAll);
        for (WebElement uncheckElement : listOfElementNames) {
            if (uncheckElement.getText().equals(name)) {
                uncheckElement.click();
            }
        }
    }

    public List<WebElement> getUncheckedList() {
        return uncheckedList;
    }

    public List<WebElement> getCheckedList() {
        return checkedList;
    }
}
