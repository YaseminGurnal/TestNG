package Gun05;

import Utility.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class _05_Soru extends BaseDriver {

/*
  Senaryo
  1- Siteyi açınız.
  2- Top Menudeki menu elemanlarının olduğunu doğrulayınız.(menuValidation)
  3- Desktops, Laptops & Notebooks, Components, Tablets, Software, Phones & PDAs, Cameras, MP3 Players
   // webden menuyu okuyun, ve 3.sıradaki menu ile karşılatırın:
 */

    @Test
    public void menuValidation() {

        //Beklenen listemiz
        List<String> menuExpectedList = new ArrayList<>();
        menuExpectedList.add("Desktops");
        menuExpectedList.add("Laptops & Notebooks");
        menuExpectedList.add("Components");
        menuExpectedList.add("Tablets");
        menuExpectedList.add("Software");
        menuExpectedList.add("Phones & PDAs");
        menuExpectedList.add("Cameras");
        menuExpectedList.add("MP3 Players");

        List<WebElement> menuActualList = driver.findElements(By.xpath("//ul[@class='nav navbar-nav']/li"));
        for (int i = 0; i < menuActualList.size(); i++) {
            Assert.assertEquals(menuActualList.get(i).getText(), menuExpectedList.get(i), "Menü beklendiği gibi değil.");


        }

    }
}
