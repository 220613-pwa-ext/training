package com.revature.stepdefinitions;

import com.revature.pages.LoginPage;
import com.revature.tests.TestRunner;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class LoginDefinitions {

    @Given("I am at the login page")
    public void i_am_at_the_login_page() {
        WebDriverManager.chromedriver().setup();

        TestRunner.driver = new ChromeDriver();

        TestRunner.driver.get("http://127.0.0.1:5501/login-frontend");

        TestRunner.loginPage = new LoginPage(TestRunner.driver);
    }
    @When("I type in a username of {string}")
    public void i_type_in_a_username_of(String string) {
        TestRunner.loginPage.typeUsername(string);
    }
    @When("I type in a password of {string}")
    public void i_type_in_a_password_of(String string) {
        TestRunner.loginPage.typePassword(string);
    }
    @When("I click the login button")
    public void i_click_the_login_button() {
        TestRunner.loginPage.clickLoginButton();
    }
    @Then("I should be redirected to the user page")
    public void i_should_be_redirected_to_the_user_page() {
        /*
            Assert
         */
        String expectedUrl = "http://127.0.0.1:5501/login-frontend/user-profile.html";

        // Explicit wait
        WebDriverWait wdw = new WebDriverWait(TestRunner.driver, Duration.ofSeconds(10)); // WebDriverWait will poll the browser every 500ms until the expected condition occurs
        wdw.until(ExpectedConditions.urlToBe(expectedUrl)); // If this does not happen within 10 seconds, an exception will be thrown and the test will fail

        String actualUrl = TestRunner.driver.getCurrentUrl();

        Assert.assertEquals(actualUrl, expectedUrl); // Check to see if expected == actual

        TestRunner.driver.quit();
    }

    @Then("I should have an alert pop up")
    public void i_should_have_an_alert_pop_up() {
        /*
            Assert
         */
        WebDriverWait wdw = new WebDriverWait(TestRunner.driver, Duration.ofSeconds(10));
        wdw.until(ExpectedConditions.alertIsPresent());

        try {
            TestRunner.driver.switchTo().alert().accept();
        } catch (NoAlertPresentException e) {
            Assert.fail("Alert did not appear");
        }

        TestRunner.driver.quit();
    }

}
