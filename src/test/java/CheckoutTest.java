import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class CheckoutTest extends BaseTest {
    @Test
    public void fillCheckoutForm() {
        loginPage.open();
        loginPage.loginAsStandardUser();
        productsPage.addToCart("Sauce Labs Backpack");
        driver.findElement(By.className("shopping_cart_link")).click();
        driver.findElement(By.id("checkout")).click();
        checkoutPage.FormCheckout("djfghdfj", "htg", "123456");
        // assertTrue(checkoutOverviewPage.getTitle().isDisplayed(), "");

    }
}