package pages.email;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import pages.BasePage;
import xPath.XPath;

import java.time.Duration;

import static pages.auth.RegisterPage.generateRandomString;

public class MailPage extends BasePage {

    public MailPage clickOnCustomEmailButton() {
        waitForElementVisible(By.xpath(XPath.CUSTOM_MAIL_BTN),5);
        findByXpath(XPath.CUSTOM_MAIL_BTN, Duration.ofSeconds(10)).click();
        return this;

    }

    public MailPage fillInputField() {
        findByXpath(XPath.CUSTOM_MAIL_INPUT, Duration.ofSeconds(10)).sendKeys(generateRandomString(), Keys.ENTER);
        return this;
    }

    public EmailInbox clickOnSubmitButton(){
        findByXpath(XPath.AGREE_MAIL_BTN, Duration.ofSeconds(10)).click();
        return new EmailInbox();
    }


}
