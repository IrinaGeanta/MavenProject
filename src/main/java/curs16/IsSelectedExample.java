package curs16;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import utils.BaseTest;

public class IsSelectedExample extends BaseTest {

    //doar pt elemente type = checkbox sau type = radiobutton

    @Test
    public void isSelectedTest(){
        WebElement login = driver.findElement(By.cssSelector("a[href='#popup_login']"));
        login.click();

        WebElement rememberMeCheckbox = driver.findElement(By.cssSelector("input[id='rememberme']"));

        System.out.println("Before click: " + rememberMeCheckbox.isSelected());

        rememberMeCheckbox.click();
        System.out.println("After click: " + rememberMeCheckbox.isSelected());

        System.out.println("---------------------------------------------");

        WebElement userField = driver.findElement(By.cssSelector("input[name='log']"));
        System.out.println("Before click: " + userField.isSelected());

        userField.click();
        System.out.println("After click: " + userField.isSelected());
    }
}
