package Gun04;

import Utility.BaseDriver;
import Utility.Tools;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class _01_ContactUs extends BaseDriver {

/*
  1- ContactUs a tıklayınız
  2- Mesaj kutusuna en az 10 karakterlik bir mesaj yazınız.
  3- Submit ettikten sonra url deki success yazısını doğrulayınız.
 */
    @Test
    public void ContactUs(){

        WebElement contactUsBtn= driver.findElement(By.linkText("Contact Us"));
        contactUsBtn.click();

        WebElement mesajKutusu= driver.findElement(By.id("input-enquiry"));
        mesajKutusu.sendKeys("Merhaba Testing Dünyası :)");

        WebElement submitBtn= driver.findElement(By.xpath("//input[@class='btn btn-primary']"));
        submitBtn.click();

        Assert.assertTrue(driver.getCurrentUrl().contains("success"),"İşlem hatalıdır.");

        Tools.successMessageValidation();
    }

}
