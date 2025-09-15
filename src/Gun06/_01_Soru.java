package Gun06;

import Utility.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class _01_Soru extends BaseDriver {

/*
  Senaryo;
  1- Brands menusune gidiniz.
  2- Burada her bir markanın üstünde yer alan harf ile başladığını doğrulayınız
*/

    //    harfler  [id='content'] h2
//    markalar bölgesi(markaların olduğu html bloğu) [id='content'] > div
//
//0.harfin ne harfi olduğunu alıcam A harfi
//0.markalar bloğundaki markaları alıcam ve A harfiyle başlıyormu
//    onu kontrol edicem

    @Test
    public void BrandsValidation() {
        WebElement brandsLink = driver.findElement(By.linkText("Brands"));
        brandsLink.click();

        List<WebElement> harfler = driver.findElements(By.linkText("[id='content'] h2"));
        List<WebElement> markalarSatırı = driver.findElements(By.linkText("[id='content'] > div"));

        for (int i = 0; i < harfler.size(); i++) {
            String harf = harfler.get(i).getText();//A harfi ilk adım
            WebElement harfinaltındakiSatır = markalarSatırı.get(i);//Apple

            List<WebElement> markalar = harfinaltındakiSatır.findElements(By.tagName("div"));

            for (WebElement marka : markalar) {
                System.out.println(harf+" "+marka.getText());
                Assert.assertTrue(harf.charAt(0) == marka.getText().charAt(0), "Başlık marka ile uyumlu değil.");


            }

        }
    }
}