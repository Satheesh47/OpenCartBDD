package org.opencart.pages;

import org.openqa.selenium.WebDriver;

public class PageObjectManager {
    public WebDriver driver;

    public PageObjectManager(WebDriver driver) {
        this.driver=driver;
    }

    public HomePage getHomePageInstance() {
        return new HomePage(driver);
    }
    public LoginPage getLoginPageInstance() {
        return new LoginPage(driver);
    }

    public MyAccountPage getMyAccountPageInstance() {
        return new MyAccountPage(driver);
    }

    public DesktopPage getDesktopPageInstance() {
        return new DesktopPage(driver);
    }


}
