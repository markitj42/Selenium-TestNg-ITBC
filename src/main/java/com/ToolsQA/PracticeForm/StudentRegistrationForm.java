package com.ToolsQA.PracticeForm;

import com.ToolsQA.BasePage;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class StudentRegistrationForm extends BasePage {

    public StudentRegistrationForm(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "firstName")
    WebElement firstName;
    @FindBy(id = "lastName")
    WebElement lastName;
    @FindBy(id = "userEmail")
    WebElement userEmail;
    @FindBy(id = "userNumber")
    WebElement userNumber;
    @FindBy(className = "custom-control")
    List<WebElement> listOfGenders;

    @FindBy(id = "dateOfBirthInput")
    WebElement dateOfBirth;
    @FindBy(className = "react-datepicker__month-select")
    WebElement monthPick;
    @FindBy(className = "react-datepicker__year-select")
    WebElement yearPick;
    @FindBy(className = "react-datepicker__week")
    List<WebElement> weekPicker;
    @FindBy(className = "react-datepicker__day")
    List<WebElement> dayPicker;

    @FindBy(xpath = "//div[@id='subjectsContainer']")
    WebElement subject;
    @FindBy(className = "subjects-auto-complete__menu")
    List<WebElement> suggestions;

    @FindBy(className = "custom-checkbox")
    List<WebElement> hobbiesList;

    @FindBy(id = "uploadPicture")
    WebElement uploadPicture;

    @FindBy(id = "currentAddress")
    WebElement currentAddress;

    @FindBy(xpath = "//div[@id='state']")
    WebElement state;
    @FindBy(className = "css-2613qy-menu")
    WebElement states;
    @FindBy(xpath = "//div[@id='city']")
    WebElement city;

    @FindBy(id = "submit")
    WebElement submitButton;
    @FindBy(id = "example-modal-sizes-title-lg")
    public WebElement confirmationMssg;

    /**
     * This method enters user First name and Last name
     * @param name User first name
     * @param surName User last name
     */
    public void enterFullName(String name, String surName) {
        elementControl.sendText(firstName, name);
        elementControl.sendText(lastName, surName);
    }

    /**
     * This method enters user email address
     * @param email User email address
     */
    public void enterEmail(String email) {
        elementControl.sendText(userEmail, email);
    }

    /**
     *  this method clicks on the gender based on the name we pass to it. We can enter "female", "male" or "other"
     * @param gender Type of gender
     */
    public void selectGender(String gender) {
        for (WebElement element : listOfGenders) {
            if (element.getText().toLowerCase().equals(gender)) {
                element.click();
                return;
            }
        }
    }

    /**
     * This method enters user number based on the string you pass to the method
     * @param number User mobile number
     */
    public void enterNumber(String number) {
        elementControl.sendText(userNumber, number);
    }

    /**
     * This method select date of birth by entering month, year and then day
     * @param month Month of birth
     * @param year Year of birth
     * @param day Day of birth
     */
    public void dateOfBirthSelection(String month, String year, String day) {
        elementControl.clickElement(dateOfBirth);
        elementControl.selectViaVisibleText(monthPick, month);
        elementControl.selectViaVisibleText(yearPick, year);

        for (WebElement weeks : weekPicker) {
            for (WebElement days : dayPicker) {
                String currentDay = days.getText();
                if (currentDay.equals(day)) {
                    elementControl.clickElement(days);
                    return;
                }
            }
        }
    }

    /**
     * This method select subject based on the text you enter. It goes through the list of suggestions.
     * @param subjectText Name of the subject
     */
    public void enterSubject(String subjectText) {
        elementControl.clickElement(subject);
        elementControl.sendText(subject,subjectText);

        for (WebElement element : suggestions) {
            if (element.getText().equalsIgnoreCase("english")) {
                element.click();
            }
        }
    }

    /**
     * This method select the hobie based on the parameter you pass to the method
     * @param nameOfHobie Name of hobie
     */
    public void selectHobie(String nameOfHobie) {
        for (WebElement element : hobbiesList) {
            if (element.getText().toLowerCase().equals(nameOfHobie)) {
                element.click();
            }
        }
    }

    /**
     * This method uploads picture based on the path you pass to the method.
     * @param path Path to the picture
     */
    public void uploadPicture(String path) {
        elementControl.sendText(uploadPicture, path);
    }

    /**
     * This method select current address based on the string we pass to the method
     * @param currAddress Name of the current address
     */
    public void selectCurrentAddress(String currAddress) {
        elementControl.sendText(currentAddress, currAddress );
    }

    /**
     * This method select state based on the String you pass to the method / Options: (NCR, Uttar Pradesh, Haryana, Rajasthan)
     * @param statee Name of the State
     */
    public void selectState(String statee) {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", state);
        elementControl.clickElement(state);
        elementControl.selectViaVisibleText(states, statee);
    }

    /**
     * This method select city based on the String you pass to the Method.
     * @param cityy Name of the city
     */
    public void selectCity(String cityy) {
        elementControl.clickOnHoveredElement(city);
        elementControl.selectViaVisibleText(city, cityy);
    }

    /**
     * This method click on the submit button to finish Student Registration form.
     */
    public void clickSubmitButton() {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", submitButton);
        elementControl.clickOnHoveredElement(submitButton);
    }

    //TODO SELECT CITY AND STATE, UPLOAD PHOTO, SELECT SUBJECT AND ADD MOBILE NUMBER

}
