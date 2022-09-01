package com.revature;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DealingWithDropdowns {

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.get("http://127.0.0.1:5500");

        WebElement dropdown = driver.findElement(By.id("car"));
        Select dropdownSelect = new Select(dropdown); // The Select object "wraps" around the actual element
        // and provides additional methods that allow for us to select the options in the dropdown
        dropdownSelect.selectByIndex(2); // Truck
        Thread.sleep(1000);
        dropdownSelect.selectByValue("sedan"); // Sedan
        Thread.sleep(1000);
        dropdownSelect.selectByVisibleText("SUV"); // SUV

        Thread.sleep(5000);

        driver.quit();
    }

}
