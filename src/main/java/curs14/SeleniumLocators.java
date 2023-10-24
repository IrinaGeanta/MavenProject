package curs14;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import utils.BaseTest;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

/*
tagname
linkText
partialLinkText
Class
Id
Name
CssSelector
XPath

 */
public class SeleniumLocators extends BaseTest {

    @Test (priority = 1)
    public void tagNameLocator(){
        //<em>Discover</em>

        WebElement discoverText = driver.findElement(By.tagName("em"));
        System.out.println(discoverText.getText());

        //getText() - intoarce textul dintre tagurile html
        assertEquals(discoverText.getText(), "Discover");
    }

    @Test(priority = 2)
    public void linkTextLocator(){
        //linkText se aplica pe tagurile html a <- linkuri
        //<a href="https://keybooks.ro/shop/">Books</a>

        WebElement booksLink = driver.findElement(By.linkText("BOOKS"));
        booksLink.click();

        assertEquals(driver.getCurrentUrl(), "https://keybooks.ro/shop/");
    }

    @Test(priority = 3)
    public void partialLinkText(){
        //se aplica tot pe tagname uri de tip a

        WebElement cookingBook = driver.findElement(By.partialLinkText("love"));
        cookingBook.click();

        assertEquals(driver.getCurrentUrl(), "https://keybooks.ro/shop/cooking-with-love/");
    }

    @Test(priority = 4)
    public void clasNameLocator() throws InterruptedException {

        Thread.sleep(4000);
        //<button type="submit" name="add-to-cart" value="253" class="single_add_to_cart_button button alt">Add to cart</button>
        WebElement addToCart = driver.findElement(By.className("single_add_to_cart_button"));
        System.out.println(addToCart.isDisplayed()); // intoarce true/false dc elementul este vizibil
        assertTrue(addToCart.isDisplayed());
    }
}
