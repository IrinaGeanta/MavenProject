package curs16;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import utils.BaseTest;

import static org.testng.Assert.assertEquals;

public class JSAlertsExample extends BaseTest {
@Test(priority = 1)
    public void simpleAlert() throws InterruptedException {
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");

        driver.findElement(By.cssSelector("button[onClick = 'jsAlert()']")).click();

        Thread.sleep(3000);
        //tratam alerta js
        driver.switchTo().alert().accept();


    WebElement result = driver.findElement(By.cssSelector("p[id='result']"));
    assertEquals(result.getText(),"You successfully clicked an alert");
    }

    @Test(priority = 2)
    public void confirmJSAlert() throws InterruptedException {
        driver.findElement(By.cssSelector("button[onClick = 'jsConfirm()']")).click();

        Thread.sleep(3000);
        //tratam alerta js
        driver.switchTo().alert().dismiss();


        WebElement result = driver.findElement(By.cssSelector("p[id='result']"));
        assertEquals(result.getText(),"You clicked: Cancel");
    }

    @Test(priority = 3)
    public void promptJSAlert() throws InterruptedException {

        driver.findElement(By.cssSelector("button[onClick = 'jsPrompt()']")).click();

        Thread.sleep(3000);
        //tratam alerta js
        driver.switchTo().alert().sendKeys("Text");
        driver.switchTo().alert().accept();

        /*
        Alert alertaJS = driver.switchTo().alert();
        alertaJS.sendKeys("Text");
        alertaJS.accept();
         */

        WebElement result = driver.findElement(By.cssSelector("p[id='result']"));
        assertEquals(result.getText(),"You entered: Text");
    }
}
