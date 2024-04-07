package org.opencart.pages;

import org.opencart.utils.PageUtility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends PageUtility {

    @FindBy(id = "input-email")
    private WebElement txtEmail;

    @FindBy(id = "input-password")
    private WebElement txtPassword;

    @FindBy(xpath = "//input[@value='Login']")
    private WebElement btnLogin;

    @FindBy(xpath = "//div[@class='alert alert-danger alert-dismissible']")
    private WebElement msgLoginError;
    public LoginPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver,this);
    }

    public void login(String username, String password) {
        waitForElementVisibility(btnLogin,"Login Button");
        enterData(txtEmail,username,"Username");
        enterData(txtPassword,password,"Password");
        elementClick(btnLogin,"Login Button");
    }

    public boolean validateLoginErrorMessage(String expectedErrorMessage) {
        waitForElementVisibility(msgLoginError,"Login Error Message");
        String actualErrorMessage = getText(msgLoginError,"Login Error Message");
        return actualErrorMessage.equalsIgnoreCase(expectedErrorMessage);
    }





}
