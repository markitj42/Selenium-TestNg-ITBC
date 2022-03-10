package com.ToolsQA.TestPackages.StudentRegFormTests;

import com.ToolsQA.TestSetupPackages.StudentRegFormSetup.StudentRegFormSetup;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class StudentRegFormTest extends StudentRegFormSetup {

    /**
     * Happy path test
     * This test fill up Student registration form and checks if the confirmation message is shown at the end of the test.
     * Steps to reproduce:
     * 1. Navigate to url "https://demoqa.com/automation-practice-form"
     * 2. Enter the registration form
     * 3. Click submit button
     * 4. Assert that confirmation message is shown at the screen
     *
     * Expected results: Confirmation message is shown at the screen
     * @param firstName User first name
     * @param lastName User last name
     * @param email User email
     * @param gender User gender
     * @param number User mobile number
     * @param month User month of birth
     * @param year User year of birth
     * @param day User day of birth
     * @param hobie User hobie
     * @param path Path to the picture to upload
     * @param currentAddress User current address
     */
    @Parameters({"firstName", "lastName", "email", "gender", "number", "month", "year", "day", "hobie", "path", "currentAddress"})
    @Test
    public void enteringDataToRegForm(String firstName, String lastName, String email, String gender, String number, String month, String year, String day, String hobie,
                                      String path, String currentAddress) {
        studentRegistrationForm.enterFullName(firstName, lastName);
        studentRegistrationForm.enterEmail(email);
        studentRegistrationForm.selectGender(gender);
        studentRegistrationForm.enterNumber(number);
        studentRegistrationForm.dateOfBirthSelection(month, year, day);
        studentRegistrationForm.selectHobie(hobie);
        studentRegistrationForm.uploadPicture(path);
        studentRegistrationForm.selectCurrentAddress(currentAddress);
        studentRegistrationForm.clickSubmitButton();

        Assert.assertEquals(studentRegistrationForm.confirmationMssg.getText(), "Thanks for submitting the form", "Message should be 'Thanks for submitting the form'");
    }
}
