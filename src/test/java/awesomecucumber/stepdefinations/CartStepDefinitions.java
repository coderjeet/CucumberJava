package awesomecucumber.stepdefinations;

import awesomecucumber.context.TestContext;
import awesomecucumber.domainobjects.Product;
import awesomecucumber.pages.CartPage;
import awesomecucumber.pages.PageFactoryManager;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class CartStepDefinitions {
    private final WebDriver driver;
    private final CartPage cartPage;

    public CartStepDefinitions(TestContext context) {
        this.driver = context.driver;
        cartPage = PageFactoryManager.getCartPage(context.driver);
    }

    @Then("I see 1 {product} in the cart")
    public void i_see_in_the_cart(Product product) {
        Assert.assertEquals(cartPage.getProductName(), product.getName());
        Assert.assertEquals(cartPage.getProductQuantity(),1);
        driver.quit();
    }

    @When("I'm on the checkout page")
    public void i_m_on_the_checkout_page() {
        cartPage.clickCheckoutBtn();
    }
}
