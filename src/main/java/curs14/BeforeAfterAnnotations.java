package curs14;

import org.testng.annotations.*;

public class BeforeAfterAnnotations {
    //principiul de setup tierdown

    @BeforeSuite
    public void beforeSuite(){
        System.out.println("Before suite");
    }
    @AfterSuite
    public void afterSuite(){
        System.out.println("After suite");
    }

    @BeforeClass
    public void beforeClass(){
        System.out.println("Before class");
    }
    @AfterClass
    public void afterClass(){
        System.out.println("After class");
    }

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("Before method");
    }
    @AfterMethod
    public void afterMethod(){
        System.out.println("After method");
    }
// toate adnotarile cu before si after nu ruleaza.. ele nu au referitna la main,
// doar cele cu adnotare @Test
    //@BeforeTest -> se refera la un tag dintr-un xml

    @Test
    public void test1(){
        System.out.println("Test1");
    }
    @Test
    public void test2(){
        System.out.println("Test2");
    }
}
