package classromtraining;

import genericmethods.GenricMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.io.IOException;

public class ActionsCLassTesting {

    public static void main(String[] args) throws IOException {

        GenricMethods genricMethods=new GenricMethods();

        genricMethods.launchBrowser("chrome","https://www.talentzing.com/");

        WebElement register=GenricMethods.driver.findElement(By.xpath("//span[text()='Register']"));

        genricMethods.waitForElementVisible(register,10);

        genricMethods.hoverAndClick(register);

        WebElement jobSeeker=GenricMethods.driver.findElement(By.xpath("//span[@id='lblJsRegister']"));
        genricMethods.forceclick(jobSeeker);

        WebElement chooseFile=GenricMethods.driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder2_flUpdResume']"));
        genricMethods.waitForElementVisible(chooseFile,15);
        genricMethods.hoverAndClick(chooseFile);
        String filePath="C:\\Users\\hanshik\\Downloads\\Information.docx";
        Runtime.getRuntime().exec("Fileupload.exe"+" "+filePath);

    }
}
