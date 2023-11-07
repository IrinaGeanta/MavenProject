package tema16;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import utils.BaseTest;

import java.time.Duration;

import static org.testng.Assert.assertEquals;

public class SingleAuthorPage extends BaseTest {

    @Test
    public void singleAuthor(){

        driver.findElement(By.cssSelector("ul[id='menu_main']>li:nth-of-type(6)")).click();

        WebElement dramaPercentage = driver.findElement(RelativeLocator.with(By.cssSelector("div[class='sc_skills_total']")).below(By.cssSelector("h2[class*='sc_title']")));

        WebDriverWait waitDrama = new WebDriverWait(driver, Duration.ofSeconds(10));
        waitDrama.until(ExpectedConditions.textToBePresentInElementLocated(By.cssSelector("div[class='sc_skills_total']"),"95%"));

        assertEquals(dramaPercentage.getText(), "95%");

        WebElement biographyPercentage = driver.findElement(By.cssSelector("div[class*='even'] div[class*='sc_skills_total']"));  //div[class*='even']>div[class*='sc_skills_count']>div

        WebDriverWait waitBiography = new WebDriverWait(driver, Duration.ofSeconds(10));
        waitBiography.until(ExpectedConditions.visibilityOf(biographyPercentage));

        assertEquals(biographyPercentage.getText(), "75%");

        WebElement cookbooksPercentage = driver.findElement(RelativeLocator.with(By.cssSelector("div[class*='sc_skills_total']")).below(biographyPercentage));

        WebDriverWait waitCookbooks = new WebDriverWait(driver, Duration.ofSeconds(10));
        waitBiography.until(ExpectedConditions.visibilityOf(cookbooksPercentage));

        assertEquals(cookbooksPercentage.getText(), "82%");
        
    }
}
