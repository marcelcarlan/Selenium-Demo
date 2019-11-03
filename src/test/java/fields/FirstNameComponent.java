package fields;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.springframework.stereotype.Component;

@Component
public class FirstNameComponent {

    private static final String cssSelector = "#first-name";

    private WebElement getElement(WebDriver webDriver){
        return webDriver.findElement(By.cssSelector(cssSelector));
    }


    public void setValue(WebDriver webDriver, String value){
        WebElement webElement = getElement(webDriver);
        webElement.clear();
        webElement.sendKeys(value);
    }

    public boolean isValid(WebDriver webDriver) {
        return !getElement(webDriver)
                .getAttribute("class").contains("error");
    }

}
