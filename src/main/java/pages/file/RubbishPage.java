package pages.file;

import org.openqa.selenium.By;
import pages.BasePage;
import xPath.XPath;

import java.time.Duration;

public class RubbishPage extends BasePage {

    public void deleteUploadItem(){
        findByXpath(XPath.ELEMENT_TO_DELETE, Duration.ofSeconds(10)).click();
        findByXpath(XPath.GARBAGE_ICON, Duration.ofSeconds(10)).click();
        findByXpath(XPath.CONFIRM_DELETE_BUTTON_ON_RUBBISH_PAGE, Duration.ofSeconds(10)).click();
        waitForElementInVisible(By.xpath(XPath.ELEMENT_TO_DELETE), 10);
    }
}
