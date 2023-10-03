import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class DriverSet {

    //Singleton pattern implement
    private static DriverSet driverSet;
    private static WebDriver driver;

    private DriverSet()
    {

    }

    public static WebDriver launchBrowser()
    {
        if(driverSet==null)
        {
            //Chromedriver Setup...
            driverSet= new DriverSet();
            System.setProperty("websriver.chrome.driver",
                    "/Users/macbookpro/Documents/chromedriver_mac_arm64/chromedriver");
            driver= new ChromeDriver();
            driver.get("https://www.bstackdemo.com");
        }

        return driver;
    }

}
