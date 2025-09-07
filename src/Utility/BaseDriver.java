package Utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class BaseDriver {
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

        WebElement email= driver.findElement(By.id("input-email"));
        email.sendKeys("gizem@gmail.com");
        Tools.Bekle(2);

        WebElement password= driver.findElement(By.id("input-password"));
        password.sendKeys("G1991");
        Tools.Bekle(2);

        WebElement loginButton= driver.findElement(By.xpath("//input[@type='submit']"));
        loginButton.click();
        Tools.Bekle(2);

        wait.until(ExpectedConditions.titleIs("My Account"));
        Assert.assertTrue(driver.getTitle().equals("My Account"),"Login olunamadı.");
        Tools.Bekle(2);

    }

}
