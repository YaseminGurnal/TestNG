package Gun06;

import Utility.BaseDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class _04_PlaceOrder_Elementleri {
    public _04_PlaceOrder_Elementleri() {
        PageFactory.initElements(BaseDriver.driver,this);
        //Buradaki elementleri driver ile ilişkilendir bağla.
    }

    @FindBy(name="search")
    public WebElement searchInput;

    @FindBy(xpath = "//span[text()='Add to Cart'])[1]")
    public WebElement addToCard;

    @FindBy(xpath ="//a[text()='shopping cart']")
    public WebElement shoppingCardLink;

    @FindBy(linkText = "Checkout")
    public WebElement checkoutButton;

    @FindBy(id = "button-payment-address")
    public WebElement continue1;

    @FindBy(id = "button-shipping-address")
    public WebElement continue2;

    @FindBy(id = "button-shipping-method")
    public WebElement continue3;

    @FindBy(xpath = "//input[@type='checkbox']")
    public WebElement checkBox ;

    @FindBy(id="button-payment-method")
    public WebElement continue4;

    @FindBy(xpath = "//input[@id='button-confirm']")
    public WebElement confirmOrder;

    @FindBy(xpath = "//div[@id='content']/h1")
    public  WebElement text;

}
