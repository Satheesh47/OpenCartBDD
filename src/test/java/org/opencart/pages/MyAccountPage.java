package org.opencart.pages;

import org.opencart.utils.PageUtility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyAccountPage extends PageUtility {

    public MyAccountPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//a[normalize-space()='Desktops']")
    private WebElement menuDesktops;

    @FindBy(xpath = "(//a[contains(text(),'Mac')])[1]")
    private WebElement menuMacDesktop;

    public boolean validatePageTitle(String expectedTitle){
        String actualTitle = getPageTitle("My Account Page");
        return actualTitle.equalsIgnoreCase(expectedTitle);
    }

    public void navigateToMacDesktop() {
        elementClick(menuDesktops,"Desktops");
        javascriptClick(menuMacDesktop,"Mac Desktop");
    }

}
