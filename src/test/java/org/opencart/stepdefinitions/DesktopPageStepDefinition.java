package org.opencart.stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.opencart.pages.DesktopPage;
import org.opencart.utils.TestContextSetup;
import org.testng.Assert;

public class DesktopPageStepDefinition {

    TestContextSetup testContextSetup;
    public DesktopPage desktopPage;

    public DesktopPageStepDefinition(TestContextSetup testContextSetup) {
        this.testContextSetup = testContextSetup;
        desktopPage = testContextSetup.pageObjectManager.getDesktopPageInstance();
    }

    @Then("User should see a Mac Desktop")
    public void userShouldSeeAMacDesktop() {
        Assert.assertTrue(desktopPage.verifyMacDesktopDisplayed(),"Mac Desktop is not displayed");
    }

    @When("User clicks on Add to Cart button")
    public void userClicksOnAddToCartButton() {
        desktopPage.clickAddToCartButton();
    }

    @When("User clicks on Phones option in Menu")
    public void userClicksOnPhonesOptionInMenu() {
        desktopPage.clickPhonesMenu();
    }

    @Then("User should see iPhones in the results")
    public void userShouldSeeIPhonesInTheResults() {
        Assert.assertTrue(desktopPage.verifyIphoneIsDisplayed());
    }

    @When("User select iPhone and add it to cart")
    public void userSelectIPhoneAndAddItToCart() {
        desktopPage.addIphoneToCart();
    }

    @Then("User should see a confirmation message that product has been added to the cart")
    public void userShouldSeeAConfirmationMessageThatProductHasBeenAddedToTheCart() {
        Assert.assertTrue(desktopPage.verifyConfirmationMessageDisplayed(),"Confirmation Message is not displayed");
        Assert.assertTrue(desktopPage.validateConfirmationMessage(),"Confirmation Message is not matched");
    }

    @When("User clicks on Tablets option in Menu")
    public void userClicksOnTabletsOptionInMenu() {
        desktopPage.clickTabletsMenu();
    }

    @Then("User should see Samsung Galaxy tab in the results")
    public void userShouldSeeSamsungGalaxyTabInTheResults() {
        Assert.assertTrue(desktopPage.verifySamsungTabDisplayed(),"Samsung Tab is not displayed");
    }

    @When("User select Samsung Galaxy tab and add it to cart")
    public void userSelectSamsungGalaxyTabAndAddItToCart() {
        desktopPage.addSamsungTabToCart();
    }

    @When("User clicks on Cameras option in Menu")
    public void userClicksOnCamerasOptionInMenu() {
        desktopPage.clickCamerasMenu();
    }

    @Then("User should see Cameras in the results")
    public void userShouldSeeCamerasInTheResults() {
        Assert.assertTrue(desktopPage.verifyCamersAreDisplayed(),"Cameras results are not displayed");
    }

    @When("User select Canon camera and add it to cart")
    public void userSelectCanonCameraAndAddItToCart() {
        desktopPage.addCanonToCart();
    }

    @When("User select Canon camera")
    public void userSelectCanonCamera() {
        desktopPage.selectCanonCamera();
    }

    @Then("User should see no options available for Canon camera")
    public void userShouldSeeNoOptionsAvailableForCanonCamera() {
        Assert.assertTrue(desktopPage.verifyCanonCameraHaveNoOptions(),"Canon Camera have options");
    }

    @Then("User should see a error message when try to add it to the cart")
    public void userShouldSeeAErrorMessageWhenTryToAddItToTheCart() {
        desktopPage.addCanonToCart();
        Assert.assertTrue(desktopPage.validCanonCameraErrorMessage("Select required!"),"Canon Error message mismatched");
    }

    @When("User select Nikon camera and add it to cart")
    public void userSelectNikonCameraAndAddItToCart() {
        desktopPage.addNikonCameraToCart();
    }
}
