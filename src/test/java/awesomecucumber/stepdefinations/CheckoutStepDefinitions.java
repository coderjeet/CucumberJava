package awesomecucumber.stepdefinations;

import awesomecucumber.context.TestContext;
import awesomecucumber.domainobjects.BillingDetails;
import awesomecucumber.factory.DriverFactory;
import awesomecucumber.pages.CartPage;
import awesomecucumber.pages.Checkout;
import awesomecucumber.pages.Confirmation;
import awesomecucumber.pages.PageFactoryManager;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class CheckoutStepDefinitions {
    private final WebDriver driver;
    private BillingDetails billingDetails;
    private final Checkout checkout;

    public CheckoutStepDefinitions(TestContext context) {
        this.driver = context.driver;
        this.billingDetails = context.billingDetails;
        this.checkout = PageFactoryManager.getCheckout(context.driver);
    }



    @When("I provide billing details")
    public void i_provide_billing_details() {
       checkout.setBillingDetails(billingDetails);
    }

    @When("I place an order")
    public void i_place_an_order() {
       checkout.placeOrder();
    }

    @Then("The order should be placed successfully.")
    public void the_order_should_be_placed_successfully() {
        new Confirmation(driver).confirmSuccessfulBuy();
    }



}
