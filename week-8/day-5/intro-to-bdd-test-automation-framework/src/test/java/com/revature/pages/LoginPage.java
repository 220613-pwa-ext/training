package com.revature.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPage {

    // HAS-A relationship
    // properties of the object
    // A LoginPage object HAS-A WebDriver object
    // A LoginPage object HAS-A WebDriverWait object

    // A Car object HAS-A Engine object
    // A Car object HAS-A Transmission object

    private WebDriver driver;
    private WebDriverWait wdw;

    @FindBy(id="username")
    private WebElement usernameInput;

    @FindBy(css="input[id='password']")
    private WebElement passwordInput;

    @FindBy(xpath="//button[@id='login-btn']")
    private WebElement loginButton;

    @FindBy(xpath="//div[@id='error-message']/p")
    private WebElement errorMessageParagraph;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        this.wdw = new WebDriverWait(driver, Duration.ofSeconds(10));
        PageFactory.initElements(driver, this);
    }

    public void typeUsername(String username) {
        usernameInput.sendKeys(username);
    }

    public void typePassword(String password) {
        passwordInput.sendKeys(password);
    }

    public void clickLoginButton() {
        loginButton.click();
    }

    public String getErrorMessageText() {
        // This element only appears after some time once we have clicked the login button if we entered invalid credentials
        // It is not immediately available on the page, so we need to wait for it
        wdw.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@id='error-message']/p")));
        return errorMessageParagraph.getText();
    }

}
