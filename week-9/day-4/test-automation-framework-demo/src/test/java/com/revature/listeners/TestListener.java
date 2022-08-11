package com.revature.listeners;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListener implements ITestListener {

    Logger logger = LoggerFactory.getLogger(TestListener.class);

    @Override
    public void onTestSuccess(ITestResult result) {
        String testName = result.getName();
        logger.info(testName + " passed");
    }

    @Override
    public void onTestFailure(ITestResult result) {
        String testName = result.getName();
        logger.error(testName + " failed");
    }

}
