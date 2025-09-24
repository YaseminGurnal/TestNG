package Utility;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.ITest;
import org.testng.ITestResult;
import org.testng.annotations.*;

import java.time.Duration;

public class BaseDriver {
    public static Logger logEkle= LogManager.getLogger();
    public static WebDriver driver;
    public static WebDriverWait wait;
    @BeforeClass
    public void Başlangıçİşlemleri(){
        //System.out.println("Başlangış işlemleri yapılıyor.");

        driver=new ChromeDriver();
        logEkle.info("Driver başlatıldı.");

        //Hata oluşmuş olsaydı
        logEkle.error("Driver oluşturulurken hata oluştu.");

        driver.manage().window().maximize();//Ekranı maximum yapar.
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));//20 sn sayfayı yükleme mühleti
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        Login();
    }


    @AfterClass
    public void Kapanışİşlemleri(){
        System.out.println("Kapanış işlemleri yapılıyor.");

        Tools.Bekle(2);
        driver.quit();
    }

    @Test
    public void Login(){

        driver.get("https://opencart.abstracta.us/index.php?route=account/login");
        Tools.Bekle(3);

        WebElement email= driver.findElement(By.xpath("(//input[@type='text'])[2]"));
        email.sendKeys("gizem@gmail.com");
        logEkle.info("Şuanda"+ "gizem@gmail.com"+ "isimli user login olmak için gönderildi.");



        WebElement password= driver.findElement(By.id("input-password"));
        password.sendKeys("G1991");
        Tools.Bekle(2);

        WebElement loginButton= driver.findElement(By.xpath("//input[@type='submit']"));
        loginButton.click();
        Tools.Bekle(2);

        wait.until(ExpectedConditions.titleIs("My Account"));
        logEkle.debug("Log işlemi testine geçiliyor.");
        Assert.assertTrue(driver.getTitle().equals("My Account"),"Login olunamadı.");
        logEkle.debug("Login işlemi başarıyla tamamlandı.");

    }
    @BeforeMethod
    public void BeforeMethod(){
      logEkle.info("Method çalışmaya başlayacak");

    }
    @AfterMethod
    public void AfterMethod(ITestResult sonuç){
        logEkle.info(sonuç.getName()+"Method çalışması tamamlandı.");
        logEkle.info(sonuç.getStatus() ==1 ?"Passed":"Failed");

        //Çok önemli hata oldu
        logEkle.fatal(sonuç.getName()+"Method ta çok önemli hata oldu.");

    }

}
