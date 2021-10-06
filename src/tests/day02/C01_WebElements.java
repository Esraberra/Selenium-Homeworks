package tests.day02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_WebElements {
    public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver","/Users/esrakucuk/Documents/selenium libraries/drivers/chromedriver");

        WebDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com/");
// email textbox
       WebElement mailTextBox= driver.findElement(By.id("email"));
       mailTextBox.sendKeys("aliseleniumcu@gmail.com");
       Thread.sleep(2000);
      // mailTextBox.clear();
//WebElement mailKutusuTagName=driver.findElement(By.tagName("input"));
//mailKutusuTagName.sendKeys("veliGöcer@gmail.com");
        //WebElement yanlisElement=driver.findElement((By.id("email yanlis")));
 //yanlisElement.sendKeys("yanlis element");

        //giris yap butonuna tiklayalim
 WebElement girisButonu=driver.findElement(By.tagName("button"));
 girisButonu.click();
        System.out.println(girisButonu.isEnabled());


    }
}
