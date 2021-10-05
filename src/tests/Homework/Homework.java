package tests.Homework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homework {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","/Users/esrakucuk/Documents/selenium libraries/drivers/chromedriver");
        WebDriver driver=new ChromeDriver();

        //sayfa basliginin "facebook" oldugunu dogrula
        driver.get("https://www.facebook.com/");
        String sayfaBaslik=driver.getTitle();
        String expectedTitle="facebook";
        ///////////////////////////////////////
        String actualUrl=driver.getCurrentUrl();
        String expectedUrl="facebook";
        if (sayfaBaslik.equals(expectedTitle)){
            System.out.println("pass");

        }else {
            System.out.println("Actual Title : "+ sayfaBaslik);
        }
        if (actualUrl.contains(expectedUrl)) {
            System.out.println("PASS");

        } else {
            System.out.println("actual URL  : "+actualUrl );
        }
        Thread.sleep(3000);
        driver.get("https://www.walmart.com/");
        String walTitle=driver.getTitle();
        String expectedWallTitle="Walmart.com";
if (walTitle.contains(expectedTitle)){
    System.out.println("pass wallmart");

}else {
    System.out.println("actual wallmart title : " + walTitle);
}
        Thread.sleep(3000);
driver.navigate().back();
driver.navigate().refresh();
driver.manage().window().maximize();
driver.close();



    }
}
