package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckoutPage extends BasePage {

    private final By TITLE = By.cssSelector(".title");
    private final By FIRST_NAME_INPUT = By.id("first-name");
    private final By LAST_NAME_INPUT = By.id("last-name");
    private final By ZIP_POSTAL_CODE = By.id("postal-code");
    private final By CONTINUE_BUTTON = By.id("continue");
    private final By CANSEL_BUTTON = By.id("cancel");
    private final By ERROR = By.cssSelector("h3[data-test=error]");

    public CheckoutPage(WebDriver driver) {
        super(driver);
    }

    public void FormCheckout(String firstName, String lastName, String zipPoctalCode) {
        driver.findElement(FIRST_NAME_INPUT).sendKeys(firstName);
        driver.findElement(LAST_NAME_INPUT).sendKeys(lastName);
        driver.findElement(ZIP_POSTAL_CODE).sendKeys(zipPoctalCode);
        driver.findElement(CONTINUE_BUTTON).submit();
    }

    public void FormCheckoutWithValidData() {
        FormCheckout("rwer", "fgjhfgj", "12345");
    }

    public WebElement getTitle() {
        return driver.findElement(TITLE);
    }

    public String getError() {
        return driver.findElement(ERROR).getText();
    }

}
