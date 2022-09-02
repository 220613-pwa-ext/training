package com.revature.tests;

import com.revature.pages.LoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class LoginTest {

    // Positive E2E test
    @Test
    public void testValidLogin() {
        // AAA - Arrange, Act, Assert

        /*
            Arrange
         */
        WebDriverManager.chromedriver().setup(); // Automatically download the chromedriver.exe and configure it for our test case

        WebDriver driver = new ChromeDriver();

        driver.get("http://127.0.0.1:5501/login-frontend");

        LoginPage loginPage = new LoginPage(driver);

        /*
            Act
         */
        loginPage.typeUsername("testing123");
        loginPage.typePassword("password123");
        loginPage.clickLoginButton();


        /*
            Assert
         */
        String expectedUrl = "http://127.0.0.1:5501/login-frontend/user-profile.html";

        // Explicit wait
        WebDriverWait wdw = new WebDriverWait(driver, Duration.ofSeconds(10)); // WebDriverWait will poll the browser every 500ms until the expected condition occurs
        wdw.until(ExpectedConditions.urlToBe(expectedUrl)); // If this does not happen within 10 seconds, an exception will be thrown and the test will fail

        String actualUrl = driver.getCurrentUrl();

        Assert.assertEquals(actualUrl, expectedUrl); // Check to see if expected == actual

        driver.quit();
    }

    // Negative E2E test
    @Test
    public void testValidUsernameInvalidPassword() {
        /*
            Arrange
         */
        WebDriverManager.chromedriver().setup(); // Automatically download the chromedriver.exe and configure it for our test case

        WebDriver driver = new ChromeDriver();

        driver.get("http://127.0.0.1:5501/login-frontend");

        LoginPage loginPage = new LoginPage(driver);

        /*
            Act
         */
        loginPage.typeUsername("testing123");
        loginPage.typePassword("obviouslyincorrectpassword");
        loginPage.clickLoginButton();

        /*
            Assert
         */
        WebDriverWait wdw = new WebDriverWait(driver, Duration.ofSeconds(10));
        wdw.until(ExpectedConditions.alertIsPresent());

        try {
            driver.switchTo().alert().accept();
        } catch (NoAlertPresentException e) {
            Assert.fail("Alert did not appear");
        }

        driver.quit();
    }

}
