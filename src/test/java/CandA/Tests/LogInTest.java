package CandA.Tests;

import CandA.MidClasses.LoginSetup;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LogInTest extends LoginSetup {

    /**
     * TestCase
     * 
     * @throws InterruptedException
     */
    @Test
    public void logInHappyPath() throws InterruptedException {
        logIn.loginToApplication("offendor1000@gmail.com", "Sifra6969!");
        Assert.assertEquals(elementControl.getTextFromElement(logIn.myAccMail), "offendor1000@gmail.com");
    }
}
