import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class LoginTest extends BaseTest {

    @Test
    public void userShouldLoginWithValidCredentials() {
        loginPage.open();
        loginPage.login("standard_user", "secret_sauce");
        assertTrue(productsPage.getTitle().isDisplayed(), "User was not logged in");
    }


    @Test
    public void passwordShouldBeRequiredForLogin() {
        loginPage.login("standard_user", "");
        WebElement error = driver.findElement(By.cssSelector("h3[data-test=error]"));
        assertEquals(loginPage.getError(), "Epic sadface: Password is required", "The error is incorrect");
    }


}