package awesomecucumber.stepdefinations;

import awesomecucumber.constants.Constants;
import awesomecucumber.context.TestContext;
import awesomecucumber.domainobjects.BillingDetails;
import awesomecucumber.utils.ConfigLoader;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.openqa.selenium.WebDriver;

public class CustomerStepDefinitions {
    private final WebDriver driver;
    private TestContext testContext;

    public CustomerStepDefinitions(TestContext context) {
        this.driver = context.driver;
        this.testContext = context;
    }

    @And("my billing details are")
    public void myBillingDetailsAre(BillingDetails billingDetails) {
        testContext.billingDetails = billingDetails;
    }

    @Given("I'm a guest customer")
    public void i_m_a_guest_customer() {
        driver.get(ConfigLoader.getInstance().getBaseUrl()+ Constants.STORE);
    }
}
