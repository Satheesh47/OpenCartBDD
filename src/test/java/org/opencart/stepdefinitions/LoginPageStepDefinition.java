package org.opencart.stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.opencart.pages.LoginPage;
import org.opencart.utils.Constants;
import org.opencart.utils.TestContextSetup;
import org.testng.Assert;

public class LoginPageStepDefinition {

    TestContextSetup testContextSetup;
    public LoginPage loginPage;

    public LoginPageStepDefinition(TestContextSetup testContextSetup) {
        this.testContextSetup = testContextSetup;
        loginPage = testContextSetup.pageObjectManager.getLoginPageInstance();
    }

    @When("User enters {string} and {string}")
    public void user_enters_and(String username, String password) {
        loginPage.login(username,password);
    }
    @Then("Error message should be displayed")
    public void error_message_should_be_displayed() {
        Assert.assertTrue(loginPage.validateLoginErrorMessage(Constants.LOGIN_PAGE_ERROR_MESSAGE));
    }
}
