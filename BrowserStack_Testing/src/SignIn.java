import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;
public class SignIn {

    public void sinn_In() throws InterruptedException {

        WebDriver driver= DriverSet.launchBrowser();

        WebElement link = driver.findElement(By.linkText("Sign In"));
        link.click();
        Thread.sleep(3000);

        // Locate the div element by its class name
        //WebElement divElement = driver.findElement(By.className("css-tlfecz-indicatorContainer"));

        // Click on the div element
        //divElement.click();

        Thread.sleep(2000);


       WebElement inputElement = driver.findElement(By.id("react-select-2-input"));

        // Send the text "demouser" to the input element
        inputElement.sendKeys("demouser");
        inputElement.sendKeys(Keys.ENTER);

        Thread.sleep(1000);
        WebElement passwordElement = driver.findElement(By.id("react-select-3-input"));

        // Send the text "testingisfun99" to the password input element
        passwordElement.sendKeys("testingisfun99");
        passwordElement.sendKeys(Keys.ENTER);

        // Find the button element by its ID
        WebElement loginButton = driver.findElement(By.id("login-btn"));

        // Click the button
        loginButton.click();

    }
}
