package com.revature;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeOptionsDemo {

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        options.addArguments("start-maximized");
        // options.addArguments("--headless"); // No browser window will pop up (should be used for machines that don't have a screen, such as an EC2 instance)
        WebDriver driver = new ChromeDriver(options); // When instantiating the new WebDriver, we're passing in ChromeOptions as an argument

        driver.get("http://127.0.0.1:5500");

        Thread.sleep(5000);

        driver.quit();
    }

}
