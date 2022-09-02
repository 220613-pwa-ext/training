package com.revature.tests;

import com.revature.pages.LoginPage;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.openqa.selenium.WebDriver;

@CucumberOptions(glue="com.revature.stepdefinitions", features = { "src/test/resources/login.feature" })
public class TestRunner extends AbstractTestNGCucumberTests {

    public static WebDriver driver;
    public static LoginPage loginPage;

}
