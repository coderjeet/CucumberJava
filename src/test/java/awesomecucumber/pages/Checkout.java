package awesomecucumber.pages;

import awesomecucumber.domainobjects.BillingDetails;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

public class Checkout extends BasePage {

    @FindBy(id = "billing_first_name")private WebElement billingFirstName;
    @FindBy(id = "billing_last_name")private WebElement billingLastName;
    @FindBy(id = "billing_company")private WebElement billingCompanyName;
    @FindBy(id = "billing_address_1")private WebElement billingStreetAddress;
    @FindBy(id = "billing_city")private WebElement billingCity;
    @FindBy(id = "select2-billing_state-container")private WebElement stateDropDown;
    @FindBy(id = "billing_postcode")private WebElement billingPostalCode;
    @FindBy(id = "billing_email")private WebElement billingEmail;
    @FindBy(id = "place_order")private WebElement placeOrderBtn;
    
    public Checkout(WebDriver driver) {
        super(driver);
    }



    public Checkout enterBillingFirstName(String inputBillingFirstName){
        WebElement e = wait.until(ExpectedConditions.visibilityOf(billingFirstName));
        e.clear();
        e.sendKeys(inputBillingFirstName);
        return this;
    }

    public Checkout enterBillingLastName(String inputBillingLastName){
        WebElement e = wait.until(ExpectedConditions.visibilityOf(billingLastName));
        e.clear();
        e.sendKeys(inputBillingLastName);
        return this;
    }

    public Checkout enterBillingCompanyName(String inputBillingCompanyName){
        WebElement e = wait.until(ExpectedConditions.visibilityOf(billingCompanyName));
        e.clear();
        e.sendKeys(inputBillingCompanyName);
        return this;
    }

    public Checkout enterBillingStreetName(String inputBillingStreetName){
        WebElement e = wait.until(ExpectedConditions.visibilityOf(billingStreetAddress));
        e.clear();
        e.sendKeys(inputBillingStreetName);
        return this;
    }

    public Checkout enterBillingCityName(String inputBillingCityName){
        WebElement e = wait.until(ExpectedConditions.visibilityOf(billingCity));
        e.clear();
        e.sendKeys(inputBillingCityName);
        return this;
    }

    public Checkout enterBillingPostalCode(String inputBillingPostalCode){
        WebElement e = wait.until(ExpectedConditions.visibilityOf(billingPostalCode));
        e.clear();
        e.sendKeys(inputBillingPostalCode);
        return this;
    }

    public Checkout enterBillingEmail(String inputBillingEmail){
        WebElement e = wait.until(ExpectedConditions.visibilityOf(billingEmail));
        e.clear();
        e.sendKeys(inputBillingEmail);
        return this;
    }

    public Checkout enterBillingState(String billingStateName){
        return this;
    }

    public Checkout setBillingDetails(BillingDetails billingDetails){
                return enterBillingFirstName(billingDetails.getBillingFirstName()).
                        enterBillingLastName(billingDetails.getBillingLastName()).
                        enterBillingCityName(billingDetails.getBillingCity()).
                        enterBillingState(billingDetails.getBillingStateName()).
                        enterBillingStreetName(billingDetails.getBillingAddressOne()).
                        enterBillingEmail(billingDetails.getBillingEmail()).
                        enterBillingPostalCode(billingDetails.getBillingZip());
    }

    public Confirmation placeOrder(){
        wait.until(ExpectedConditions.visibilityOf(placeOrderBtn)).click();
        return new Confirmation(driver);
    }


}
