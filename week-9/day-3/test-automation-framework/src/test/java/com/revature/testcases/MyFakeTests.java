package com.revature.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MyFakeTests {

    @Test
    public void fakeTestCase() {
        System.out.println("This is a fake test case");
        Assert.assertTrue(true);
    }

}
