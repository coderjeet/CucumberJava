package awesomecucumber.pages;

import org.openqa.selenium.WebDriver;

public class PageFactoryManager {
    private static StorePage storePage;
    private static CartPage cartPage;
    private static Checkout checkout;

    public static StorePage getStorePage(WebDriver driver){
        return storePage == null ? new StorePage(driver) : storePage;
    }

    public static CartPage getCartPage(WebDriver driver){
        return cartPage == null ? new CartPage(driver) : cartPage;
    }

    public static Checkout getCheckout(WebDriver driver){
        return checkout == null ? new Checkout(driver) : checkout;
    }
}
