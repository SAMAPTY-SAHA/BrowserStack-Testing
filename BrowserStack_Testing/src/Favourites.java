import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Favourites {

    public void favourites()throws InterruptedException
    {
        WebDriver driver= DriverSet.launchBrowser();

        Thread.sleep(3000);
        // Locate the button by its class name
        WebElement button = driver.findElement(By.className("MuiButtonBase-root"));

        // Click the button
        button.click();

        Thread.sleep(2000);
        // Find the link by its ID
        WebElement favouritesLink = driver.findElement(By.id("favourites"));

        // Click the link
        favouritesLink.click();

        Thread.sleep(3000);
        // Now, navigate back to the previous page
        driver.navigate().back();

    }
}
