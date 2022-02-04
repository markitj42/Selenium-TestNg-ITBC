package com.ToolsQA.TestPackages.ElementsSectionTests;

import com.ToolsQA.TestSetupPackages.ElementSectionSetup.TextBoxSetup;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TextBoxTests extends TextBoxSetup {

    @Parameters({"name", "email", "currentAddress", "permaAddress"})
    @Test(priority = 0)
    public void textBoxHappyPath(String name, String email, String currentAddress, String permaAddress) {

        textBox.enterDataInTextBox(name, email, currentAddress, permaAddress);

        String actualText = elementControl.getTextFromElement(textBox.boxWithData);
        String expectedText = """
                Name:Marko Ilic
                Email:ilic@gmail.com
                Current Address :Nebeska420
                Permanent Address :Devilska69""";

        Assert.assertEquals(actualText, expectedText);
    }

    @Parameters({"fullName"})
    @Test(priority = 1)
    public void entersFullName(String fullName) {

        textBox.enterFullName(fullName);
        textBox.clickSubmitButton();

        String expectedText = "Name:Marko Ilic";

        Assert.assertEquals(elementControl.getTextFromElement(textBox.boxWithData), expectedText);
    }

    @Parameters({"permAddress"})
    @Test(priority = 2)
    public void entersPermanentAddress(String permAddress) {

        textBox.enterPermanentAddress(permAddress);
        textBox.clickSubmitButton();

        Assert.assertEquals(elementControl.getTextFromElement(textBox.boxWithData), "Permanent Address :Gagarinova69");

    }
}
