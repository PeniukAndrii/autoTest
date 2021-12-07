package pages.email;

import org.openqa.selenium.WindowType;
import pages.BasePage;
import xPath.XPath;

import java.time.Duration;


public class MailMassage extends BasePage {

    public void getAttributePage(){
       findByXpath(XPath.ACTIVATE_ACC_BTN, Duration.ofSeconds(10)).click();
    }
}
