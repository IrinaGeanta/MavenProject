package curs17;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import utils.BaseTest;

import java.time.Duration;

import static org.testng.Assert.assertEquals;

public class ImplicitWait extends BaseTest {
    @Test
    public void implicitWait(){
        /*
        verifica dc elementul este prezent in DOM
        se aplica pe toate instanta de browser
        face un polling la fiecare 0.5 secutnde dc conditia a fost indeplinita
        daca a fost face resume

        -- se aplica la instanta deci se pune in before suite
         */
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
       driver.get("https://the-internet.herokuapp.com/dynamic_loading/2");
       driver.findElement(By.cssSelector("div[id='start']>button")).click();

       WebElement finish = driver.findElement(By.cssSelector("div[id='finish']>h4"));
       assertEquals(finish.getText(),"Hello World!");

    }
}
