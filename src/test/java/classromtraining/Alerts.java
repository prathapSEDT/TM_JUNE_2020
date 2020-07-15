package classromtraining;

import genericmethods.GenricMethods;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import java.util.Set;

public class Alerts {
    public static void main(String[] args) throws InterruptedException {
        GenricMethods genricMethods=new GenricMethods();

        genricMethods.launchBrowser("chrome","https://mail.rediff.com/cgi-bin/login.cgi");

        GenricMethods.driver.findElement(By.xpath("//input[@name='proceed']")).click();

        Thread.sleep(2000);

        Alert alert=GenricMethods.driver.switchTo().alert();
        alert.accept();










    }
}
