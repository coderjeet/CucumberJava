package awesomecucumber.stepdefinations;

import awesomecucumber.constants.Constants;
import awesomecucumber.context.TestContext;
import awesomecucumber.domainobjects.Product;
import awesomecucumber.pages.PageFactoryManager;
import awesomecucumber.pages.StorePage;
import awesomecucumber.utils.ConfigLoader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class StoreStepDefinitions {
    private final WebDriver driver;
    private final StorePage storePage;

    public StoreStepDefinitions(TestContext context) {
        this.driver = context.driver;
        this.storePage = PageFactoryManager.getStorePage(context.driver);
    }

    @Given("I'm on the store page")
    public void i_m_on_the_store_page() {
        // Write code here that turns the phrase above into concrete action
        storePage.load(ConfigLoader.getInstance().getBaseUrl()+ Constants.STORE);
    }
    @When("I add a {product} to the cart")
    public void i_add_a_to_the_cart( Product product) {
        storePage.addToCart(product.getName());
    }

    @When("I have a {product} in the cart")
    public void i_have_a_product_in_the_cart(Product product) {
        storePage.addToCart(product.getName());
    }

}
