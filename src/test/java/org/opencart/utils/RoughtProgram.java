package org.opencart.utils;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class RoughtProgram {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver;
        System.setProperty("webdriver.chrome.driver", Constants.CHROME_DRIVER_PATH);
        driver = new ChromeDriver();
        driver.get("https://awesomeqa.com/ui/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//a[@title='My Account']")).click();
        driver.findElement(By.xpath("//a[normalize-space()='Login']")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("input-email")).sendKeys("satheesh.it47@gmail.com");
        driver.findElement(By.id("input-password")).sendKeys("Tester@2024");
        driver.findElement(By.xpath("//input[@value='Login']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id='menu']/div[2]/ul/li[7]/a")).click();

//        WebElement element = driver.findElement(By.xpath("//div[@class='product-thumb']"));
//        System.out.println(element.getSize());
//        int size = driver.findElements(By.xpath("//a[normalize-space()='Samsung Galaxy Tab 10.1']")).size();
//        System.out.println(size);
        WebElement element = driver.findElement(By.xpath("//a[normalize-space()='Canon EOS 5D']"));
        JavascriptExecutor js = (JavascriptExecutor)driver;
        //js.executeScript("window.scrollBy(0,250)", "");
        js.executeScript("arguments[0].scrollIntoView(true);", element);
        System.out.println(element.isDisplayed());
        js.executeScript("arguments[0].click();", element);

    }
}
