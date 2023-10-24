package curs14;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class SoftHardAssertion {
    //1. SoftAssertion
    //2. HardAssertion
    @Test
    public void softAssertion(){
        System.out.println("Soft assertion incepe aici");
        SoftAssert sa = new SoftAssert();

        sa.assertTrue(false);
        System.out.println("Soft assert continua aici");

        sa.assertEquals(20,4);
        System.out.println("Soft assert se termina aici");

        sa.assertAll(); //mandatory in cazul soft assert
    }

    @Test
    public void hardAssert(){
        System.out.println("Hard assertion incepe aici");
        assertTrue(false);
        System.out.println("Hart assert continua aici");
        assertEquals(20,4);
        System.out.println("Hart assert se termina aici");

    }
}
