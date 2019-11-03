package fields;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.springframework.stereotype.Component;

@Component
public class FirstNameComponent {

    private static final String cssSelector = "input[name=firstname]";


    public void setValue(WebDriver webDriver, String value){
        webDriver.findElement(By.cssSelector(cssSelector)).sendKeys(value);
    }

}
