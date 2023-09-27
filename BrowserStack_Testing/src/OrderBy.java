import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
public class OrderBy {

    public void orderBy() throws InterruptedException {

        WebDriver driver= DriverSet.launchBrowser();

        driver.findElement(By.xpath("//select/option[@value='lowestprice']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//select/option[@value='highestprice']")).click();

    }


}
