package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.springframework.stereotype.Component;

@Component
public class DriverFactory {

    public WebDriver getDriver(){
        System.setProperty("webdriver.chrome.driver", "chrome-bin\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.setBinary("chrome-bin\\chrome.exe");
        return new ChromeDriver(options);
    }


}
