package com.automation.steps;

import com.automation.pages.CheckoutPage;
import com.automation.pages.LoginPage;
import com.automation.pages.RegisterPage;
import com.automation.pages.ShippingPage;
import io.cucumber.java.en.*;
import org.testng.Assert;


public class CheckoutSteps {

    CheckoutPage checkoutPage = new CheckoutPage();
    LoginPage loginPage = new LoginPage();
    RegisterPage registerPage = new RegisterPage();

    @Given("the user is on the home page")
    public void userOnHomePage() {
        registerPage.register();
        loginPage.doLogin();
    }

    @When("the user navigates to the Computers section")
    public void navigateToComputersSection() {
        checkoutPage.clickOnComputersLink();
    }

    @When("the user selects the Notebooks category")
    public void selectNotebooksCategory() {
        checkoutPage.clickOnNoteBookOpt();
    }

    @When("the user adds a notebook to the cart")
    public void addNotebookToCart() {
        checkoutPage.addToCartProduct();
    }

    @When("the user clicks on the cart icon")
    public void clickOnCartIcon() {
        checkoutPage.clickOnAddToCartLogo();
    }

    @When("the user agrees to the terms and conditions")
    public void agreeToTermsAndConditions() {
        checkoutPage.clickOnTerms();
    }

    @When("the user proceeds to checkout")
    public void proceedToCheckout() {
        checkoutPage.clickOnCheckOutBTN();
    }

    @Then("the user should be on the Billing page")
    public void verifyCheckoutPage() {
        Assert.assertFalse(checkoutPage.checkoutBtnDisplayed());
    }
}
