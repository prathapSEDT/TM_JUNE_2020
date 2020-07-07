package genericmethods;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GenricMethods {
    public static WebDriver driver;
    public void launchBrowser(String browserType,String url){

        switch (browserType.toUpperCase()){

            case "CHROME":
                //logic for chrome
                WebDriverManager.chromedriver().setup();
                driver=new ChromeDriver();
                break;
            case "FF":
                //logic for FF
                WebDriverManager.firefoxdriver().setup();
                driver=new FirefoxDriver();
                break;
            case "EDGE":

                //logic for edge
                WebDriverManager.edgedriver().setup();
                driver=new EdgeDriver();
                break;
            default:
                System.out.println("Invalid browser");
        }

        //launch the application
        driver.get(url);
        // maximize the driver window
        driver.manage().window().maximize();

    }



}
