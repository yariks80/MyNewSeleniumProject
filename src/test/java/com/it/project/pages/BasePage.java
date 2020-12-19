package com.it.project.pages;

import com.it.project.driver.DriverFactory;
import com.it.project.driver.MyDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
   static protected MyDriver driver= MyDriver.getMyDriver();


    public BasePage() {
        PageFactory.initElements(driver,this);
    }
}
