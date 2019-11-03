package fields;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.springframework.stereotype.Component;

@Component
public class JoinButtonComponent {

    private static final String cssSelector = "#join-form-submit";


    private WebElement getElement(WebDriver webDriver){
        return webDriver.findElement(By.cssSelector(cssSelector));
    }

    public void clickButton(WebDriver webDriver){
        getElement(webDriver).click();
    }


}
