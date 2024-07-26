package com.automation.steps;

import com.automation.pages.RegisterPage;
import io.cucumber.java.en.*;
import org.testng.Assert;

public class RegisterSteps {

    RegisterPage registerPage = new RegisterPage();

    @Given("the user navigates to the registration page")
    public void navigateToRegistrationPage() {
        registerPage.openWebsite();
    }

    @When("the user selects the gender {string}")
    public void selectGender(String gender) {
        registerPage.selectMaleGender(); // Assuming male gender for simplicity
    }

    @When("the user enters the first name {string}")
    public void enterFirstName(String firstName) {
        registerPage.enterFirstName(firstName);
    }

    @When("the user enters the last name {string}")
    public void enterLastName(String lastName) {
        registerPage.enterLastName(lastName);
    }

    @When("the user selects date of birth {string}")
    public void selectDOB(String dob) {
        registerPage.selectDOB(dob);
    }


    @When("the user enters the password {string}")
    public void enterPassword(String password) {
        registerPage.enterPassword(password);
    }

    @When("the user confirms the password {string}")
    public void enterConfirmPassword(String confirmPassword) {
        registerPage.enterConfirmPassword(confirmPassword);
    }

    @When("the user clicks the register button")
    public void clickRegisterButton() {
        registerPage.clickRegisterBtn();
    }

    @Then("the registration should be successful")
    public void verifyRegistration() {

    }
}
