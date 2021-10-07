package tests.day03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator_css {
    public static void main(String[] args) throws InterruptedException {
         //1. Bir class oluşturun : Locators_css
        //2. Main method oluşturun ve aşağıdaki görevi tamamlayın.
        // a. Verilen web sayfasına gidin. http://a.testaddressbook.com/sign_in
        // b. Locate email textbox
        // c. Locate password textbox ve
        // d. Locate signin button
        // e. Asagidaki kullanıcı adını ve şifreyi girin ve sign in düğmesini tıklayın
        // i. Username : testtechproed@gmail.com
        // ii. Password : Test1234!

        System.setProperty("webdriver.chrome.driver","/Users/esrakucuk/Documents/selenium libraries/drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get("http://a.testaddressbook.com/sign_in");
        Thread.sleep(2000);

     WebElement emailtextbox= driver.findElement(By.cssSelector(".form-control"));
     emailtextbox.sendKeys("testtechproed@gmail.com");
      WebElement passwordTextbox=  driver.findElement(By.xpath("(//input[@class='form-control'])[2]"));
passwordTextbox.sendKeys("Test1234!");
      WebElement signinButon= driver.findElement(By.cssSelector("input[type='submit']"));
      signinButon.click();

      // ödev // amazon.com a gidip java kelimesini aratin
        //// kac sonuc geldigini ve gelen sonuclardan 4.ve 7.nin isimlerini yazdirin
    }
}
