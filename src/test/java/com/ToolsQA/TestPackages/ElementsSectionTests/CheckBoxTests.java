package com.ToolsQA.TestPackages.ElementsSectionTests;

import com.ToolsQA.TestSetupPackages.ElementSectionSetup.CheckBoxSetup;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckBoxTests extends CheckBoxSetup {

    /**
     * This test checks if elements are unchecked:
     * Steps to reproduce:
     * 1. Open url = demoqa.com/checkbox
     * 2. Click on the + button to expand all the elements
     * 3. Assert that list of elements is unchecked
     */
    @Test
    public void isAllBoxesUnchecked() {
        checkBox.expandAll();
        Assert.assertTrue(checkBox.getCheckedList().isEmpty());
    }

    /**
     * This test checks if element with name "Home" is checked
     * Steps to reproduce:
     * 1. Open url demoqa.com/checkbox
     * 2. Click on the "Home" box to check the element
     * 3. Assert that "Home" box is checked
     */
    @Test
    public void isHomeBoxChecked() {
        checkBox.checkBoxByName("Home");
        Assert.assertEquals(checkBox.getCheckedList().size(), 1);
    }

    /**
     * This test checks if list of checked elements is 17 when you click on the Home box after you expand all the elements
     * Steps to reproduce:
     * 1. Open url demoqa.com/checkbox
     * 2. Click on the + button to expand the list
     * 3. Click on the Home box to check all the elements
     * 4. Assert that the size of the checked elements is 17.
     */
    @Test
    public void isSizeOfCheckedElements17() {
        checkBox.expandAll();
        checkBox.checkBoxByName("Home");
        Assert.assertEquals(checkBox.getCheckedList().size(), 17);
    }
}
