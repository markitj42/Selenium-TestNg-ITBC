package com.ToolsQA.TestPackages.StudentRegFormTests;

import com.ToolsQA.TestSetupPackages.StudentRegFormSetup.StudentRegFormSetup;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class StudentRegFormTest extends StudentRegFormSetup {

    @Parameters({"firstName", "lastName", "email", "gender", "month", "year", "day", "subject", "hobie", "path", "currentAddress", "state", "city"})
    @Test
    public void enteringDataToRegForm(String firstName, String lastName, String email, String gender, String month, String year, String day, String subject, String hobie,
                                      String path, String currentAddress, String state, String city) {
        studentRegistrationForm.enterFullName(firstName, lastName);
        studentRegistrationForm.enterEmail(email);
        studentRegistrationForm.selectGender(gender);
        studentRegistrationForm.dateOfBirthSelection(month, year, day);
        //studentRegistrationForm.enterSubject(subject);
        studentRegistrationForm.selectHobie(hobie);
        //studentRegistrationForm.uploadPicture(path);
        studentRegistrationForm.selectCurrentAddress(currentAddress);
        //studentRegistrationForm.selectState(state);
        //studentRegistrationForm.selectCity(city);
        studentRegistrationForm.clickSubmitButton();
    }
}
