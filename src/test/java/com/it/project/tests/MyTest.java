package com.it.project.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MyTest extends BaseTest {

    @Test
    public void test()  {
    app.login.login("ittest2", "337774a");
    Assert.assertEquals(app.dashBoard.getLbEmail(), "ittest2@i.ua");
    }


}
