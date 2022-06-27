package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }
public void open(){
    driver.get("https://www.saucedemo.com/");
}
    private final By userNameinput = By.id("user-name");
    private final By passwordInput = By.id("password");
    private final By loginButton = By.id("login-button");
    private final By error = By.cssSelector("h3[data-test=error]");


    public  void login(String user, String password) {
        driver.findElement(userNameinput).sendKeys(user);
        driver.findElement(passwordInput).sendKeys(password);
        driver.findElement(loginButton).submit();
    }
    public String getError(){
        return driver.findElement(error).getText();
    }
}
