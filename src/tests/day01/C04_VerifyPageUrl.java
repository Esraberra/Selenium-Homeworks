package tests.day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C04_VerifyPageUrl {

    public static void main(String[] args) {

       // Yeni bir class olusturalim : (VerifyURLTest)
             //   Youtube ana sayfasina gidelim https://www.techproeducation.com/
       // Sayfa URL’inin www. techproeducation.com oldugunu dogrulayin
        System.setProperty("webdriver.chrome.driver","/Users/esrakucuk/Documents/selenium libraries/drivers/chromedriver");
        WebDriver driver= new ChromeDriver();
        driver.get("https://www.techproeducation.com/");
        String actualUrl=driver.getCurrentUrl();
        String expectedUrl="www.techproeducation.com";

        if(actualUrl.equals(expectedUrl)) {
            System.out.println("pass");


        }else {
            System.out.println("failed");
            System.out.println("mevcut Url : " +actualUrl);
        }





    }
}
