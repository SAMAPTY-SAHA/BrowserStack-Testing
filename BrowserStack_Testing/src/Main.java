import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.sql.rowset.spi.SyncFactory;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws InterruptedException {

        //DriverSet driverSet= new DriverSet();
        //driverSet.launchBrowser();

        WebDriver driver= DriverSet.launchBrowser();
       // Thread.sleep(3000);



        /*Vendors vendors= new Vendors();
        vendors.vendor();

        Thread.sleep(3000);
        OrderBy orderby=new OrderBy();
        orderby.orderBy();*/

        Thread.sleep(3000);
        SignIn signIn= new SignIn();
        signIn.sinn_In();

        Thread.sleep(3000);
        AddToCart addToCart = new AddToCart();
        addToCart.cartload();

    }

}