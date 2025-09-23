package Gun07;

import Gun06._04_PlaceOrder_Elementleri;
import Gun06._05_PlaceOrder_POM;
import Utility.BaseDriver;
import Utility.Tools;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class _01_Soru extends BaseDriver {
    /*
   Senaryo :
   1- Siteyi açınız.
   2- Sitede "ipod" kelimesini aratınız
   3- Çıkan sonuçlardan random birini sepete atınız.
   4- Shopping Chart a tıklatınız.
   5- Seçilen ürünün sepette olduğunu doğrulayınız.
   6- POM ile çözünüz.

 */
    @Test
    public void addToCard() {

        _04_PlaceOrder_Elementleri poe = new _04_PlaceOrder_Elementleri();
        _01_Elements sre = new _01_Elements();
        poe.searchInput.sendKeys("ıpod" + Keys.ENTER);

        int randomSecim = Tools.randomGenerator(sre.producListAddCard.size());
        System.out.println(randomSecim);

        //Tıklatmadan önce ürünün ismini saklayalım
        String tıklatılacakÜrününAdı = sre.producListCaption.get(randomSecim).getText();
        sre.producListAddCard.get(randomSecim).click();//AddToCard a tıklandı

        poe.shoppingCardLink.click();

        boolean urunBulundu = false;
        for (WebElement urun : sre.producListBasket) {

            if (urun.getText().equals(tıklatılacakÜrününAdı)) {
                urunBulundu = true;
                break;


            }

        }

        String tiklatilacakUrununAdi = "";
        urunBulundu = Tools.listContainsString(sre.productListBasket, tiklatilacakUrununAdi);
        Assert.assertTrue(urunBulundu, "Eklediğiniz sepette bulunamadı");

    }
}