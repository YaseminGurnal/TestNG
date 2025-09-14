package Gun05;

import Utility.BaseDriver;
import Utility.BaseDriverParameter;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.List;

public class _04_Soru_2 extends BaseDriverParameter {
    /**
     * Bir önceki taskı PARAMETERDRIVER ile yapınız
     * sonrasında farklı tarayıcılar ile çalıştırınız. (crossbrowser)
     * sonrasında paralel çalıştırınız.(parallel)
     */


    @Test(dataProvider = "getData")
    public void SearchFunction(String text) {


        WebElement searchInput = driver.findElement(By.xpath("//input[@class='form-control input-lg']"));
        searchInput.clear();
        searchInput.sendKeys(text + Keys.ENTER);

        List<WebElement> captions = driver.findElements(By.cssSelector("[class='caption']>h4"));
        for (WebElement e : captions)
            Assert.assertTrue(e.getText().toLowerCase().contains(text.toLowerCase()), "Aranan kelime bulunamadı.");


    }

    @DataProvider
    Object[] getData() {
        Object[] data = {"mac", "ipod", "samsung"};
        return data;

    }
}