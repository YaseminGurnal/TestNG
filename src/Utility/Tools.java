package Utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class Tools {
    public static void Bekle(int sn) {
        try {
            Thread.sleep(sn * 1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

    public static void successMessageValidation() {
        WebElement msgLabel = BaseDriver.driver.findElement(By.xpath("//div[@class='alert alert-success alert-dismissible']"));
        Assert.assertTrue(msgLabel.getText().toLowerCase().contains("success"));


    }

    public static int randomGenerator(int sinir) {
        return (int) (Math.random() * sinir);
    }

    public static boolean listContainsString(List<WebElement> List, String aranacakKelime) {
        boolean urunBulundu = false;
        for (WebElement urun :List) {

            if (urun.getText().equals(aranacakKelime)) {
                urunBulundu = true;
                break;
            }
        }
        return urunBulundu;
    }
}
