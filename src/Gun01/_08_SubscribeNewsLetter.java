package Gun01;

import Utility.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class _08_SubscribeNewsLetter extends BaseDriver {
    /*
  Senaryo
  1- Siteyi açınız.
  2- Newsletter  Subscribe işlemini abone lunuz(YES)  , işlemin başarılı olduğunu kontrol ediniz.
  3- Ayrı bir test ile Newsletter  Subscribe işlemini abonelikten çıkınız(NO)
  4- Ayrı bir test ile Newsletter  Subscribe durumunu kontrol ediniz YES ise NO, NO ise YES yapınız.
 */
     @Test
    public  void  Test1(){

         WebElement newsLetterLink= driver.findElement(By.xpath("(//a[text()='Newsletter'])[1]"));
         newsLetterLink.click();


     }
}
