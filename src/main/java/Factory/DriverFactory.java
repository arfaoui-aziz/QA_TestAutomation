package Factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverFactory {

    public WebDriver driver;

    public static ThreadLocal<WebDriver> tlDriver = new ThreadLocal<>();

    public void initDriver(String browser){
        System.out.println("Browser value is: " + browser);

        if(browser.equals("chrome")){
            //install WebDriverManager
        //WebDriverManager.chromedriver().setup();
            tlDriver.set(new ChromeDriver());
        }
    }
}
