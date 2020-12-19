package com.it.project.driver;

import io.qameta.allure.Allure;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Set;

public class MyDriver implements WebDriver {
    private WebDriver driver;
    private static int count;

    private static MyDriver myDriver;

    private MyDriver() {
        this.driver = DriverFactory.getDriver();
    }

    public static MyDriver getMyDriver() {
        if (myDriver == null)
            myDriver = new MyDriver();
            return myDriver;

    }

    @Override
    public void get(String url) {
        driver.get(url);
    }

    @Override
    public String getCurrentUrl() {
        return driver.getCurrentUrl();
    }

    @Override
    public String getTitle() {
        return driver.getTitle();
    }

    @Override
    public List<WebElement> findElements(By by) {
        return driver.findElements(by);
    }

    @Override
    public WebElement findElement(By by) {
        return driver.findElement(by);
    }

    @Override
    public String getPageSource() {
        return driver.getPageSource();
    }

    @Override
    public void close() {
        driver.close();
    }

    @Override
    public void quit() {
        driver.quit();
    }

    @Override
    public Set<String> getWindowHandles() {
        return driver.getWindowHandles();
    }

    @Override
    public String getWindowHandle() {
        return driver.getWindowHandle();
    }

    @Override
    public TargetLocator switchTo() {
        return driver.switchTo();
    }

    @Override
    public Navigation navigate() {
        return driver.navigate();
    }

    @Override
    public Options manage() {
        return driver.manage();
    }

    public void scrollUp() {
        ((JavascriptExecutor) driver).executeScript("window.scrollTo(0,0)");
    }

    public void scrollDown() {
        ((JavascriptExecutor) driver).executeScript("window.scrollTo(0,document.body.scrollHeight)");
    }

    public void takeSnapShot() {
        File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(screenshot, new File("build//screenshot//screen" + count + ".png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        Path content = Paths.get("build//screenshot//screen" + count + ".png");
        try (InputStream is = Files.newInputStream(content)) {
            Allure.addAttachment("My attachment", is);
        } catch (IOException e) {
            //NOP
        }
        count++;
    }
}
