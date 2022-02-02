package com.CandA.TestSetupClasses;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import java.io.IOException;

public abstract class BaseTest {

    @BeforeClass
    public abstract void setUpBeforeTestClass();

    @BeforeMethod
    public abstract void setUpBeforeTestMethod();

    @AfterMethod
    public abstract void tearDownAfterTestMethod() throws IOException;

    @AfterClass
    public abstract void tearDownAfterTestClass();
}
