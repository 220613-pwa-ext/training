package com.revature.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class LoginSteps {

    public WebDriver driver;

    @Given("I am at the login page")
    public void i_am_at_the_login_page() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        driver.get("http://127.0.0.1:5500");
    }
    @When("I type in a valid username of {string}")
    public void i_type_in_a_valid_username_of(String username) {
        WebElement usernameInput = driver.findElement(By.id("username"));

        usernameInput.sendKeys(username);
    }
    @When("I type in a valid password of {string}")
    public void i_type_in_a_valid_password_of(String password) {
        WebElement passwordInput = driver.findElement(By.xpath("//input[@id='password']"));

        passwordInput.sendKeys(password);
    }
    @When("I click the login button")
    public void i_click_the_login_button() {
        WebElement loginButton = driver.findElement(By.id("login-btn"));

        loginButton.click();
    }
    @Then("I should be redirected to the success page")
    public void i_should_be_redirected_to_the_success_page() {
        // Explicit Wait
        WebDriverWait wdw = new WebDriverWait(driver, Duration.ofSeconds(10)); // check every 500 ms for an expected condition
        // up to a maximum of 10 seconds

        wdw.until(ExpectedConditions.urlToBe("http://127.0.0.1:5500/success.html"));

        Assert.assertTrue(driver.getCurrentUrl().equals("http://127.0.0.1:5500/success.html"));

        driver.quit();
    }
}
