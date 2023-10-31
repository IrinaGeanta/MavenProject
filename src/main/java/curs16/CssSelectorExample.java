package curs16;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import utils.BaseTest;

public class CssSelectorExample extends BaseTest {
    @Test
    public void cssSelector(){
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        //first-of-type
        WebElement newReleases =  driver.findElement(By.cssSelector("div[class*='sc_tabs']>ul>li:first-of-type"));
        //nth-of-type
        WebElement comingSoon =  driver.findElement(By.cssSelector("div[class*='sc_tabs']>ul>li:nth-of-type(2)"));
        jse.executeScript("arguments[1].setAttribute('style', 'background:yellow; border:4px solid red')", newReleases, comingSoon);

        jse.executeScript("arguments[0].setAttribute('style', 'background:purple; border:4px solid red')", newReleases);

        //nth-of-type
        WebElement bestSellers =  driver.findElement(By.cssSelector("div[class*='sc_tabs']>ul>li:nth-of-type(3)"));
        jse.executeScript("arguments[0].setAttribute('style', 'background:green; border:4px solid red')", bestSellers);

        //last-of-type
        WebElement awardWinners =  driver.findElement(By.cssSelector("div[class*='sc_tabs']>ul>li:last-of-type"));
        jse.executeScript("arguments[0].setAttribute('style', 'background:blue; border:4px solid red')", awardWinners);

    }
}
