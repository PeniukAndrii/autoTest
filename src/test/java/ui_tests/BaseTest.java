package ui_tests;

import driver_manager.DriverManager;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;

public class BaseTest {

    @BeforeTest
    public void create(){
        DriverManager.getDriver();
    }

    @AfterMethod
    public void open(){
        DriverManager.openNewWindow();
    }

    @AfterClass
    public void kill(){
        DriverManager.closeDriver();
    }

}
