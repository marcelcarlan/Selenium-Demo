package tests;

import generators.EmailRandomGenerator;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import utilities.AbstractTest;

import java.util.concurrent.TimeUnit;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;


public class LinkedinRegistrationTest extends AbstractTest {

    public WebDriver driver;

    @Test
    public void testRegistration() throws InterruptedException {
        driver.get("https://www.linkedin.com/signup/cold-join");

        emailComponent.setValue(driver, EmailRandomGenerator.nonValid());

        joinButtonComponent.clickButton(driver);

        assertFalse(emailComponent.isValid(driver));

        emailComponent.setValue(driver, EmailRandomGenerator.valid());

        TimeUnit.SECONDS.sleep(5);

        joinButtonComponent.clickButton(driver);

        assertTrue(emailComponent.isValid(driver));


    }

    @BeforeClass
    public void beforeClass() {
        driver = getDriverFactory().getDriver();


    }

    @AfterClass
    public void afterClass() {
        driver.quit();
    }

}
