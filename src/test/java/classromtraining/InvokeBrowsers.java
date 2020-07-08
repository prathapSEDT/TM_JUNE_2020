package classromtraining;

import genericmethods.GenricMethods;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class InvokeBrowsers {
    public static void main(String[] args) throws InterruptedException {

        GenricMethods genricMethods=new GenricMethods();

        genricMethods.launchBrowser("chrome","https://demo.nopcommerce.com/");

        GenricMethods.driver.findElement(By.linkText("Register")).click();
        Thread.sleep(3000);
        WebElement gendermale=GenricMethods.driver.findElement(By.id("gender-male"));
        //gendermale.click();
        GenricMethods.driver.findElement(By.id("FirstName")).sendKeys("FirstName");

        //select the dropdown value
        WebElement dateOfBirth=GenricMethods.driver.findElement(By.name("DateOfBirthDay"));
        //genricMethods.selectDropDownByVisibleText(dateOfBirth,"17");

        //select the dropdown value
        WebElement month=GenricMethods.driver.findElement(By.name("DateOfBirthMonth"));
        genricMethods.selectDropDownByVisibleText(month,"April");

        //select the dropdown value
        WebElement year=GenricMethods.driver.findElement(By.name("DateOfBirthYear"));
        genricMethods.selectDropDownByVisibleText(year,"2000");


        //verify if the radio button is selected or not?
        System.out.println("Check Gender is selected or not :------::"+gendermale.isSelected());

        //verify if the dropdown list is selected or not?
        System.out.println("Check dropDown is selected or not   :-----:: "+dateOfBirth.isSelected());

        genricMethods.checkIfTheDropDownSelected(dateOfBirth,"Day");







    }
}
