package curs15;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import utils.BaseTest;
import java.util.List;

public class FindElementsExample extends BaseTest {
    @Test
    public void findElementsExample(){

        List<WebElement> books = driver.findElements(By.cssSelector("h3[class='sc_title sc_title_regular sc_align_center margin_bottom_tiny']"));
        System.out.println(books.size());

       // books.get(2).click();
        for(WebElement carte : books) {

            if(carte.getText().equals("Storm")) {
                carte.click();
                break;
            }
        }

    }
}
