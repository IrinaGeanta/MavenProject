package curs16;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import utils.BaseTest;

public class IsEnabledExample extends BaseTest {

    @Test
    public void isEnabledTest(){
        // pe elemente care primesc text de la tastatura
        //verifica dc sunt sau nu activate

        WebElement login = driver.findElement(By.cssSelector("a[href='#popup_login']"));
        login.click();

        WebElement userField = driver.findElement(By.cssSelector("input[name='log']"));
        System.out.println("Before disable: "+ userField.isEnabled());

        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("arguments[0].setAttribute('disabled', '')", userField);

        System.out.println("After disable: "+ userField.isEnabled());

        userField.sendKeys("user");



    }
}
