package pages;

import driver_manager.DriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.email.EmailInbox;
import pages.email.MailPage;
import pages.main.StartPage;

import java.time.Duration;
import java.util.List;

import static org.openqa.selenium.support.ui.ExpectedConditions.invisibilityOfElementLocated;
import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOfElementLocated;

public class BasePage{

    protected final String startPage = "https://mega.io/";
    protected final String emailPage = "https://www.mohmal.com/ru";
    protected final String emailInBoxPage = "https://www.mohmal.com/ru/inbox";

    protected WebDriver driver;

    public BasePage(){
        this.driver = DriverManager.getDriver();
    }

    public WebElement findByXpath(String xpath,Duration duration){
        return driver.findElement(waitForElementVisible(By.xpath(xpath),duration.getSeconds()));
    }

    public List<WebElement> findElementsByXpath(String xpath, Duration duration){
        return driver.findElements(waitForElementVisible(By.xpath(xpath),duration.getSeconds()));
    }

    public WebElement findByCss(String css, Duration duration){
        return driver.findElement(waitForElementVisible(By.cssSelector(css), duration.getSeconds()));
    }

    public WebDriverWait getWaiter(long timeOutInSecond){
        WebDriverWait webDriverWait = new WebDriverWait(driver, timeOutInSecond);
        webDriverWait
                .ignoring(NoSuchElementException.class)
                .ignoring(ElementNotInteractableException.class)
                .ignoring(StaleElementReferenceException.class);
        return webDriverWait;
    }

    public By waitForElementVisible(By findStrategy, long timOutInSeconds){
        getWaiter(timOutInSeconds).until(visibilityOfElementLocated(findStrategy));
        return findStrategy;
    }

    public void waitForElementInVisible(By findStrategy, long timOutInSeconds){
        getWaiter(timOutInSeconds).until(invisibilityOfElementLocated(findStrategy));
    }

    public StartPage goToStartPage(){
        DriverManager.getDriver().get(startPage);
        return new StartPage();
    }

    public MailPage goToEmailPage(){
        DriverManager.getDriver().get(emailPage);
        return new MailPage();
    }

    public EmailInbox goToEmailInBoxPage(){
        DriverManager.getDriver().get(emailInBoxPage);
        return new EmailInbox();
    }

    public MailPage goToMassagePage(String src){
        DriverManager.getDriver().get(src);
        return new MailPage();
    }

}
