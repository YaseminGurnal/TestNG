package Gun06;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class _02_SoftAssertVsHardAssert {
    @Test
    public void HardAssert() {
        String s1 = "Merhaba";

        System.out.println("Assert öncesi");
        Assert.assertEquals("Merhaba1234", s1, "Oluşan ile beklenen aynı değil.");//Hata verdiğinde test sonlanır.
        System.out.println("Assert sonrası");


    }

    @Test
    public void SoftAsert() {
        String strHomePage = "www.facebook.com/homepage";
        String strCartPage = "www.facebook.com/cartpage";
        String strEditAccount = "www.facebook.com/editaccountpage";

        SoftAssert _softAsert = new SoftAssert();
        _softAsert.assertEquals("www.facebook.com/homepage", strHomePage);
        System.out.println("Assert 1");

        _softAsert.assertEquals("www.facebook.com/profile", strCartPage);
        System.out.println("Assert 2");

        _softAsert.assertEquals("www.facebook.com/settings", strEditAccount);
        System.out.println("Assert 3");

        _softAsert.assertAll();//Softan Harda geçir

        System.out.println("soft assertAll() sonrası");

    }

}
