import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Logout {


    public void logOut()
    {
        WebDriver driver= DriverSet.launchBrowser();
        // Find the link by its ID
        WebElement logoutLink = driver.findElement(By.id("logout"));

        // Click the link
        logoutLink.click();
    }
}
