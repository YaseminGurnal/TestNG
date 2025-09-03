package Gun01;

import org.testng.annotations.Test;

public class _02_Sıralama {
    @Test(priority = 1) //Priority -> Öncelik
    //Öncelik ayarı yapılmaz ise alfabetik çalışır.
    public void DriverStartEdildi(){System.out.println("Driver start edildi.");
    }

    @Test(priority = 2) //Priority verilmez ise default o dır.
    public void WebSitesiniAç(){System.out.println("Web sitesini açıldı.");
    }

    @Test(priority = 3)
    public void LoginTestiniYap(){System.out.println("Login testini yapıldı.");
    }

    @Test(priority = 4)
    public void SepetTestiniYap(){System.out.println("Sepet testini yapıldı.");
    }

    @Test(priority = 5)
    public void DriverKapatıldı(){System.out.println("Driver kapatıldı.");
    }

}
