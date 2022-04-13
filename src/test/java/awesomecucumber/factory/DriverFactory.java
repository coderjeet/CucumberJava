package awesomecucumber.factory;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFactory {


    public static WebDriver initializeDriver(String browser) {
        WebDriver driver;
        switch (browser) {
            case "chrome" -> {
                ChromeDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                break;
            }

            case "firefox" -> {
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
                break;
            }
            default -> {
                throw new IllegalStateException("INVALID BROSWER " + browser);
            }
        }

            driver.manage().window().maximize();
            return driver;

    }
}
