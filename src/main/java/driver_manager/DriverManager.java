package driver_manager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverManager {

    private static WebDriver driver;

    private static void setDriver(){
        driver = new ChromeDriver(WebDriverConfig.configChrome());
    }

    public static WebDriver getDriver(){
        if(driver == null){
            setDriver();
        }
        return driver;
    }

    public static void openNewWindow(){
        driver.switchTo().newWindow(WindowType.WINDOW);
    }

    public static void closeDriver(){
        driver.close();
        driver.quit();
    }
}
