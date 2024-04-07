package org.opencart.pages;

import org.opencart.utils.Constants;
import org.opencart.utils.PageUtility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DesktopPage extends PageUtility {
    public DesktopPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//h1[normalize-space()='iMac']")
    private WebElement macDesktop;

    @FindBy(xpath = "//a[contains(text(),'Phones & PDAs')]")
    private WebElement phonesMenu;

    @FindBy(xpath = "//a[contains(text(),'Tablets')]")
    private WebElement tabletsMenu;

    @FindBy(xpath = "//*[@id='menu']/div[2]/ul/li[7]/a")
    private WebElement camerasMenu;

    @FindBy(xpath = "//button[@id='button-cart']")
    private WebElement btnAddToCart;

    @FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
    private WebElement msgConfirmation;

    @FindBy(xpath = "//*[@class='product-thumb']/div[2]/div/h4/a[contains(text(),'iPhone')]")
    private WebElement iPhone;

    @FindBy(xpath = "//*[@class='product-thumb']/div[2]/div/h4/a[contains(text(),'Samsung Galaxy Tab 10.1')]")
    private WebElement samsungTab;

   private By camerasResults = By.xpath("//div[@class='product-thumb']");

    @FindBy(xpath = "//*[@class='product-thumb']/div[2]/div/h4/a[contains(text(),'Canon EOS 5D')]")
    private WebElement canonCamera;

    @FindBy(xpath = "//*[@class='product-thumb']/div[2]/div/h4/a[contains(text(),'Nikon D300')]")
    private WebElement nikonCamera;

    @FindBy(xpath = "//select[@id='input-option226']")
    private WebElement canonCameraOptions;

    @FindBy(xpath = "//div[@class='text-danger']")
    private WebElement canonCameraErrorMessage;

    public boolean verifyMacDesktopDisplayed() {
        waitForElementVisibility(macDesktop,"Mac Desktop");
        return isDisplayed(macDesktop,"Mac Desktop");
    }

    public boolean verifySamsungTabDisplayed() {
        scrollDown();
        waitForElementVisibility(samsungTab,"Samsung Tab");
        return isDisplayed(samsungTab,"Samsung Tab");
    }

    public void clickMacDesktop() {
        elementClick(macDesktop,"Mac Desktop");
    }

    public void clickPhonesMenu() {
        elementClick(phonesMenu,"Phones");
    }

    public void clickTabletsMenu() {
        elementClick(tabletsMenu,"Tablets");
    }

    public void clickCamerasMenu() {
        elementClick(camerasMenu,"Cameras");
    }

    public boolean verifyMacDesktopPageTitle(String expectedTitle) {
        String actualTile = getPageTitle("Mac Desktop");
        return actualTile.equalsIgnoreCase(expectedTitle);
    }

    public void clickAddToCartButton() {
        elementClick(btnAddToCart,"Add to Cart");
    }

    public boolean verifyConfirmationMessageDisplayed() {
        waitForElementVisibility(msgConfirmation,"Message Confirmation");
        return isDisplayed(msgConfirmation,"Confirmation Message");
    }

    public boolean validateConfirmationMessage() {
        String actualMessage = getText(msgConfirmation,"Confirmation Message");
        return actualMessage.contains(Constants.CONFIRMATION_MESSAGE);
    }

    public boolean verifyIphoneIsDisplayed() {
        return isDisplayed(iPhone,"iPhone");
    }

    public void addIphoneToCart() {
        scrollDown();
        waitForElementVisibility(iPhone,"iPhone");
        moveToElement(iPhone,"iPhone");
        javascriptClick(iPhone,"iPhone");
        javascriptClick(btnAddToCart,"Add to Cart");
    }

    public void selectCanonCamera() {
        waitForElementVisibility(canonCamera,"Canon Camera");
        javascriptClick(canonCamera,"Canon camera");
    }

    public void addCanonToCart() {
        waitForElementVisibility(btnAddToCart,"Add to Cart");
        elementClick(btnAddToCart,"Add to Cart");
    }

    public boolean verifyCanonCameraHaveNoOptions() {
        String selected = getSelected(canonCameraOptions,"Canon Camera options");
        int num = numberOfOptionsExist(canonCameraOptions,"Canon Camera options");
        boolean flag = false;
        if(selected.equalsIgnoreCase("--- Please Select ---") && num == 1) {
            flag = true;
        }
        return flag;
    }

    public boolean validCanonCameraErrorMessage(String expectedMessage) {
        String actualMessage = getText(canonCameraErrorMessage,"Canon Camera Error Message");
        return actualMessage.equalsIgnoreCase(expectedMessage);
    }

    public void addSamsungTabToCart() {
        elementClick(samsungTab,"Samsung Tab");
        waitForElementVisibility(btnAddToCart,"Add to Cart");
        elementClick(btnAddToCart,"Add to Cart");
    }

    public boolean verifyCamersAreDisplayed() {
        if(numberOfElements(camerasResults,"Cameras")>0) {
            return true;
        }
        return false;
    }

    public void addNikonCameraToCart() {
        javascriptClick(nikonCamera,"Nikon Camera");
        javascriptClick(btnAddToCart,"Add to Cart");
    }
}
