package com.revature;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ActionsClassDemo {

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver(); // When instantiating the new WebDriver, we're passing in ChromeOptions as an argument

        driver.get("http://127.0.0.1:5500");

        WebElement textbox = driver.findElement(By.id("textbox-1"));

        // Compound actions
        // 1. Click on textbox
        // 2. Hold down the shift key
        // 3. Type in hello world
        // -> HELLO WORLD
        Actions builder = new Actions(driver);
        // Actions is a "builder" to build Action objects (without an s)

        // Action represents the compound series of steps
        Action compoundAction = builder.click(textbox).keyDown(Keys.SHIFT).sendKeys("hello world").build();

        compoundAction.perform(); // Execute the action

        Thread.sleep(5000);

        driver.quit();
    }


}
