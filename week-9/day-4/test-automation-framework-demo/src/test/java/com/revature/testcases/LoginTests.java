package com.revature.testcases;

import com.revature.pages.LoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class LoginTests {

    public WebDriver driver;

    Logger logger = LoggerFactory.getLogger(LoginTests.class);

    @BeforeMethod
    public void beforeMethod() {
        WebDriverManager.chromedriver().setup();

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");

        driver = new ChromeDriver(options);
    }

    @AfterMethod
    public void afterMethod() {
        driver.quit();
        // There's also something known as driver.close()
        // driver.close does not quit the driver, it only closes the Window
        // So, you really should be using driver.quit(), not driver.close()
    }

    @Test
    public void validLogin() {
        // Step 1: go to login page
        driver.get("http://ec2-18-116-32-53.us-east-2.compute.amazonaws.com/");

        // Step 2: Enter username and password
        LoginPage loginPage = new LoginPage(driver);

        loginPage.typeUsername("john_doe");
        loginPage.typePassword("abc12345");

        // Step 3: Click login
        loginPage.clickLoginButton();

        // Check expected v. actual
        // See what URL we are on
        WebDriverWait wdw = new WebDriverWait(driver, Duration.ofSeconds(10)); // wait for a maximum of 10 seconds
        // check every 500ms to see if some condition occurred
        wdw.until(ExpectedConditions.urlContains("success.html"));

        String actual = driver.getCurrentUrl();
        String expected = "http://ec2-18-116-32-53.us-east-2.compute.amazonaws.com/success.html";
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void validLogin2() {
        // Step 1: go to login page
        driver.get("http://ec2-18-116-32-53.us-east-2.compute.amazonaws.com/");

        // Step 2: Enter username and password
        LoginPage loginPage = new LoginPage(driver);

        loginPage.typeUsername("jane_doe");
        loginPage.typePassword("password123");

        // Step 3: Click login
        loginPage.clickLoginButton();

        // Check expected v. actual
        // See what URL we are on
        WebDriverWait wdw = new WebDriverWait(driver, Duration.ofSeconds(10)); // wait for a maximum of 10 seconds
        // check every 500ms to see if some condition occurred
        wdw.until(ExpectedConditions.urlContains("success.html"));

        String actual = driver.getCurrentUrl();
        String expected = "http://ec2-18-116-32-53.us-east-2.compute.amazonaws.com/success.html";
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void validLogin3() {
        // Step 1: go to login page
        driver.get("http://ec2-18-116-32-53.us-east-2.compute.amazonaws.com/");

        // Step 2: Enter username and password
        LoginPage loginPage = new LoginPage(driver);

        loginPage.typeUsername("testing123");
        loginPage.typePassword("test");

        // Step 3: Click login
        loginPage.clickLoginButton();

        // Check expected v. actual
        // See what URL we are on
        WebDriverWait wdw = new WebDriverWait(driver, Duration.ofSeconds(10)); // wait for a maximum of 10 seconds
        // check every 500ms to see if some condition occurred
        wdw.until(ExpectedConditions.urlContains("success.html"));

        String actual = driver.getCurrentUrl();
        String expected = "http://ec2-18-116-32-53.us-east-2.compute.amazonaws.com/success.html";
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void validUsernameInvalidPassword() {
        driver.get("http://ec2-18-116-32-53.us-east-2.compute.amazonaws.com");

        LoginPage loginPage = new LoginPage(driver);

        loginPage.typeUsername("fgdfljqwekr");
        loginPage.typePassword("abc12345");

        loginPage.clickLoginButton();

        WebDriverWait wdw = new WebDriverWait(driver, Duration.ofSeconds(10));
        wdw.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='error-message']/p")));

        WebElement errorMessageParagraph = driver.findElement(By.xpath("//*[@id='error-message']/p"));
        String actual = errorMessageParagraph.getText();
        String expected = "Username and/or password is incorrect";

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void invalidUsernameInvalidPassword() {
        driver.get("http://ec2-18-116-32-53.us-east-2.compute.amazonaws.com");

        LoginPage loginPage = new LoginPage(driver);

        loginPage.typeUsername("fgdfljqwekr");
        loginPage.typePassword("abc12345");

        loginPage.clickLoginButton();

        WebDriverWait wdw = new WebDriverWait(driver, Duration.ofSeconds(10));
        wdw.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='error-message']/p")));

        WebElement errorMessageParagraph = driver.findElement(By.xpath("//*[@id='error-message']/p"));
        String actual = errorMessageParagraph.getText();
        String expected = "Username and/or password is incorrect";

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void invalidUsernameValidPassword() {
        driver.get("http://ec2-18-116-32-53.us-east-2.compute.amazonaws.com");

        LoginPage loginPage = new LoginPage(driver);

        loginPage.typeUsername("fgdfljqwekr");
        loginPage.typePassword("abc12345");

        loginPage.clickLoginButton();

        WebDriverWait wdw = new WebDriverWait(driver, Duration.ofSeconds(10));
        wdw.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='error-message']/p")));

        WebElement errorMessageParagraph = driver.findElement(By.xpath("//*[@id='error-message']/p"));
        String actual = errorMessageParagraph.getText();
        String expected = "Username and/or password is incorrect";

        Assert.assertEquals(actual, expected);
    }

}
