package com.revature.testcases;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class LoginTests {

    @Test
    public void validLogin() throws InterruptedException {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        // Step 1: go to login page
        driver.get("http://ec2-18-116-32-53.us-east-2.compute.amazonaws.com/");

        // Step 2: Enter username and password
        WebElement usernameInput = driver.findElement(By.id("username"));
        WebElement passwordInput = driver.findElement(By.id("password"));

        usernameInput.sendKeys("john_doe");
        passwordInput.sendKeys("abc12345");

        // Step 3: Click login
        WebElement loginButton = driver.findElement(By.id("login-btn"));

        loginButton.click();

        // Check expected v. actual
        // See what URL we are on
        WebDriverWait wdw = new WebDriverWait(driver, Duration.ofSeconds(10)); // wait for a maximum of 10 seconds
        // check every 500ms to see if some condition occurred
        wdw.until(ExpectedConditions.urlContains("success.html"));

        String actual = driver.getCurrentUrl();
        String expected = "http://ec2-18-116-32-53.us-east-2.compute.amazonaws.com/success.html";
        Assert.assertEquals(actual, expected);

        driver.quit();
        // There's also something known as driver.close()
        // driver.close does not quit the driver, it only closes the Window
        // So, you really should be using driver.quit(), not driver.close()
    }

    @Test
    public void validUsernameInvalidPassword() {
        // Write some code to automate the test case
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.get("http://ec2-18-116-32-53.us-east-2.compute.amazonaws.com");

        WebElement usernameInput = driver.findElement(By.id("username"));
        WebElement passwordInput = driver.findElement(By.id("password"));

        usernameInput.sendKeys("john_doe");
        passwordInput.sendKeys("asdfsdf");

        WebElement loginButton = driver.findElement(By.id("login-btn"));
        loginButton.click();

        WebDriverWait wdw = new WebDriverWait(driver, Duration.ofSeconds(10));
        wdw.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='error-message']/p")));

        WebElement errorMessageParagraph = driver.findElement(By.xpath("//*[@id='error-message']/p"));
        String actual = errorMessageParagraph.getText();
        String expected = "Username and/or password is incorrect";

        Assert.assertEquals(actual, expected);

        driver.quit();
    }

    @Test
    public void invalidUsernameInvalidPassword() {
        // Write some code to automate the test case
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.get("http://ec2-18-116-32-53.us-east-2.compute.amazonaws.com");

        WebElement usernameInput = driver.findElement(By.id("username"));
        WebElement passwordInput = driver.findElement(By.id("password"));

        usernameInput.sendKeys("fgdfljqwekr");
        passwordInput.sendKeys("asdfsdf");

        WebElement loginButton = driver.findElement(By.id("login-btn"));
        loginButton.click();

        WebDriverWait wdw = new WebDriverWait(driver, Duration.ofSeconds(10));
        wdw.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='error-message']/p")));

        WebElement errorMessageParagraph = driver.findElement(By.xpath("//*[@id='error-message']/p"));
        String actual = errorMessageParagraph.getText();
        String expected = "Username and/or password is incorrect";

        Assert.assertEquals(actual, expected);

        driver.quit();
    }

    @Test
    public void invalidUsernameValidPassword() {
        // Write some code to automate the test case
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.get("http://ec2-18-116-32-53.us-east-2.compute.amazonaws.com");

        WebElement usernameInput = driver.findElement(By.id("username"));
        WebElement passwordInput = driver.findElement(By.id("password"));

        usernameInput.sendKeys("fgdfljqwekr");
        passwordInput.sendKeys("abc12345");

        WebElement loginButton = driver.findElement(By.id("login-btn"));
        loginButton.click();

        WebDriverWait wdw = new WebDriverWait(driver, Duration.ofSeconds(10));
        wdw.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='error-message']/p")));

        WebElement errorMessageParagraph = driver.findElement(By.xpath("//*[@id='error-message']/p"));
        String actual = errorMessageParagraph.getText();
        String expected = "Username and/or password is incorrect";

        Assert.assertEquals(actual, expected);

        driver.quit();
    }

}
