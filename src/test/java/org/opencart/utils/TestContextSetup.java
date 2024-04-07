package org.opencart.utils;

import org.opencart.pages.PageObjectManager;
import org.openqa.selenium.WebDriver;

public class TestContextSetup {

    public WebDriver driver;
    public PageObjectManager pageObjectManager;
    public PageUtility pageUtility;
    public TestBase testBase;

    public TestContextSetup() {
        testBase = new TestBase();
        pageObjectManager = new PageObjectManager(testBase.initializeDriver());
        pageUtility = new PageUtility(testBase.initializeDriver());
    }
}
