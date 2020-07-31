package genericmethods;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class GenricMethods {


    public static WebDriver driver;

    /**
     * @Method name: launchBrowser
     * @param browserType,url
     * @Purpose: This method will launch the browser gievn by the user
     * @Return Type: NA
     */

    public void launchBrowser(String browserType,String url){
        //convert the user gievn input to Uppercase
        switch (browserType.toUpperCase()){

            case "CHROME":
                //logic for chrome
                WebDriverManager.chromedriver().setup();
                ChromeOptions options  = new ChromeOptions();
                //options.addArguments("incognito");
                options.addArguments("--disable-popup-blocking");

                DesiredCapabilities capabilities = new DesiredCapabilities();

                capabilities.setCapability(ChromeOptions.CAPABILITY, options);

                driver=new ChromeDriver(capabilities);
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

    /**
     * @method name:selectDropDownByVisibleText
     * @purpose:This method will select the dropdown with the visible text given by the user
     * @param element
     * @param option
     */
    public void selectDropDownByVisibleText(WebElement element, String option){
        Select dropDownOption=new Select(element);
        dropDownOption.selectByVisibleText(option);
    }


    /**
     * @method name:selectDropDownByValue
     * @purpose:This method will select the dropdown with the value given by the user
     * @param element
     * @param option
     */
    public void selectDropDownByValue(WebElement element, String option){
        Select dropDownOption=new Select(element);
        dropDownOption.selectByValue(option);
    }

    /**
     * @method name:selectDropDownByIndex
     * @purpose:This method will select the dropdown with the index position given by the user
     * @param element
     * @param indexoption
     */
    public void selectDropDownByIndex(WebElement element, int indexoption){
        Select dropDownOption=new Select(element);
        dropDownOption.selectByIndex(indexoption);

    }

    public boolean checkIfTheDropDownSelected(WebElement element,String valueToCompare){

        boolean selected=false;
        Select dropDownOption=new Select(element);
        String dropDownValue=dropDownOption.getFirstSelectedOption().getText();
        // check if the dropdown option is not --select--. or length is 0 or string is empty

        if(!(dropDownValue.equalsIgnoreCase(valueToCompare) || dropDownValue.length()==0 || dropDownValue.isEmpty())){
            System.out.println("Drop Down is selected");
            selected=true;
        }
        else {
            System.out.println("Drop Down is not select with any option");
        }
        return selected;


    }

public void waitForElementVisible(WebElement element, int seconds)
{
    //get the xpath from the webElement
    System.out.println(element);
    String xpath=element.toString();
    xpath=xpath.substring(xpath.lastIndexOf(" ")+1,xpath.length()-1);
    WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(seconds));
    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
}

public void hoverAndClick(WebElement element){
        Actions acc=new Actions(driver);
        acc.moveToElement(element).click(element).build().perform();

}

public void forceclick(WebElement element)
{
    JavascriptExecutor js=(JavascriptExecutor) driver;
    js.executeScript("arguments[0].click();",element);
}




}
