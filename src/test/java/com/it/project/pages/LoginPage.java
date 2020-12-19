package com.it.project.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {
	@FindBy(xpath = "//input[@name='login']")
	private WebElement inputLogin;

	@FindBy(xpath = "//input[@name='pass']")
	private WebElement inputPassword;

	@FindBy(xpath = "//input[@tabindex='5']")
	private WebElement btLogin;



    protected void login(String name, String password) {
        inputLogin.clear();
        inputLogin.sendKeys(name);
        inputPassword.clear();
        inputPassword.sendKeys(password);
        btLogin.click();

    }

}
