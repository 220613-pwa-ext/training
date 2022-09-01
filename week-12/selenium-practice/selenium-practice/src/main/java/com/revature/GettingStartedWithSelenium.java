package com.revature;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GettingStartedWithSelenium {

    public static void main(String[] args) throws InterruptedException {

        // Old way
        // System.setProperty("webdriver.chrome.driver", "C:/Users/revature/Desktop/chromedriver.exe");

        // Modern way
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.get("http://127.0.0.1:5500");

        Thread.sleep(5000);

        driver.quit();
    }

}
