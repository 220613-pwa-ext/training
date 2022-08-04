package com.revature.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.Test;

@CucumberOptions(glue="com.revature.steps", features={"src/test/resources/login_scenario_outline_demo.feature", "src/test/resources/login_inline_parameter_demo.feature"})
public class TestRunner extends AbstractTestNGCucumberTests {
}
