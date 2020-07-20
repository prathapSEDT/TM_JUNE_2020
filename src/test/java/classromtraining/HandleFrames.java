package classromtraining;

import genericmethods.GenricMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HandleFrames {
    public static void main(String[] args) throws InterruptedException {
        GenricMethods genricMethods=new GenricMethods();

        genricMethods.launchBrowser("chrome","https://www.timesjobs.com/");

Thread.sleep(4000);
        WebElement iframe=GenricMethods.driver.findElement(By.xpath("(//iframe)[4]"));

        GenricMethods.driver.switchTo().frame(iframe);

        String header=GenricMethods.driver.findElement(By.xpath("//h2[text()='From Around The Web']")).getText();

        System.out.println(header);

        GenricMethods.driver.switchTo().defaultContent();





    }
}
