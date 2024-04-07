package org.opencart.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class PageUtility {
    public WebDriver driver;
    private JavascriptExecutor js;
    private Select select;
    private Actions actions;

    public PageUtility(WebDriver driver) {
        this.driver=driver;
        js = (JavascriptExecutor) driver;
    }

    public void elementClick(WebElement element, String info){
        try {
            element.click();
            System.out.println("Clicked on element "+info);
        }catch (Exception e){
            System.out.println("Clicked on element "+info);
        }
    }

    public String getPageTitle(String info) {
        String title = driver.getTitle();
        System.out.println("Title of "+info+" is "+title);
        return title;
    }

    public void enterData(WebElement element,String data,String info){
        try {
            element.clear();
            element.sendKeys(data);
            System.out.println("Data entered on element "+info+" with data "+data);
        }catch (Exception e){
            System.out.println("Cannot enter data on element "+info+" with data "+data);
        }
    }

    public void waitForElementVisibility(WebElement element,String info) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOf(element));
        System.out.println("Element "+info+" is visible");
    }

    public String getText(WebElement element,String info){
        String text = element.getText().trim();
        System.out.println("Text from "+info+" is "+text);
        return text;
    }

    public String getAttributeValue(WebElement element,String name,String info){
        String text = element.getAttribute(name);
        System.out.println("Text from "+info+" is "+text);
        return text.trim();
    }

    public boolean isDisplayed(WebElement element,String info) {
        boolean displayed = element.isDisplayed();
        if (displayed) {
            System.out.println("Element " + info + " is displayed");
        } else {
            System.out.println("Element " + info + " is Not displayed");
        }
        return displayed;
    }

    public void javascriptClick(WebElement element, String info) {
        try {
            js.executeScript("arguments[0].click();", element);
            System.out.println("Clicked on :: " + info);
        } catch (Exception e) {
            System.out.println("Cannot click on :: " + info);
        }
    }

    public void scrollToElement(WebElement element,String info) {
        js.executeScript("arguments[0].scrollIntoView(true);", element);
        System.out.println("Clicked on :: " + info);
    }

    public void moveToElement(WebElement element,String info) {
        actions = new Actions(driver);
        actions.moveToElement(element);
        System.out.println("Moved to element "+info);
    }

    public void scrollDown() {
        js.executeScript("window.scrollBy(0,250)", "");
        System.out.println("Scrolled down");
    }

    public int numberOfElements(By by,String info) {
        int num =driver.findElements(by).size();
        if (num>0) {
            System.out.println("Number of " +info+" results - " +num);
        }
        return num;
    }

    public String getSelected(WebElement element,String info) {
        select = new Select(element);
        return select.getFirstSelectedOption().getText().trim();
    }

    public int numberOfOptionsExist(WebElement element, String info) {
        select = new Select(element);
        List<WebElement> options = select.getOptions();
        return options.size();
    }

}
