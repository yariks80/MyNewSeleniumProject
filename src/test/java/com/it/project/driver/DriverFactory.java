package com.it.project.driver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class DriverFactory {
    static  public WebDriver getDriver() {
        WebDriver driver=null;
        String name = System.getProperty("driver");
        if (name != null) {
            if ("fireFox".equals(name)) {
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
            } else if ("chrome".equals(name)) {
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
            } else {
                throw new UnsupportedOperationException();
            }
        } else {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        }
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.i.ua/");
        return driver;
    }
}
