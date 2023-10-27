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
    public void classNameLocator() throws InterruptedException {

        Thread.sleep(4000);
        //<button type="submit" name="add-to-cart" value="253" class="single_add_to_cart_button button alt">Add to cart</button>
        WebElement addToCart = driver.findElement(By.className("single_add_to_cart_button"));
        System.out.println(addToCart.isDisplayed()); // intoarce true/false dc elementul este vizibil
        assertTrue(addToCart.isDisplayed());
    }

    @Test(priority = 5)
    public void idLocator(){

       //<li class="reviews_tab active" id="tab-title-reviews" role="tab" aria-controls="tab-reviews">

        WebElement reviewTab = driver.findElement(By.id("tab-title-reviews"));
        reviewTab.click();

        WebElement commentBox = driver.findElement(By.id("comments"));
        // o sa verific daca este vizibil elementul
        assertTrue(commentBox.isDisplayed());
    }

    @Test(priority = 6)
    public void nameLocator(){

        //<textarea id="comment" name="comment" cols="45" rows="8" required=""></textarea>

        WebElement messageTextBox = driver.findElement(By.name("comment"));
        //sendKeys() -> pt a trimite text
        messageTextBox.sendKeys("My message");

    }

    @Test(priority = 7)
    public void cssSelector(){
        /*
        sintaxa CSS:
        tagname[atribut = 'valoare atribut']
        ex:
        <input id="author" name="author" type="text" value="" size="30" required="">
        tagname = input
        atribut = name sau type sau id sau value sau size sau required
        Constructie CSS:
        tagname[atribut = 'valoare atribut'] > input[name='author']

         */

        WebElement nameTextBox = driver.findElement(By.cssSelector("input[name='author']"));

        nameTextBox.sendKeys("Test");
    }

    @Test(priority = 8)
    public void xpathLocator(){

        //<input id="email" name="email" type="email" value="" size="30" required="">

        /*
         * Sintaxa XPath:
         * <input id="email" name="email" type="email" value="" size="30" required="">
         *
         *  //tagname[@atribut = "valoare-atribut"]
         *  // --> nodul curent
         *  tagname = input  (in cazul elementul de mai sus, pe alt element poate sa difere)
         *  @ --> referinta catre atribut
         *  atribut = name sau type sau id sau size sau orice alt atribut are elementul
         *
         *  Ex xpath
         *  //input[@name='email']
         */
        WebElement emailTextBox = driver.findElement(By.xpath("//input[@name='email']"));
        emailTextBox.sendKeys("Email@test.test");
    }
}

