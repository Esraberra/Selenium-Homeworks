package tests.Homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homework3 {

    public static void main(String[] args) throws InterruptedException {
        // ödev // amazon.com a gidip java kelimesini aratin
        //// kac sonuc geldigini ve gelen sonuclardan 4.ve 7.nin isimlerini yazdirin
        System.setProperty("webdriver.chrome.driver","/Users/esrakucuk/Documents/selenium libraries/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com");
        driver.manage().window().maximize();
//searchbox i xpath ile locate etme:
     WebElement searchbox= driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
searchbox.sendKeys("java");
Thread.sleep(2000);
//////////
//search button locate with xpath
        driver.findElement(By.xpath("//input[@id=\"nav-search-submit-button\"]")).click();


        //// kac sonuc geldigini ve gelen sonuclardan 4.ve 7.nin isimlerini yazdirin


     WebElement resultNumber=   driver.findElement(By.xpath("//span[@dir=\"auto\"]"));

        System.out.println(resultNumber.getText());
        ////////////////////
WebElement dorduncuSonuc=driver.findElement(By.xpath("(//span[@class=\"a-size-base-plus a-color-base a-text-normal\"])[4]"));
        System.out.println(dorduncuSonuc.getText());
WebElement yedinciSonuc=driver.findElement(By.xpath("(//span[@class=\"a-size-base-plus a-color-base a-text-normal\"])[7]"));
        System.out.println(yedinciSonuc.getText());


    }
}
