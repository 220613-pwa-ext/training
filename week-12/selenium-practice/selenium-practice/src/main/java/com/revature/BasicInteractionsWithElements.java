package com.revature;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class BasicInteractionsWithElements {

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.get("http://127.0.0.1:5500");

        WebElement h1Element = driver.findElement(By.xpath("//h1[@class='a']"));
        WebElement textbox1 = driver.findElement(By.xpath("//input[@id='textbox-1']"));
        WebElement button1 = driver.findElement(By.xpath("//*[@id='btn-1']"));

        // getText()
        System.out.println(h1Element.getText());

        // click()
        button1.click();

        try {
            driver.switchTo().alert().accept(); // Click on Ok button of JavaScript alert
        } catch (NoAlertPresentException e) {
            System.out.println(e);
        }

        // sendKeys()
        textbox1.sendKeys("hello there");

        Thread.sleep(5000);

        driver.quit();
    }

}
