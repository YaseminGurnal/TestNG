package Gun04;

import Utility.BaseDriver;
import Utility.BaseDriverParameter;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.util.List;

public class _04_SearchCrossBrowser extends BaseDriverParameter {
    /*
      Senaryo ;
      1- Siteyi açınız.
      2- mac kelimeini göndererek aratınız.
      3- Çıkan sonuçlarda mac kelimesinin geçtiğini doğrulayınız.
      4- aynı işlemi samsung için de yapınız
    */
    @Test
    @Parameters("Search Text")
    public void SearchFunction(String arananKelime) {

        WebElement searchInput = driver.findElement(By.xpath("//input[@class='form-control input-lg']"));
        searchInput.sendKeys(arananKelime + Keys.ENTER);

      List<WebElement> captions=driver.findElements(By.cssSelector("[class='caption']>h4"));
      for (WebElement e : captions)
          Assert.assertTrue(e.getText().toLowerCase().contains(arananKelime.toLowerCase()),"Aranan kelime bulunamadı.");

    }
}
