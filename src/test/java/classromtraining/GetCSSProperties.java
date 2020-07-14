package classromtraining;

import genericmethods.GenricMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class GetCSSProperties {
    public static void main(String[] args) {
        GenricMethods genricMethods=new GenricMethods();

        genricMethods.launchBrowser("chrome","https://demo.nopcommerce.com/register?returnUrl=%2F");

        GenricMethods.driver.findElement(By.xpath("//input[@id='register-button']")).click();

        List<WebElement> errors=GenricMethods.driver.findElements(By.cssSelector(".field-validation-error"));

        for (WebElement error:errors){

            System.out.println(error.getCssValue("color"));

        }


    }
}
