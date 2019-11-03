package tests;

import generators.EmailRandomGenerator;
import generators.PasswordRandomGenerator;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import utilities.AbstractTest;

import static org.testng.Assert.assertEquals;
import static utilities.Urls.LINKEDIN_SIGN_UP;

public class PasswordFieldTest extends AbstractTest {

    public WebDriver driver;

    @DataProvider
    public static Object[][] dataProvider() {

        return new Object[][]{
                {LINKEDIN_SIGN_UP.getValue(), PasswordRandomGenerator.nonValid(), false},
                {LINKEDIN_SIGN_UP.getValue(), "", false},
                {LINKEDIN_SIGN_UP.getValue(), PasswordRandomGenerator.valid(), true}
        };
    }

    @Test(dataProvider = "dataProvider")
    public void testRegistration(String url, String value, boolean isValid) {
        driver.get(url);

        emailComponent.setValue(driver, EmailRandomGenerator.valid());

        passwordComponent.setValue(driver, value);

        joinButtonComponent.clickButton(driver);

        assertEquals(passwordComponent.isValid(driver), isValid);
    }

    @BeforeMethod
    public void beforeClass() {
        driver = getDriverFactory().getDriver();
    }

    @AfterMethod
    public void afterClass() {
        driver.quit();
    }
}
