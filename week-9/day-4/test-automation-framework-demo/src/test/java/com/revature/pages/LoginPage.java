package com.revature.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    // Selenium locators: id, className, tagName, cssSelector, xpath, linkText, partialLinkText, name

    private WebDriver driver;

    @FindBy(id="username")
    private WebElement usernameInput;

    @FindBy(id="password")
    private WebElement passwordInput;

    @FindBy(tagName="button")
    private WebElement loginButton;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void typeUsername(String username) {
        // The following line of code is replaced by using PageFactory instead
//        WebElement usernameInput = driver.findElement(By.id("username"));
        usernameInput.sendKeys(username);
    }

    public void typePassword(String password) {
        // The following line of code is replaced by using PageFactory instead
//        WebElement passwordInput = driver.findElement(By.id("password"));
        passwordInput.sendKeys(password);
    }

    public void clickLoginButton() {
        // The following line of code is replaced by using PageFactory instead
//        WebElement loginButton = driver.findElement(By.id("login-btn"));
        loginButton.click();
    }

}
