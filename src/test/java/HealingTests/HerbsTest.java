package HealingTests;

import healing.Herbs;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HerbsTest {

    Herbs herbs;

    @Before
    public void before(){
        herbs = new Herbs();
    }

    @Test
    public void hasHealingValue(){
        assertEquals(5, herbs.heal());
    }

}
