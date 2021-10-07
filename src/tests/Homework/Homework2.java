package tests.Homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homework2 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","/Users/esrakucuk/Documents/selenium libraries/drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");
        Thread.sleep(2000);
driver.findElement(By.xpath("//*[@id=\"content\"]/div/button")).click(); //add element button tiklar

        WebElement deleteButton= driver.findElement(By.xpath("//*[@id=\"elements\"]/button"));
        if (deleteButton.isDisplayed()) {
            System.out.println("delete button is displayed");
        }else {
            System.out.println("delete button is not displayed");
        }
deleteButton.click();
        Thread.sleep(2000);
        if (!deleteButton.isDisplayed()) {
            System.out.println("delete button is still displayed failed !!!");

        }else {
            System.out.println("delete button is not displayed passed the test");
        }









    }
}
