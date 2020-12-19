package com.it.project.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MyTest extends BaseTest {

    @Test
    public void test() {
        Assert.assertTrue(app.login(validUser));
    }


}
