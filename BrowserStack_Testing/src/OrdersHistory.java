import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static java.lang.Thread.*;

public class OrdersHistory {
    public void ordersHistory() throws InterruptedException {
        WebDriver driver= DriverSet.launchBrowser();
        // Find the "Orders" link element by its ID
        WebElement ordersLink = driver.findElement(By.id("orders"));

        // Click the "Orders" link
        ordersLink.click();

        Thread.sleep(3000);
        // Now, navigate back to the previous page
        driver.navigate().back();
    }
}
