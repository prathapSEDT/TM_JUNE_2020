package classromtraining;

import genericmethods.GenricMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Set;

public class HandleWindows {
    public static void main(String[] args) {
        GenricMethods genricMethods=new GenricMethods();

        genricMethods.launchBrowser("chrome","https://www.naukri.com/");

        String parentBrowserID=GenricMethods.driver.getWindowHandle();

        Set<String> allWindows=GenricMethods.driver.getWindowHandles();

//        System.out.println(parentBrowserID);
//        System.out.println(allWindows);

        allWindows.remove(parentBrowserID);
        System.out.println(allWindows);

        for (String window:allWindows){

            GenricMethods.driver.switchTo().window(window);
            GenricMethods.driver.close();

        }
        GenricMethods.driver.switchTo().window(parentBrowserID);








    }
}
