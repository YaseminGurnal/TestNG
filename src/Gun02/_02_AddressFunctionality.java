package Gun02;

import Utility.BaseDriver;
import Utility.Tools;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.List;

public class _02_AddressFunctionality extends BaseDriver {
    /*
       Senaryo;
       1- Siteyi açınız.
       2- Adress Ekleyiniz.
       3- En son adresi edit yaparak ad ve soyadı değiştirip kaydediniz.
       4- En sondaki adresi siliniz.
 */
    @Test
    public void AddAdress(){

        WebElement addressBook= driver.findElement(By.linkText("Address Book"));
        addressBook.click();

        WebElement newAddress=driver.findElement(By.linkText("New Address"));
        newAddress.click();

        WebElement firstName=driver.findElement(By.id("input-firstname"));
        firstName.sendKeys("Yasemin");

        WebElement lastName=driver.findElement(By.id("input-lastname"));
        lastName.sendKeys("Gurnal");


        WebElement company=driver.findElement(By.id("input-company"));
        company.sendKeys("Kırklareli");

        WebElement address1=driver.findElement(By.id("input-address-1"));
        address1.sendKeys("36.sokak ");

        WebElement address2=driver.findElement(By.id("input-address-2"));
        address2.sendKeys("BG5 7BJ");

        WebElement city=driver.findElement(By.id("input-city"));
        city.sendKeys("Pınarhisar");

        WebElement postaCode=driver.findElement(By.id("input-postcode"));
        postaCode.sendKeys("5678");

        WebElement webCountry=driver.findElement(By.id("input-country"));
        Select country=new Select(webCountry);
        country.selectByVisibleText("Turkey");

        WebElement webState=driver.findElement(By.id("input-zone"));
        Select state=new Select(webState);
        state.selectByVisibleText("Kırklareli");

        WebElement continueButton=driver.findElement(By.xpath("//input[@type='submit']"));
        continueButton.click();

        Tools.successMessageValidation();
    }

    @Test(dependsOnMethods = {"AddAdress"})
    public void EditAdress(){

        WebElement addressBook= driver.findElement(By.linkText("Address Book"));
        addressBook.click();

        List<WebElement>editAll=driver.findElements(By.linkText("Edit"));//Bütün editler
        WebElement sonEdit=editAll.get(editAll.size()-1); //En sondaki edit butonu
        sonEdit.click();

        WebElement firstName=driver.findElement(By.id("input-firstname"));
        firstName.clear();
        firstName.sendKeys("Yasemin7");

        WebElement lastName=driver.findElement(By.id("input-lastname"));
        lastName.clear();
        lastName.sendKeys("Gurnal7");

        WebElement continueButton=driver.findElement(By.xpath("//input[@type='submit']"));
        continueButton.click();

        Tools.successMessageValidation();

           }

    @Test(dependsOnMethods = {"EditAdress"})
    public void DeleteAdress(){

        WebElement addressBook= driver.findElement(By.linkText("Address Book"));
        addressBook.click();

        List<WebElement>deleteAll=driver.findElements(By.linkText("Edit"));//Bütün delete
        WebElement sonDelete=deleteAll.get(deleteAll.size()-1); //En sondaki delete butonu
        sonDelete.click();
        Tools.successMessageValidation();

    }
    }

