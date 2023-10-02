import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddToCart {

    public void cartload()
    {
        WebDriver driver= DriverSet.launchBrowser();
        try {
            // Find the item by its ID
            WebElement item = driver.findElement(By.id("3"));
            System.out.println(item);
            // Find the "Add to cart" button within the item
            WebElement addToCartButton = item.findElement(By.className("shelf-item__buy-btn"));
            System.out.println(addToCartButton);
            // Perform a click action on the "Add to cart" button
            addToCartButton.click();


            // You can add further actions or verifications here if needed
            Thread.sleep(1000);
            WebElement plusButton = driver.findElement(By.xpath("//button[@class='change-product-button' and text()='+']"));

            // Click the plus button
            plusButton.click();

            Thread.sleep(3000);
            WebElement minusButton = driver.findElement(By.xpath("//button[@class='change-product-button' and text()='-']"));

            // Click the plus button
            minusButton.click();

            Thread.sleep(1000);
            // Find the Checkout button by its class name
            WebElement checkoutButton = driver.findElement(By.className("buy-btn"));

            // Click the Checkout button
            checkoutButton.click();

            Thread.sleep(2000);
            // Find the input element by its ID
            WebElement firstNameInput = driver.findElement(By.id("firstNameInput"));

            // Send values to the input field
            firstNameInput.sendKeys("John");

            // Find the input field element by its ID
            WebElement lastNameInput = driver.findElement(By.id("lastNameInput"));

            // Send a value to the input field
            lastNameInput.sendKeys("Doe");

            // Find the input field element by its ID
            WebElement addressLine1Input = driver.findElement(By.id("addressLine1Input"));

            // Send a value to the input field
            addressLine1Input.sendKeys("123 Main Street");

            // Find the input field element by its ID
            WebElement provinceInput = driver.findElement(By.id("provinceInput"));

            // Send a value to the input field
            provinceInput.sendKeys("California");

            // Find the input field element by its ID
            WebElement postCodeInput = driver.findElement(By.id("postCodeInput"));

            // Send a value to the input field
            postCodeInput.sendKeys("12345");

            // Find the "Submit" button element by its ID
            WebElement submitButton = driver.findElement(By.id("checkout-shipping-continue"));

            // Click the "Submit" button
            submitButton.click();


            Thread.sleep(3000);
            // Find the "Continue Shopping" button element by its class name
            WebElement continueShoppingButton = driver.findElement(By.className("optimizedCheckout-buttonSecondary"));

            // Click the "Continue Shopping" button
            continueShoppingButton.click();



        } catch (Exception e) {
            // Handle any exceptions if the element is not found or clickable
            e.printStackTrace();
        }
    }

}
