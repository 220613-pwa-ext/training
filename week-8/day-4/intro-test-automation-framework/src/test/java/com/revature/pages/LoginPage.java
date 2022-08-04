package com.revature.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

// Page Object Model: A design pattern where we identify all elements for a particular page and centralize those elements
// into a blueprint that represents the page
// In our test cases, we can then reference the elements from the LoginPage object
public class LoginPage {

    private WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getUsernameInput() {
        return driver.findElement(By.id("username"));
    }

    public WebElement getPasswordInput() {
        return driver.findElement(By.id("password"));
    }

    public WebElement getLoginButton() {
        return driver.findElement(By.id("login-btn"));
    }

}
