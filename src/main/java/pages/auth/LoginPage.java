package pages.auth;

import org.openqa.selenium.WindowType;
import pages.BasePage;
import pages.file.MyFilesPage;
import xPath.XPath;

import java.time.Duration;

public class LoginPage extends BasePage {

   public LoginPage setLogin(String login){
       findByCss(XPath.LOGIN_FIELD, Duration.ofSeconds(10)).sendKeys(login);
       return this;
   }

   public LoginPage setPass(String pass){
       findByCss(XPath.PASSWORD_FIELD, Duration.ofSeconds(10)).sendKeys(pass);
       return this;
   }

   public MyFilesPage clickOnSubmitButton(){
       findByXpath(XPath.CONFIRM_LOGIN_BTN, Duration.ofSeconds(10)).click();
       return new MyFilesPage();
   }

   public void checkIncorrectPass(){
       findByXpath(XPath.CONFIRM_LOGIN_BTN, Duration.ofSeconds(10)).click();
       findByXpath(XPath.INCORRECT_PASS_MASSAGE, Duration.ofSeconds(10));
   }
}
