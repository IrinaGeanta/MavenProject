package tema15;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import utils.BaseTest;

import static org.testng.Assert.assertEquals;

public class ReviewPage extends BaseTest {

    @Test
    public void review(){
        WebElement bookLink = driver.findElement(By.cssSelector("a[href*='forest']"));
        bookLink.click();

        //am vrut sa folosesc asta cu list items .. cred ca altfel era mai usor de identificat dar well :)
        WebElement reviewTab = driver.findElement(By.cssSelector("ul[class='tabs wc-tabs']>li:last-of-type"));
        reviewTab.click();

        WebElement submitButton = driver.findElement(By.cssSelector("input[id='submit']"));
        submitButton.click();

        driver.switchTo().alert().accept();

        WebElement stars = driver.findElement(By.cssSelector("a[class='star-5']"));
        stars.click();

        WebElement commentTextField = driver.findElement(By.cssSelector("textarea[id='comment']"));
        //System.out.println(commentTextField.isEnabled());

        commentTextField.sendKeys("Great book!"+Math.random());


        WebElement nameField = driver.findElement(By.cssSelector("input[id='author']"));
        nameField.sendKeys("Irina");

        WebElement emailField = driver.findElement(By.cssSelector("input[id='email']"));
        emailField.sendKeys("irina.irina@email.com");

        WebElement saveMyNameCheckbox = driver.findElement(By.cssSelector("p input[type='checkbox']"));
        saveMyNameCheckbox.click();

        submitButton.click();

        WebElement reviewResponse = driver.findElement(By.cssSelector("em[class*='awaiting-approval']"));

        assertEquals(reviewResponse.getText(),"Your review is awaiting approval");


    }

}
