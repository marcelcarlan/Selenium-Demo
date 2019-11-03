package fields;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.springframework.stereotype.Component;

@Component
public class PasswordComponent {

    private static final String cssSelector = "#password";

    private WebElement getElement(WebDriver webDriver){
        return webDriver.findElement(By.cssSelector(cssSelector));
    }


    public void setValue(WebDriver webDriver, String value){
        getElement(webDriver).sendKeys(value);
    }

    public boolean isValid(WebDriver webDriver) {
        return !getElement(webDriver)
                .getAttribute("class").contains("error");
    }

}
