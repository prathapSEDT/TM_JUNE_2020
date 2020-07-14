package classromtraining;

import genericmethods.GenricMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

public class GetAllChildernUnderParent {

    public static void main(String[] args) throws IOException {
        GenricMethods genricMethods=new GenricMethods();

        genricMethods.launchBrowser("chrome","https://demo.nopcommerce.com/");
        List<WebElement> allLinks=GenricMethods.driver.findElements(By.xpath("//strong[text()='My account']/parent::div/following-sibling::ul//a"));

        for (WebElement link:allLinks){
            System.out.println();
             String linkHref=link.getAttribute("href");

            HttpURLConnection connection=(HttpURLConnection)(new URL(linkHref)).openConnection();
            connection.connect();
            System.out.println(link.getText()+" Response code : " +connection.getResponseCode());
        }


    }
}
