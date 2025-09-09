package Gun03;

import Utility.BaseDriver;
import Utility.Tools;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class _01_EditAccount extends BaseDriver {
/*
  Senaryo
  1- Siteyi açınız.
  2- Edit Account sayfasına ulaşınız.
  3- Ad ve soyadı değiştirip tekrar kaydedidiniz.
 */

    @Test
    public void editAccount(){

        WebElement editLink= driver.findElement(By.linkText("Edit Account"));
        editLink.click();

        WebElement firstName=driver.findElement(By.id("input-firstname"));
        firstName.sendKeys("Yasemin 1");

        WebElement lastName=driver.findElement(By.id("input-lastname"));
        lastName.sendKeys("Gurnal 2 ");

        WebElement continueButton=driver.findElement(By.xpath("//input[@type='submit']"));
        continueButton.click();

        Tools.successMessageValidation();
    }


}
