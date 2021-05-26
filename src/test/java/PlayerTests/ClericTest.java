package PlayerTests;

import behaviours.IHeal;
import healing.Herbs;
import healing.Potion;
import org.junit.Before;
import org.junit.Test;
import players.Cleric;

import static org.junit.Assert.assertEquals;

public class ClericTest {

    Cleric cleric;
    IHeal healItem1;
    IHeal healItem2;

    @Before
    public void before() {
        healItem1 = new Herbs();
        healItem2 = new Potion();
        cleric = new Cleric("Steve", 25, healItem1);
    }

    @Test
    public void hasName(){
        assertEquals("Steve", cleric.getName());
    }

    @Test
    public void hasHealthPoints(){
        assertEquals(25, cleric.getHealthPoints());
    }

    @Test
    public void hasHealItem(){
        assertEquals(healItem1, cleric.getHealItem());
    }

    @Test
    public void canChangeHealItem(){
        cleric.setHealItem(healItem2);
        assertEquals(healItem2, cleric.getHealItem());
    }


}
