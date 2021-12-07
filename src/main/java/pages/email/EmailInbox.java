package pages.email;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import pages.BasePage;
import xPath.XPath;

import java.time.Duration;

public class EmailInbox extends BasePage {

    public String getEmail(){
        WebElement byXpath = findByXpath(XPath.EMAIL, Duration.ofSeconds(10));
        return byXpath.getText();
    }

    public EmailInbox clickOnRefreshBtn(){
        waitForElementVisible(By.xpath(XPath.TIMER_ELEMENT),10);
        findByXpath(XPath.REFRESH_BTN,Duration.ofSeconds(10)).click();
        return this;
    }

    public MailMassage findConfirmEmailMassage(){
        findByXpath(XPath.CONFIRM_MAIL_BTN, Duration.ofSeconds(10)).click();
        String src = findByXpath(XPath.CONFIRM_PAGE_SRC, Duration.ofSeconds(10)).getAttribute("src");
        goToMassagePage(src);
        return new MailMassage();
    }

}
