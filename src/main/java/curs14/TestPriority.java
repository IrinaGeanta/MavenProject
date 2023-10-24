package curs14;

import org.testng.annotations.Test;

public class TestPriority {

    @Test(priority = 1)
    public void one(){
        System.out.println("One");
    }

    @Test(priority = 2)
    public void two(){
        System.out.println("Two");
    }

    @Test(priority = 3)
    public void three(){
        System.out.println("Three");
    }

    @Test
    public void four(){
        System.out.println("Four");
    }
    @Test
    public void five(){
        System.out.println("Five");
    }

    //ruleaza dupa ordonare alfabetica a numelor metodelor -- rularea default, care nu ne ajuta
    //ca sa rezolvam, punem parametru la adnotare numita priority
    //dc avem metode cu priority si fara priority, se ruleaza mai intai cele fara priority
    //dupa aceea se vor rula cele cu priority

}
