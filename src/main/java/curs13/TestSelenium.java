package curs13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TestSelenium {
    @Test
    public void openBrowser(){
        WebDriver driver = new ChromeDriver();
        //WebDriver driver = new FirefoxDriver();
        //WebDriver driver = new EdgeDriver();

        driver.get("https://keybooks.ro");

        //<a href="https://keybooks.ro/contacts/">Contacts</a>

        driver.findElement(By.linkText("CONTACTS")).click();

        /*
        tagname
        linkText
        partialLinkText
        className
        id
        name
        css selector
        xpath
         */
    }
}
