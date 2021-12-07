package pages.auth;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import pages.BasePage;
import xPath.XPath;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Random;

public class RegisterPage extends BasePage {

    private final String FIRST_NAME = generateRandomString();
    private final String LAST_NAME = generateRandomString();
    private final String PASSWORD = "123456AAaa";
    ArrayList<String> tabs;

    public RegisterPage() {
        super();
        ((JavascriptExecutor) driver).executeScript("window.open()");
        tabs = new ArrayList<>(driver.getWindowHandles());
    }

    public BasePage switchToSecondPage(){
        driver.switchTo().window(tabs.get(1));
        return this;
    }

    public RegisterPage switchToFirstPage(){
        driver.switchTo().window(tabs.get(0));
        return this;
    }

    public RegisterPage fillAboutFields(String email){
        findByCss(XPath.REGISTER_FIRST_NAME, Duration.ofSeconds(10)).sendKeys(FIRST_NAME);
        findByCss(XPath.REGISTER_LAST_NAME, Duration.ofSeconds(10)).sendKeys(LAST_NAME);
        findByCss(XPath.REGISTER_EMAIL, Duration.ofSeconds(10)).sendKeys(email);
        return this;
    }

    public RegisterPage fillPassFields(){
        WebElement byCss = findByCss(XPath.REGISTER_PASSWORD, Duration.ofSeconds(10));
        WebElement byCss1 = findByCss(XPath.REGISTER_PASSWORD_CONFIRM, Duration.ofSeconds(10));
        byCss.click();
        byCss.sendKeys(PASSWORD);
        byCss1.click();
        byCss1.sendKeys(PASSWORD);
        return this;
    }

    public RegisterPage clickOnAgreeing(){
        findByXpath(XPath.REGISTER_CHECKBOX_FIRST, Duration.ofSeconds(10)).click();
        findByXpath(XPath.REGISTER_CHECKBOX_SECOND, Duration.ofSeconds(10)).click();
        findByXpath(XPath.REGISTER_CONFIRM_BUTTON, Duration.ofSeconds(10)).click();
        return this;
    }

    public static String generateRandomString(){
        final String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZqazwsxedcrfvtgbyhnujmiklop";
        final int lengthOfRandomText = 10;
        StringBuilder stringBuilder = new StringBuilder();
        Random random = new Random();

        for(int i = 0; i < lengthOfRandomText; i++) {
            int index = random.nextInt(alphabet.length());
            char randomChar = alphabet.charAt(index);
            stringBuilder.append(randomChar);
        }

        return stringBuilder.toString();
    }
}
