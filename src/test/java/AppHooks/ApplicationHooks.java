package AppHooks;

import Factory.DriverFactory;
import Utils.ConfigReader;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;

import java.util.Properties;

public class ApplicationHooks {
    private DriverFactory driverFactory;
    private WebDriver driver;
    private ConfigReader configReader;
    Properties props;

    @Before(order = 0)
    public void getProperty() {
        configReader = new ConfigReader();
        props = configReader.init_props();
    }

    @Before(order = 1)
    public void launchBrowser() {
        String browserName = props.getProperty("browser");
        driverFactory = new DriverFactory();
        driver = driverFactory.initDriver(browserName);
    }

    @After(order = 0)
    public void quitBrowser(){
        driver.quit();
    }

}
