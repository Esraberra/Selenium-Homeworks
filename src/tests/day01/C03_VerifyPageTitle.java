package tests.day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03_VerifyPageTitle {

    public static void main(String[] args) {

//Yeni bir Class olusturalim. (VerifyTitle)
//Amazon ana sayfasina gidelim . https://www.amazon.com/
//Sayfa basliginin (title) “amazon” oldugunu dogrulayin. (verify)
        System.setProperty("webdriver.chrome.driver","/Users/esrakucuk/Documents/selenium libraries/drivers/chromedriver");
        WebDriver driver= new ChromeDriver();
        driver.get("https://www.amazon.com");
       String expectedTitle="amazon";

String actualTitle=driver.getTitle();

if(expectedTitle.equals(actualTitle)) {
    System.out.println("title beklenen deger ile ayni, test pass");
} else {
    System.out.println("title beklenenden farkli : test failed");
    System.out.println("actuel title : " + driver.getTitle());
}

    }
}
