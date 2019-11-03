package tests;

import generators.EmailRandomGenerator;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import utilities.AbstractTest;

import static org.testng.Assert.assertEquals;
import static utilities.Urls.LINKEDIN_SIGN_UP;

public class EmailFieldTest extends AbstractTest {

    public WebDriver driver;

    @DataProvider
    public static Object[][] dataProvider() {

        return new Object[][]{
                {LINKEDIN_SIGN_UP.getValue(), EmailRandomGenerator.nonValid(), false},
                {LINKEDIN_SIGN_UP.getValue(), "", false},
                {LINKEDIN_SIGN_UP.getValue(), EmailRandomGenerator.valid(), true}
        };
    }

    @Test(dataProvider = "dataProvider")
    public void testRegistration(String url, String value, boolean isValid) {
        driver.get(url);

        emailComponent.setValue(driver, value);

        joinButtonComponent.clickButton(driver);

        assertEquals(emailComponent.isValid(driver), isValid);
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
