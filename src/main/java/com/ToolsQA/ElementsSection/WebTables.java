package com.ToolsQA.ElementsSection;

import com.ToolsQA.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class WebTables extends BasePage {

    public WebTables(WebDriver driver) {
        super(driver);
    }

    /**
     * Elements for filling up web table.
     */
    @FindBy(id = "addNewRecordButton")
    WebElement addButton;
    @FindBy(id = "firstName")
    WebElement firstName;
    @FindBy(id = "lastName")
    WebElement lastName;
    @FindBy(id = "userEmail")
    WebElement userEmail;
    @FindBy(id = "age")
    WebElement userAge;
    @FindBy(id = "salary")
    WebElement userSalary;
    @FindBy(id = "department")
    WebElement userDepartment;
    @FindBy(id = "submit")
    WebElement submitButton;

    @FindBy(className = "rt-tr-group")
    public List<WebElement> listOfUsers;

    @FindBy(id = "delete-record-4")
    WebElement deleteButton;

    /**
     * This method add a new user, fill up the web table form and submit user to the table.
     * @param name User name
     * @param surName User last name
     * @param email User email
     * @param age User age
     * @param salary User salary
     * @param department User department
     */
    public void fillRegistrationForm(String name, String surName, String email, String age, String salary, String department) {
        clickAddButton();

        enterFirstName(name);
        enterLastName(surName);
        enterEmail(email);
        enterAge(age);
        enterSalary(salary);
        enterDepartment(department);

        clickSubmitButton();
    }

    public void deleteAddedUser() {
        elementControl.clickElement(deleteButton);
        }

    // These methods click on the web elements separately

    public void clickAddButton() {
        elementControl.clickElement(addButton);
    }
    public void clickSubmitButton() {
        elementControl.clickElement(submitButton);
    }

    public void enterFirstName(String name) {
        elementControl.sendText(firstName, name);
    }
    public void enterLastName(String surName) {
        elementControl.sendText(lastName, surName);
    }
    public void enterEmail(String email) {
        elementControl.sendText(userEmail, email);
    }
    public void enterAge(String age) {
        elementControl.sendText(userAge, age);
    }
    public void enterSalary(String salary) {
        elementControl.sendText(userSalary, salary);
    }
    public void enterDepartment(String department) {
        elementControl.sendText(userDepartment, department);
    }
}
