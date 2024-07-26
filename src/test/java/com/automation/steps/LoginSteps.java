package com.automation.steps;


import com.automation.pages.LoginPage;
import com.automation.utils.DriverManager;
import com.automation.utils.ReportManager;
import io.cucumber.java.en.*;
import org.testng.Assert;

public class LoginSteps {

    LoginPage loginPage = new LoginPage();

    @Given("the user navigates to the login page")
    public void navigateToLoginPage() {
        loginPage.openWebsite();
    }

    @When("the user enters the email {string}")
    public void enterEmail(String email) {
        loginPage.enterEmail(email);
    }

//    @When("the user enters the password {string}")
//    public void enterPassword(String password) {
//        loginPage.enterPassword(password);
//    }

    @When("the user clicks the submit button")
    public void clickSubmitButton() {
        ReportManager.attachScreenShot();
        loginPage.clickSubmit();
    }

    @Then("the user should be logged in successfully")
    public void verifyLogin() {
        ReportManager.attachScreenShot();
//        Assert.assertTrue(true);
    }
}
