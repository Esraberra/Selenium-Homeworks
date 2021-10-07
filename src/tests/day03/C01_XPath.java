package tests.day03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_XPath {
    //1- https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin
    //2- Add Element butonuna basin
    //3- Delete butonu’nun gorunur oldugunu test edin
    //4- Delete tusuna basin
    //5- Delete butonunun gorunur olmadigini test edin
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","/Users/esrakucuk/Documents/selenium libraries/drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"content\"]/div/button")).click(); //add element button tiklar

        // WebElement addButonu= driver.findElement(By.tagName("button"));
        //WebElement addButonu= driver.findElement(By.xpath("//button"));
        //WebElement addButonu= driver.findElement(By.xpath("//button[text()='Add Element']"));
        //WebElement addButonu= driver.findElement(By.xpath("//*[text()='Add Element']"));
      //  WebElement addButonu= driver.findElement(By.xpath("//button[@onclick='addElement()']"));





        WebElement deleteButton= driver.findElement(By.xpath("//button[@onclick='addElement()']"));
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
// //button[@onclick="addElement()"]

//   //button[@onclick='addElement()']






    }
}
