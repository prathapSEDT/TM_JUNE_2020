package classromtraining;

import genericmethods.GenricMethods;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class PopUP {
    public static void main(String[] args) throws InterruptedException {
        GenricMethods genricMethods=new GenricMethods();

        genricMethods.launchBrowser("chrome","https://www.makemytrip.com/");
Thread.sleep(3000);
        WebElement sigIn=GenricMethods.driver.findElement(By.xpath("(//p[normalize-space(text())='Login or Create Account'])[1]"));

//        JavascriptExecutor js=(JavascriptExecutor)GenricMethods.driver;
//        js.executeScript("arguments[0].click();",sigIn);











    }
}
