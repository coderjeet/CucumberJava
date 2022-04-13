package awesomecucumber.hooks;

import awesomecucumber.context.TestContext;
import awesomecucumber.factory.DriverFactory;
import io.cucumber.java.*;
import org.openqa.selenium.WebDriver;


public class CucumberHooks {
    private WebDriver driver;
    private TestContext testContext;

    // using cucumber pico container to create dependency
    public CucumberHooks(TestContext testContext){
            this.testContext = testContext;
    }



    @Before
    public void before(){
        driver = DriverFactory.initializeDriver("chrome");
        testContext.driver = driver;
    }

    @After
    public void afterHook(){
        driver.quit();
    }
}
