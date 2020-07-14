package classromtraining;

import genericmethods.GenricMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class GetAllLinks {
    public static void main(String[] args) {
        GenricMethods genricMethods=new GenricMethods();

        genricMethods.launchBrowser("chrome","https://demo.nopcommerce.com/");

        List<WebElement> allLinks=GenricMethods.driver.findElements(By.xpath("//a"));

        System.out.println("Total links on the page : "+allLinks.size());

        for (WebElement link:allLinks ) {

            try {
                if (link.isDisplayed()) {
                    System.out.println(link.getText());
                }
            }
            catch (Exception e){
                System.out.println(e);
            }
        }


    }
}
