package com.ToolsQA.TestPackages.ElementsSectionTests;

import com.ToolsQA.TestSetupPackages.ElementSectionSetup.TextBoxSetup;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TextBoxTests extends TextBoxSetup {


    /**
     * Happy path test
     * This test enters all the available data, and checks the output results
     * Steps to reproduce:
     * 1. Navigate to "https://demoqa.com/text-box"
     * 2. Fill the form with valid data
     * 3. Click submit button
     * 4. Assert that all the data is shown below
     *
     * Expected results: all the data is shown below the text form
     *
     * Bug found - JIRA NI-7
     *
     * @param name User Full name
     * @param email User email
     * @param currentAddress User current address
     * @param permaAddress User permanent address
     */
    @Parameters({"name", "email", "currentAddress", "permaAddress"})
    @Test(priority = 0)
    public void textBoxEnteringAllData(String name, String email, String currentAddress, String permaAddress) {

        textBox.enterDataInTextBox(name, email, currentAddress, permaAddress);

        String actualText = elementControl.getTextFromElement(textBox.boxWithData);
        String expectedText = """
                Name:Marko Ilic
                Email:ilic@gmail.com
                Current Address :Nebeska420
                Permanent Address :Devilska69""";

        Assert.assertEquals(actualText, expectedText);
    }

    /**
     * Happy path test
     * This test enters just a user full name and checks if the output is matching
     * Steps to reproduce:
     * 1. Navigate to "https://demoqa.com/text-box"
     * 2. Fill the username box
     * 3. Click submit button
     * 4. Assert that just the full name of the user appeared in the output box
     *
     * Expected results: just name should appear in the output box
     *
     * @param name Full name of the user
     */
    @Parameters({"name"})
    @Test(priority = 1)
    public void entersFullName(String name) {

        textBox.enterFullName(name);
        textBox.clickSubmitButton();

        String expectedText = "Name:Marko Ilic";

        Assert.assertEquals(elementControl.getTextFromElement(textBox.boxWithData), expectedText);
    }

    /**
     * Happy path test
     * This test enters just a permanent address and checks out the output data
     * Steps to reproduce:
     * 1. Navigate to "https://demoqa.com/text-box"
     * 2. Enters permanent address
     * 3. Click submit button
     * 4. Assert that just the permanent address appear in the output box
     *
     * Expected results: Just the permanent address is appeared in the output box
     *
     * Bug found - JIRA NI-7
     * @param permaAddress User permanent address
     */
    @Parameters({"permaAddress"})
    @Test(priority = 2)
    public void entersPermanentAddress(String permaAddress) {

        textBox.enterPermanentAddress(permaAddress);
        textBox.clickSubmitButton();

        Assert.assertEquals(elementControl.getTextFromElement(textBox.boxWithData), "Permanent Address :Devilska69");

    }
}
