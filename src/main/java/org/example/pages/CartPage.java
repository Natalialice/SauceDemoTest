package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class CartPage extends BasePage {

    private final By TITLE = By.cssSelector(".title");

    private final By REMOVE = By.xpath("//div[text()='%s']/ancestor::div[@class='cart_item']//button");

    private final By CONTINUE_SHOPPING = By.id("continue-shopping");

    private final By CHECKOUT = By.id("checkout");


    public CartPage(WebDriver driver) {
        super(driver);
    }

    public void open() {
        driver.get(BASE_URL + "cart.html");
    }


}


