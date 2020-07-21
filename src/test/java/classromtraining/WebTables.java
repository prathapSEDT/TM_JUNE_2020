package classromtraining;

import genericmethods.GenricMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class WebTables {
    public static void main(String[] args) throws InterruptedException {
        GenricMethods genricMethods=new GenricMethods();

        genricMethods.launchBrowser("chrome","https://money.rediff.com/gainers/bse/daily/groupa?src=gain_lose");

        WebElement table=GenricMethods.driver.findElement(By.xpath("//th[text()='Company']/ancestor::table"));

        genricMethods.waitForElementVisible(table,10);



        String rowXpath="//th[text()='Company']/ancestor::table/tbody//tr";

        List<WebElement> rowCount=GenricMethods.driver.findElements(By.xpath(rowXpath));

       for (int r=0;r<=rowCount.size()-1;r++){
           String colXpath=rowXpath+"["+(r+1)+"]/td";
           List<WebElement> colsCount=GenricMethods.driver.findElements(By.xpath(colXpath));

           for(int c=0;c<=colsCount.size()-1;c++){

               String dataXpath=rowXpath+"["+(r+1)+"]/td["+(c+1)+"]";
               String cellValue =GenricMethods.driver.findElement(By.xpath(dataXpath)).getText();
               System.out.println(cellValue);

           }


       }


    }
}
