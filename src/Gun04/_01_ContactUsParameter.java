package Gun04;

import Utility.BaseDriver;
import Utility.Tools;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class _01_ContactUsParameter extends BaseDriver {
    @Test
    @Parameters("Mesaj") //xml deki ile aynı isim olmalıdır.
    public void ContactUs(String gelenMesaj){

        WebElement contactUsBtn= driver.findElement(By.linkText("Contact Us"));
        contactUsBtn.click();

        WebElement mesajKutusu= driver.findElement(By.id("input-enquiry"));
        mesajKutusu.sendKeys(gelenMesaj);

        WebElement submitBtn= driver.findElement(By.xpath("//input[@class='btn btn-primary']"));
        submitBtn.click();

        Assert.assertTrue(driver.getCurrentUrl().contains("success"),"İşlem hatalıdır.");


    }
}
