
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class ProductsTest extends BaseTest {

    @Test
    public void productsShouldBeAddedToCart() {
        loginPage.open();
        loginPage.loginAsStandardUser();
        productsPage.addToCart("Sauce Labs Backpack");
        driver.findElement(By.className("shopping_cart_link")).click();
        assertTrue(productsPage.getTitle().isDisplayed(), "User did not get into the cart ");

    }

    @Test
    public void Add6ProductsToCart() {
        loginPage.open();
        loginPage.loginAsStandardUser();
        productsPage.addToCart("Sauce Labs Backpack");
        productsPage.addToCart("Sauce Labs Bolt T-Shirt");
        productsPage.addToCart("Sauce Labs Onesie");
        productsPage.addToCart("Sauce Labs Bike Light");
        productsPage.addToCart("Sauce Labs Fleece Jacket");
        productsPage.addToCart("Test.allTheThings() T-Shirt (Red)");
        driver.findElement(By.className("shopping_cart_link")).click();
        assertTrue(productsPage.getTitle().isDisplayed(), "User did not get into the cart ");

    }
}


