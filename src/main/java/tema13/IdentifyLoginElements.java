package tema13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import utils.BaseTest;

import static org.testng.Assert.*;

public class IdentifyLoginElements extends BaseTest {


    @Test
    public void loginElement(){

        WebElement loginPopup = driver.findElement(By.linkText("Login"));
        assertEquals(loginPopup.isDisplayed(), true);

        WebElement loginField = driver.findElement(By.className("login_field"));
        WebElement passwordField = driver.findElement(By.className("password_field"));
        assertFalse(loginField.isDisplayed());
        assertFalse(passwordField.isDisplayed());

        loginPopup.click();
        assertTrue(loginField.isDisplayed());
        assertTrue(passwordField.isDisplayed());

    }
}
