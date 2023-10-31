package curs16;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import utils.BaseTest;

import static org.testng.Assert.assertEquals;

public class JSAlertsExample extends BaseTest {
@Test
    public void simpleAlert() throws InterruptedException {
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");

        driver.findElement(By.cssSelector("button[onClick = 'jsAlert()']")).click();

        Thread.sleep(3000);
        //tratam alerta js
        driver.switchTo().alert().accept();


    WebElement result = driver.findElement(By.cssSelector("p[id='result']"));
    assertEquals(result.getText(),"You successfully clicked an alert");
    }
}
