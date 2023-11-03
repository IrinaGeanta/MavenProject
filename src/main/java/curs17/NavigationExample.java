package curs17;

import org.testng.annotations.Test;
import utils.BaseTest;

public class NavigationExample extends BaseTest {

    @Test
    public void navigationTest() throws InterruptedException {

        //Thread.sleep(2000);
        driver.navigate().to("http://emag.ro");
        //Thread.sleep(2000);
        driver.get("http://altex.ro"); // the same with navigate().to()

        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();


    }
}
