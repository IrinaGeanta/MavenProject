package curs14;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class AssertionExample {

    String expected = "test";
    String actual = "masina";

    @Test

    public void test1(){
        if (expected.equals(actual)){
            System.out.println("Test passed");
        } else {
            System.out.println("Test failed");
        }
    }

    @Test
    public void test2(){
        assertEquals(expected, actual);
    }

}
