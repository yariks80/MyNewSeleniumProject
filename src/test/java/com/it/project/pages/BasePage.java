package com.it.project.pages;

import com.it.project.driver.MyDriver;
import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
   protected Logger log = Logger.getLogger(this.getClass().getCanonicalName());
   static protected MyDriver driver= MyDriver.getMyDriver();


    public BasePage() {
        PageFactory.initElements(driver,this);
    }
}
