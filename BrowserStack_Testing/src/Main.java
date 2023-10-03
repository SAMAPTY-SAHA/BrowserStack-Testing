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

        Thread.sleep(2000);
        SignIn signIn= new SignIn();
        signIn.sinn_In();

        Thread.sleep(4000);
        Vendors vendors= new Vendors();
        vendors.vendor();

        Thread.sleep(3000);
        OrderBy orderby=new OrderBy();
        orderby.orderBy();

        Thread.sleep(3000);
        AddToCart addToCart = new AddToCart();
        addToCart.cartload();

        Thread.sleep(3000);
        OrdersHistory history= new OrdersHistory();
        history.ordersHistory();

        Thread.sleep(3000);
        Favourites favourite= new Favourites();
        favourite.favourites();

        Thread.sleep(3000);
        Logout logout= new Logout();
        logout.logOut();

        Thread.sleep(3000);
        driver.quit();


    }

}