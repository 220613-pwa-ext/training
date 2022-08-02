package com.revature.testcases;

import com.revature.pages.LoginPage;
import com.revature.pages.SuccessPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class LoginTests {

    public WebDriver driver;

    @BeforeMethod // Used to set up a resource before each test case
    public void setup() {
        // Step 0 (Automation setup): Setup WebDriver
        WebDriverManager.chromedriver().setup(); // go and download chromedriver.exe (windows) or chromedriver (mac)

        driver = new ChromeDriver();
    }

    @AfterMethod // Commonly used to "clean up" resources after each test case
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void validLogin() {
        // Step 1. Go to login page
        driver.get("http://127.0.0.1:5500"); // URL for frontend
        LoginPage loginPage = new LoginPage(driver);

        // Step 2. Enter valid username
        loginPage.getUsernameInput().sendKeys("john_doe");

        // Step 3. Enter valid password
        loginPage.getPasswordInput().sendKeys("abc12345");

        // Step 4. Click on login button
        loginPage.getLoginButton().click();

        // Assert actual == expected
        WebDriverWait wdw = new WebDriverWait(driver, Duration.ofSeconds(10)); // if what we are waiting for does not appear within 10 seconds, automatically fail
        // the test case by throwing an exception
        wdw.until(ExpectedConditions.urlToBe("http://127.0.0.1:5500/success.html")); // explicit wait

        SuccessPage successPage = new SuccessPage(driver);

        Assert.assertEquals(driver.getTitle(), "Success!");
        Assert.assertEquals(driver.getCurrentUrl(), "http://127.0.0.1:5500/success.html");
        Assert.assertTrue(successPage.getMainHeading().isDisplayed());
    }

}
