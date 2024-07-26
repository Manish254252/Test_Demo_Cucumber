package com.automation.steps;

import com.automation.pages.CheckoutPage;
import com.automation.pages.LoginPage;
import com.automation.pages.RegisterPage;
import com.automation.pages.ShippingPage;
import com.automation.utils.ConfigReader;
import com.automation.utils.DriverManager;
import com.automation.utils.ReportManager;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import static com.automation.utils.ReportManager.scenario;


public class Hooks {
    Actions actions;
    LoginPage loginPage;
    RegisterPage registerPage;
    CheckoutPage checkoutPage;
    ShippingPage shippingPage;
    WebDriver driver;
    @Before
  public   void setUp(Scenario scenario)
    {
        ConfigReader.initConfig();
        DriverManager.createDriver();
        driver = DriverManager.getDriver();
        loginPage = new LoginPage();
        registerPage = new RegisterPage();
        checkoutPage = new CheckoutPage();
        shippingPage = new ShippingPage();
        actions = new Actions(driver);
        ReportManager.initReport(scenario);
    }

    @After
  public   void tearDown(Scenario scenario)
    {

        if(scenario.isFailed())
        {
            ReportManager.attachScreenShot();
        }
        DriverManager.getDriver().quit();
    }

}
