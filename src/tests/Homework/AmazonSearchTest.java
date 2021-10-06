package tests.Homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonSearchTest {
    public static void main(String[] args) throws InterruptedException {

//1. Bir class oluşturun : AmazonSearchTest
//2. Main method oluşturun ve aşağıdaki görevi tamamlayın.
// a.google web sayfasına gidin. https://www. amazon.com/
// b. Search(ara) “city bike”
// c. Amazon'da görüntülenen ilgili sonuçların sayısını yazdırın
// d. “Shopping” e tıklayın.
// e. Sonra karşınıza çıkan ilk sonucun resmine tıklayın.

System.setProperty("webdriver.chrome.driver","/Users/esrakucuk/Documents/selenium libraries/drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.amazon.com/");

 WebElement search=  driver.findElement(By.id("twotabsearchtextbox"));

 WebElement searchButton=driver.findElement(By.id("nav-search-submit-button"));

 search.sendKeys("city bike");

 Thread.sleep(2000);

 searchButton.click();

WebElement sonuc=driver.findElement(By.xpath("//*[@id=\"search\"]/span/div/span/h1/div/div[1]/div/div/span[1]"));

        System.out.println(sonuc.getText());
WebElement shopping=driver.findElement(By.linkText("Today's Deals"));
shopping.click();
Thread.sleep(2000);
WebElement dealTusla=driver.findElement(By.cssSelector("img[alt=\"Up to 30% off Greenworks Outdoor Tools\"]"));
dealTusla.click();










    }
}

