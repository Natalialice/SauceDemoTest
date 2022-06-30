import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class CartTest extends BaseTest {
    @Test
    public void productsAddedToCart() {
        loginPage.open();
        loginPage.loginAsStandardUser();
        productsPage.addToCart("Sauce Labs Onesie");
        driver.findElement(By.className("shopping_cart_link")).click();
        assertTrue(productsPage.getTitle().isDisplayed(), "Products not added to cart");

    }

    @Test
    public void checkout() {
        loginPage.open();
        loginPage.loginAsStandardUser();
        productsPage.addToCart("Sauce Labs Onesie");
        driver.findElement(By.className("shopping_cart_link")).click();
        assertTrue(productsPage.getTitle().isDisplayed(), "Products not added to cart");
        driver.findElement(By.id("checkout")).click();
        assertTrue(checkoutPage.getTitle().isDisplayed(), "");
    }
}
