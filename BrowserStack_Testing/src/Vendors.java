import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;

import static java.lang.Thread.*;
public class Vendors {

    public void vendor() throws InterruptedException {
        WebDriver driver= DriverSet.launchBrowser();

        //Selecting one option
        //driver.findElement(By.xpath("//span[@class='checkmark']")).click();

        driver.findElement(By.xpath("//span[contains(@class,'checkmark') and " +
                "contains(text(), 'Google')]")).click();
        Thread.sleep(3000);

        driver.findElement(By.xpath("//span[contains(@class,'checkmark') and " +
                "contains(text(), 'Apple')]")).click();
        Thread.sleep(3000);

        driver.findElement(By.xpath("//span[contains(@class,'checkmark') and " +
                "contains(text(), 'Samsung')]")).click();
        Thread.sleep(3000);


        driver.findElement(By.xpath("//span[contains(@class,'checkmark') and " +
                "contains(text(), 'OnePlus')]")).click();
        Thread.sleep(3000);


    }


}
