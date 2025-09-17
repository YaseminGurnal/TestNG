package Gun07;

import Utility.BaseDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class _01_Elements {
    public _01_Elements() {
        PageFactory.initElements(BaseDriver.driver,this);
    }

    @FindBy(xpath = "//span[text()='Add to Cart']")
    public List<WebElement>producListAddCard;


    @FindBy(css = "[class='caption']>h4")
    public List<WebElement>producListCaption;

    @FindBy(xpath = "//table[@class='table table-bordered']//td[@class='text-left']/a")
    public List<WebElement>producListBasket;


}
