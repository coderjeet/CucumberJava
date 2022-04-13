package awesomecucumber.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

public class Confirmation extends BasePage{
    @FindBy(className = "woocommerce-notice")private WebElement confirmationMsg;


    public Confirmation(WebDriver driver) {
        super(driver);
    }

    public Confirmation confirmSuccessfulBuy(){
        Assert.assertEquals( wait.until(ExpectedConditions.visibilityOf(confirmationMsg)).getText(),"Thank you. Your order has been received.");
        return this;
    }
}
