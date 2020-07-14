package classromtraining;

import genericmethods.GenricMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HandleAjaxControl {
    public static void main(String[] args) throws InterruptedException {
        GenricMethods genricMethods=new GenricMethods();

        genricMethods.launchBrowser("chrome","https://in.search.yahoo.com/");

        GenricMethods.driver.findElement(By.id("yschsp")).sendKeys("Hello");
        Thread.sleep(3000);
        List<WebElement> searchResults=GenricMethods.driver.findElements(By.xpath("//input[@id='yschsp']/parent::div/div//li"));

        for (WebElement results:searchResults ) {

            if(results.getText().trim().toLowerCase().startsWith("hello")){
                System.out.println("Pass");
            }else
            {
                System.out.println("Fail");
            }

        }




    }
}
