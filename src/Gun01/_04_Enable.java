package Gun01;

import Utility.Tools;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class _04_Enable {

    @Test
    public  void Test1() {System.out.println("Test 1 çalıştı.");
        driver.get("https://www.facebook.com/");
    }

    @Test(enabled = false) //Şimdilik çalışma
    public  void Test2() {System.out.println("Test 2 çalıştı.");
    }

    @Test
    public  void Test3() {System.out.println("Test 3 çalıştı.");
        driver.get("https://www.google.com.tr");
    }

    public static WebDriver driver;
    public static WebDriverWait wait;
    @BeforeClass
    public void Başlangıçİşlemleri(){
        System.out.println("Başlangış işlemleri yapılıyor.");
        driver=new ChromeDriver();

        driver.manage().window().maximize();//Ekranı maximum yapar.
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));//20 sn sayfayı yükleme mühleti
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        wait = new WebDriverWait(driver, Duration.ofSeconds(30));
    }

    @AfterClass
    public void Kapanışİşlemleri(){
        System.out.println("Kapanış işlemleri yapılıyor.");

        Tools.Bekle(3);
        driver.quit();
    }
}
