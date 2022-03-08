package Factory;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFactory {

    public WebDriver driver;

    public static ThreadLocal<WebDriver> tlDriver = new ThreadLocal<>();

    /**
     * This method is used to initialize the thradlocal driver on the basis of given
     * browser
     *
     * @param browser
     * @return this will return tldriver.
     */
    public WebDriver initDriver(String browser){

        System.out.println("Browser value is: " + browser);

        switch (browser){
            case "firefox":
                WebDriverManager.firefoxdriver().setup();
                tlDriver.set(new FirefoxDriver());
                break;
            case "chrome":
            default:
                WebDriverManager.chromedriver().setup();
                tlDriver.set(new ChromeDriver());
        }
        getDriver().manage().deleteAllCookies();
        getDriver().manage().window().maximize();

        return getDriver();
    }

    /**
     * this is used to get the driver with ThreadLocal
     *
     * @return WebDriver
     */
    public static WebDriver getDriver(){
        return tlDriver.get();
    }
}
