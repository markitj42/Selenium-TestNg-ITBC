package com.ToolsQA.TestPackages.ElementsSectionTests;


import com.ToolsQA.TestSetupPackages.ElementSectionSetup.WebTablesSetup;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class WebTablesTests extends WebTablesSetup {

    /**
     * Happy path test
     *  This Test adds user to the table and checks if the user is added
     *  Steps to reproduce:
     *  1. Open url "demoqa.com/webtables"
     *  2. Add 1 user
     *  3. Assert that user is added.
     *
     *  Expected results: User is added to the table
     *
     * @param firstName First name of user
     * @param lastName Last name of user
     * @param email Email of user
     * @param age Age of user
     * @param salary Salary of user
     * @param department Department of user
     */
    @Parameters({"firstName", "lastName", "email", "age", "salary", "department"})
    @Test
    public void addingNewUser(String firstName, String lastName, String email, String age, String salary, String department) {

        webTables.fillRegistrationForm(firstName, lastName, email, age, salary, department);

        Assert.assertTrue(driver.getPageSource().contains(firstName));
        Assert.assertTrue(driver.getPageSource().contains(lastName));
    }

    /**
     * Happy path test
     *  This Test adds user, after that user is deleted, test checks if the user is deleted.
     *  Steps to reproduce:
     *  1. Open url "demoqa.com/webtables"
     *  2. Add 1 user
     *  3. Delete that user
     *  4. Assert that added user is deleted
     *
     *  Expected results: user is deleted from the table
     *
     * @param firstName First name of user
     * @param lastName Last name of user
     * @param email Email of user
     * @param age Age of user
     * @param salary Salary of user
     * @param department Department of user
     */
    @Parameters({"firstName", "lastName", "email", "age", "salary", "department"})
    @Test
    public void deleteAddedUser(String firstName, String lastName, String email, String age, String salary, String department) {
        webTables.fillRegistrationForm(firstName, lastName, email, age, salary, department);
        webTables.deleteAddedUser();
        Assert.assertFalse(driver.getPageSource().contains(firstName));
    }
}
