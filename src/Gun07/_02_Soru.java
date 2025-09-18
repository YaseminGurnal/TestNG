package Gun07;

import Gun06._04_PlaceOrder_Elementleri;
import Utility.BaseDriver;
import Utility.Tools;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class _02_Soru extends BaseDriver {
/*
    Senaryo ;
    1- Siteye gidiniz..
   1.Test;
   2- "ipod" ürününü aratınız."ipod" u xml den gönderiniz
   3- çıkan elamnlardan random bir elelamnı Add Wish butonuna tıklayınız.
   4- Daha sonra WishList e tıklatınız
   5- Burada çıkan ürünle tıklanan ürünün isminin aynı olup olmadığını doğrulayınız.
 */

    @Test
    @Parameters("searchText")
    public void addToCard(String aranacakKelime) {
        _04_PlaceOrder_Elementleri poe = new _04_PlaceOrder_Elementleri();
        _01_Elements sre = new _01_Elements();
        poe.searchInput.sendKeys(aranacakKelime + Keys.ENTER);


        int randomSecim = Tools.randomGenerator(sre.producListCaption.size());

        //Tıklatmadan önce ürünün ismini saklayalım
        String tıklatılacakÜrününAdı = sre.producListCaption.get(randomSecim).getText();
        sre.producListAddWish.get(randomSecim).click();
        sre.wishList.click();

        boolean urunBulundu=Tools.listContainsString(sre.producListWish,aranacakKelime);
        Assert.assertTrue(urunBulundu,"Seçtiğiniz ürün Wish List te bulunamadı.");



    }
}