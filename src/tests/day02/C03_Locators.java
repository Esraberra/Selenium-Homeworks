package tests.day02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;

public class C03_Locators {
    public static void main(String[] args) throws InterruptedException {
        //1. Bir class oluşturun: LocatorsIntro
        //2. Main method oluşturun ve aşağıdaki görevi tamamlayın.
        // a. http://a.testaddressbook.com adresine gidiniz.
        // b. Sign in butonuna basin
        // c. email textbox,password textbox, and signin button elementlerini locate ediniz..
        // d. Kullanıcı adını ve şifreyi aşağıya girin ve oturum aç (sign in)buttonunu tıklayın:
        // i. Username : testtechproed@gmail.com
        // ii. Password : Test1234!
        // e. Expected user id nin testtechproed@gmail.com oldugunu dogrulayin(verify).
        // f. “Addresses” ve “Sign Out” textlerinin görüntülendiğini( displayed) doğrulayin(verify).
        //3. Sayfada kac tane link oldugunu bulun.
        System.setProperty("webdriver.chrome.driver","/Users/esrakucuk/Documents/selenium libraries/drivers/chromedriver");

        WebDriver driver=new ChromeDriver();
        driver.get("http://a.testaddressbook.com");
        WebElement signInLinki=driver.findElement(By.linkText("Sign in"));
        signInLinki.click();
        //////////////////////
Thread.sleep(2000);
        WebElement emailTextBox=driver.findElement(By.id("session_email"));
        WebElement passwordTexBox=driver.findElement(By.id("session_password"));
        WebElement signInButonu=driver.findElement(By.name("commit"));
        emailTextBox.sendKeys("testtechproed@gmail.com");
        passwordTexBox.sendKeys("Test1234!");
        signInButonu.click();
WebElement dogruKullanici=driver.findElement(By.className("navbar-text"));

String userName="testtechproed@gmail.com";

if (dogruKullanici.getText().equals(userName)){

    System.out.println("dogru kullanici testi PASS !!!");
}else {
    System.out.println("failed ");
}
//	f. “Addresses” ve “Sign Out” textlerinin görüntülendiğini( displayed) doğrulayin(verify).
        WebElement adressesLinki= driver.findElement(By.linkText("Addresses"));
        WebElement signOutLinki=driver.findElement(By.linkText("Sign out"));
        if (adressesLinki.isDisplayed()){
            System.out.println("adresses linki gorunuyor, test PASS");
        }else {
            System.out.println("adresses linki gorunmuyor, test FAILED");
        }

        if (signOutLinki.isDisplayed()){
            System.out.println("sign out linki gorunuyor, test PASS");
        }else {
            System.out.println("sign out linki gorunmuyor, test FAILED");
        }
        //3. Sayfada kac tane link oldugunu bulun.
        List<WebElement> aLinkler= driver.findElements(By.tagName("a"));
        int linkSayisi=aLinkler.size();
        System.out.println(linkSayisi);





    }
}