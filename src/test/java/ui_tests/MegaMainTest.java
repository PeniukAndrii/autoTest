package ui_tests;

import org.testng.annotations.Test;
import pages.auth.RegisterPage;
import pages.file.MyFilesPage;
import pages.file.RubbishPage;
import pages.main.StartPage;

public class MegaMainTest extends BaseTest{

//    private static final String LOGIN = "uuxyamznvf@mozej.com";
    private static final String PASSWORD = "123456AAaa";
    private String email;

    @Test(description = "Registration new account")
    public void registerTest(){
        RegisterPage registerPage = new StartPage()
                .goToStartPage()
                .clickOnRegisterBTN();

        String email = registerPage
                .switchToSecondPage()
                .goToEmailPage()
                .clickOnCustomEmailButton()
                .fillInputField()
                .clickOnSubmitButton()
                .getEmail();

        registerPage
                .switchToFirstPage()
                .fillAboutFields(email)
                .fillPassFields()
                .clickOnAgreeing()
                .switchToSecondPage()
                .goToEmailInBoxPage()
                .clickOnRefreshBtn()
                .findConfirmEmailMassage()
                .getAttributePage();

        this.email = email;
        System.out.println(email);
    }

    @Test(description = "Check incorrect pass", dependsOnMethods = {"registerTest"})
    public void incorrectPassTest(){
        new StartPage()
                .goToStartPage()
                .clickOnLogInBTN()
                .clickOpenInFullSizeIfNeed()
                .setLogin(email)
                .setPass("oleg1234")
                .checkIncorrectPass();
    }

    @Test(description = "Login to mega.com -> add file -> delete this file -> delete this file from recycle bin", dependsOnMethods = {"incorrectPassTest"})
    public void uploadAndDeleteFile(){
        MyFilesPage myFilesPage = new StartPage()
                .goToStartPage()
                .clickOnLogInBTN()
                .clickOpenInFullSizeIfNeed()
                .setLogin(email)
                .setPass(PASSWORD)
                .clickOnSubmitButton();

        RubbishPage rubbishPage = myFilesPage
                .checkExistSpam()
                .clickOnUploadBtn()
                .clickOnFileUploadBtn()
                .deleteUploadItem()
                .clickOnRubbishPage();

        rubbishPage
                .deleteUploadItem();
    }

}
