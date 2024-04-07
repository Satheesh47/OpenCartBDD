package org.opencart.pages;

import org.opencart.utils.PageUtility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends PageUtility{

    @FindBy(xpath = "//a[@title='My Account']")
    private WebElement menuMyAccount;

    @FindBy(xpath = "//a[normalize-space()='Login']")
    private WebElement menuLogin;

    public HomePage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver,this);
    }

    public String getTitleHomePage() {
        return getPageTitle("Home Page");
    }

    public void navigateToLoginPage() {
        elementClick(menuMyAccount,"My Account");
        elementClick(menuLogin,"Login");
    }




}
