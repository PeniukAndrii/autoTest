package pages.main;

import pages.BasePage;
import pages.auth.LoginPage;
import pages.auth.RegisterPage;
import xPath.XPath;

import java.time.Duration;


public class StartPage extends BasePage {


    public StartPage clickOnLogInBTN(){
        findByXpath(XPath.LOGIN_BUTTON, Duration.ofSeconds(10)).click();
    return this;
    }

    public LoginPage clickOpenInFullSizeIfNeed(){
        if(!findElementsByXpath(XPath.LOGIN_FULL_SIZE_ICON, Duration.ofSeconds(10)).isEmpty()) {
            findByXpath(XPath.LOGIN_FULL_SIZE_ICON, Duration.ofSeconds(10)).click();
        }
        return new LoginPage();
    }

    public RegisterPage clickOnRegisterBTN(){
        findByXpath(XPath.REGISTER_BUTTON, Duration.ofSeconds(10)).click();
        return new RegisterPage();
    }
}
