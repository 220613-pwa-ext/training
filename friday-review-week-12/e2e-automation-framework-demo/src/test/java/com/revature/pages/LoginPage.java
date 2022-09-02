package com.revature.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/* Page Object Model */
// benefit is that it promotes readability and maintainability (especially if we have many test cases that interact with the same WebElements
// You only need to update the locators in one location if they ever need to change instead of in every single test case
public class LoginPage {

    private WebDriver driver;

    @FindBy(id = "username")
    private WebElement usernameInput;

    @FindBy(id = "password")
    private WebElement passwordInput;

    @FindBy(id = "login")
    private WebElement loginButton;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this); // PageFactory allow us to use @FindBy annotation on WebElement fields
    }

    public void typeUsername(String username) {
        this.usernameInput.sendKeys(username);
    }

    public void typePassword(String password) {
        this.passwordInput.sendKeys(password);
    }

    public void clickLoginButton() {
        this.loginButton.click();
    }

}
