package org.opencart.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.opencart.pages.HomePage;
import org.opencart.utils.Constants;
import org.opencart.utils.TestContextSetup;
import org.testng.Assert;

public class HomePageStepDefinition {

    TestContextSetup testContextSetup;
    public HomePage homePage;

    public HomePageStepDefinition(TestContextSetup testContextSetup) {
        this.testContextSetup = testContextSetup;
        homePage = testContextSetup.pageObjectManager.getHomePageInstance();
    }

    @Given("User is on Home Page")
    public void user_is_on_home_page() {
        Assert.assertTrue(Constants.HOME_PAGE_TITLE.equals(homePage.getTitleHomePage()),"Home Page title is mismatched");
    }
    @And("User navigates to Login Page")
    public void user_navigates_to_login_page() {
        homePage.navigateToLoginPage();
    }

}
