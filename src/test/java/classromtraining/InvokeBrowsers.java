package classromtraining;

import genericmethods.GenricMethods;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InvokeBrowsers {
    public static void main(String[] args) throws InterruptedException {

        GenricMethods genricMethods=new GenricMethods();

        genricMethods.launchBrowser("chrome","https://demo.nopcommerce.com/");

        GenricMethods.driver.findElement(By.linkText("Register")).click();
        Thread.sleep(3000);
        GenricMethods.driver.findElement(By.id("gender-male")).click();
        GenricMethods.driver.findElement(By.id("FirstName")).sendKeys("FirstName");






    }
}
