package org.opencart.stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.opencart.pages.MyAccountPage;
import org.opencart.utils.Constants;
import org.opencart.utils.TestContextSetup;
import org.testng.Assert;

public class MyAccountPageStepDefinition {

    TestContextSetup testContextSetup;
    public MyAccountPage myAccountPage;

    public MyAccountPageStepDefinition(TestContextSetup testContextSetup) {
        this.testContextSetup = testContextSetup;
        myAccountPage = testContextSetup.pageObjectManager.getMyAccountPageInstance();
    }

    @Then("User should land in My Account Page")
    public void userShouldLandInMyAccountPage() {
        Assert.assertTrue(myAccountPage.validatePageTitle(Constants.MY_ACCOUNT_PAGE_TITLE),"My Account Page Title mismatch");
    }

    @When("User navigates to Mac Desktop Page")
    public void userNavigatesToMacDesktopPage() {
        myAccountPage.navigateToMacDesktop();
    }
}
