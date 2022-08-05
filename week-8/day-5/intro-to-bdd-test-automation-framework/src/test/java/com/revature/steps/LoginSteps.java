package com.revature.steps;

import com.revature.pages.LoginPage;
import com.revature.runner.TestRunner;
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

    public LoginPage loginPage;

    @Given("I am at the login page")
    public void i_am_at_the_login_page() {
        TestRunner.driver.get("http://127.0.0.1:5500");

        loginPage = new LoginPage(TestRunner.driver);
    }
    @When("I type in a username of {string}")
    public void i_type_in_a_valid_username_of(String username) {
        loginPage.typeUsername(username);
    }
    @When("I type in a password of {string}")
    public void i_type_in_a_valid_password_of(String password) {
        loginPage.typePassword(password);
    }
    @When("I click the login button")
    public void i_click_the_login_button() {
        loginPage.clickLoginButton();
    }
    @Then("I should be redirected to the success page")
    public void i_should_be_redirected_to_the_success_page() {
        // Explicit Wait
        WebDriverWait wdw = new WebDriverWait(TestRunner.driver, Duration.ofSeconds(10)); // check every 500 ms for an expected condition
        // up to a maximum of 10 seconds
        wdw.until(ExpectedConditions.urlToBe("http://127.0.0.1:5500/success.html"));
        Assert.assertTrue(TestRunner.driver.getCurrentUrl().equals("http://127.0.0.1:5500/success.html"));
    }

    @Then("I should see a message of {string}")
    public void i_should_see_a_message_of(String string) {
        Assert.assertEquals(loginPage.getErrorMessageText(), string);
    }
}
