package utilities;

import fields.EmailComponent;
import fields.FirstNameComponent;
import fields.JoinButtonComponent;
import fields.PasswordComponent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;

import java.util.concurrent.TimeUnit;

@ContextConfiguration(locations = {"classpath:configuration/selenium-demo-config.xml"})
public class AbstractTest extends AbstractTestNGSpringContextTests {

    @Autowired
    public EmailComponent emailComponent;
    @Autowired
    public PasswordComponent passwordComponent;
    @Autowired
    public JoinButtonComponent joinButtonComponent;
    @Autowired
    public FirstNameComponent firstNameComponent;
    @Autowired
    private DriverFactory driverFactory;

    public DriverFactory getDriverFactory() {
        return driverFactory;
    }

    public void sleep(int duration){
        try {
            TimeUnit.SECONDS.sleep(duration);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void setDriverFactory(DriverFactory driverFactory) {
        this.driverFactory = driverFactory;
    }

}
