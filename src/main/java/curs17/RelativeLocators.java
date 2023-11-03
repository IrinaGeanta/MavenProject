package curs17;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.testng.annotations.Test;
import utils.BaseTest;

public class RelativeLocators extends BaseTest {

    /*
    toLeftOf
    toRightOf
    above
    below
    near
     */

    @Test
    public void relativeLocatorsExample(){

        JavascriptExecutor jse = (JavascriptExecutor) driver;

        // relative locator toLeftOf
        WebElement theSonPrice = driver.findElement(RelativeLocator.with(By.cssSelector("h5[class*='sc_title']")).toLeftOf(By.cssSelector("a[href='life-in-the-garden']")));
        jse.executeScript("arguments[0].setAttribute('style','background:orange; border:4px solid red')",theSonPrice);

        // relative locator toRightOf
        WebElement theLongRoadPrice = driver.findElement(RelativeLocator.with(By.cssSelector("h5[class*='sc_title']")).toRightOf(By.cssSelector("a[href='life-in-the-garden']")));
        jse.executeScript("arguments[0].setAttribute('style','background:yellow; border:4px solid red')",theLongRoadPrice);

        //relative locator above
        WebElement allanGreenAuthor = driver.findElement(RelativeLocator.with(By.cssSelector("div[class='wpb_wrapper']>p")).above(By.cssSelector("h5[class*='sc_title']")));
        jse.executeScript("arguments[0].setAttribute('style','background:blue; border:4px solid red')",allanGreenAuthor);

        //relative locator bellow
        WebElement theForestPrice = driver.findElement(RelativeLocator.with(By.cssSelector("h5[class*='sc_title']")).below(By.cssSelector("div[class='wpb_wrapper']>p")));
        jse.executeScript("arguments[0].setAttribute('style','background:purple; border:4px solid red')",theForestPrice);

        //relative locator near
        WebElement stormPrice = driver.findElement(RelativeLocator.with(By.cssSelector("h5[class*='sc_title']")).near(By.cssSelector("img[src*='book12.jpg']"), 100));
        jse.executeScript("arguments[0].setAttribute('style','background:pink; border:4px solid red')",stormPrice);


    }
}
