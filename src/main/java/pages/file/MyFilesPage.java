package pages.file;

import org.openqa.selenium.By;
import pages.BasePage;
import xPath.XPath;

import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

public class MyFilesPage extends BasePage {

    private static final String url = "C:\\pic\\test2.mp4";
    private static final String filesPage = "https://mega.nz/fm";

    public MyFilesPage checkExistSpam(){
         if(!findElementsByXpath(XPath.SKIP_SPAM_BTN, Duration.ofSeconds(5)).isEmpty()) {
             driver.navigate().to(filesPage);
         }
         return this;
    }

    public MyFilesPage clickOnUploadBtn(){
        findByXpath(XPath.UPLOAD_FILE_BTN_DROP_DOWN, Duration.ofSeconds(10)).click();
        return this;
    }

    public MyFilesPage clickOnFileUploadBtn(){
        findByXpath(XPath.UPLOAD_FILE_BTN, Duration.ofSeconds(10)).click();

        StringSelection stringSelection = new StringSelection(url);
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();  // copy URL into buffer
        clipboard.setContents(stringSelection, null);

        try {
            Robot robot = new Robot();
            robot.setAutoDelay(150);
            robot.keyPress(KeyEvent.VK_ENTER);
            robot.keyRelease(KeyEvent.VK_ENTER);
            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_V);
            robot.keyRelease(KeyEvent.VK_V);
            robot.keyRelease(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_ENTER);
            robot.keyRelease(KeyEvent.VK_ENTER);
        } catch (AWTException e) {
            e.printStackTrace();
        }
        waitForElementVisible(By.xpath(XPath.ELEMENT_DOWNLOAD), 10);
        return this;
    }

    public MyFilesPage deleteUploadItem(){
        findByXpath(XPath.ELEMENT_TO_DELETE, Duration.ofSeconds(10)).click();
        findByXpath(XPath.GARBAGE_ICON, Duration.ofSeconds(10)).click();
        findByXpath(XPath.CONFIRM_DELETE_BUTTON, Duration.ofSeconds(10)).click();
        waitForElementInVisible(By.xpath(XPath.ELEMENT_TO_DELETE), 10);
        return this;
    }

    public RubbishPage clickOnRubbishPage(){
        findByXpath(XPath.BTN_TO_RUBBISH_PAGE, Duration.ofSeconds(10)).click();
        return new RubbishPage();
        
    }
}
