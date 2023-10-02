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



        } catch (Exception e) {
            // Handle any exceptions if the element is not found or clickable
            e.printStackTrace();
        }
    }

}
