package Gun06;

import Utility.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.awt.event.KeyEvent;

public class _03_PlaceOlder extends BaseDriver {
    /*
   Senaryo :
   1- Siteyi açınız.
   2- Sitede "ipod" kelimesini aratınız
   3- Çıkan sonuçlardan ilkini sepete atınız.
   4- Shopping Chart a tıklatınız.
   5- Checkout yapınız.
   6- Continue butonalarına tıklatıp bilgileri giriniz.
   7- Confirm ile siparişi verdiğinizi doğrulayınız.
      doğrulamayı çıkan sayfadaki "Your order has been placed" yazısı ile yapınız.
*/

    @Test
    public void ProceddToCheckout() {

        WebElement searchInput = driver.findElement(By.name("search"));
        searchInput.sendKeys("ipod" + Keys.ENTER);

        WebElement addToCard = driver.findElement(By.xpath("(//span[text()='Add to Cart'])[1]"));
        addToCard.click();

        WebElement shoppingCardLink = driver.findElement(By.linkText("Shopping cart"));
        shoppingCardLink.click();

        WebElement checkoutButton = driver.findElement(By.linkText("Checkout"));
        checkoutButton.click();

        WebElement continue1 = wait.until(ExpectedConditions.elementToBeClickable(By.id("button-payment-address")));
        continue1.click();

        WebElement continue2 = wait.until(ExpectedConditions.elementToBeClickable(By.id("button-shipping-address")));
        continue2.click();

        WebElement continueButton3 =wait.until(ExpectedConditions.elementToBeClickable(By.id("button-shipping-method")));
        continueButton3.click();

        WebElement checkBox = driver.findElement(By.xpath("//input[@type='checkbox']"));
        checkBox.click();

        WebElement continue4 =wait.until(ExpectedConditions.elementToBeClickable(By.id("button-payment-method")));
        continue4.click();

        WebElement confirmOrder = driver.findElement(By.xpath("//input[@id='button-confirm']"));
        confirmOrder.click();

        wait.until(ExpectedConditions.urlContains("success"));

        WebElement text = driver.findElement(By.xpath("//div[@id='content']/h1"));
        Assert.assertEquals(text.getText(),"Your order has been placed!","Oluşan mesajlar eşleşmiyor.");


    }
}
