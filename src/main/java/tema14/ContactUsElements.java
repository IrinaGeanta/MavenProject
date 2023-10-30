package tema14;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.BaseTest;

import static org.testng.Assert.assertTrue;

public class ContactUsElements extends BaseTest {

    @BeforeMethod
    public void navigateContactUsPage(){
        WebElement contactLink = driver.findElement(By.linkText("CONTACTS"));
        contactLink.click();
        assertTrue(driver.getCurrentUrl().equals("https://keybooks.ro/contacts/"));
    }

    @Test
    public void messageContact() throws InterruptedException {
        WebElement nameField = driver.findElement(By.cssSelector("input[name='your-name']"));
        nameField.sendKeys("Irina");

        WebElement emailField = driver.findElement(By.cssSelector("input[name='your-email']"));
        emailField.sendKeys("irina@email.com");

        WebElement subjectField = driver.findElement(By.cssSelector("input[name='your-s']"));
        subjectField.sendKeys("Thank you!");

        WebElement messageField = driver.findElement(By.cssSelector("textarea[name='your-message']"));
        messageField.sendKeys("Thank you :)");

        WebElement sendMessageButton = driver.findElement(By.cssSelector("input[value='Send Message']"));
        sendMessageButton.click();

        WebElement responseMessage = driver.findElement(By.cssSelector("div[class='wpcf7-response-output']"));

        Thread.sleep(2000);
        //System.out.println(responseMessage.isDisplayed());

        //System.out.println("textul" + responseMessage.getText());
        assertTrue(responseMessage.getText().equals("Thank you for your message. It has been sent."));

    }
}
