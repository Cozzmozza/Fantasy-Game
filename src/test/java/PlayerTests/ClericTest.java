package PlayerTests;

import behaviours.IHeal;
import healing.Herbs;
import healing.Potion;
import org.junit.Before;
import org.junit.Test;
import players.Cleric;
import players.Knight;
import weapons.Sword;

import static org.junit.Assert.assertEquals;

public class ClericTest {

    Cleric cleric;
    IHeal healItem1;
    IHeal healItem2;
    Knight knight;
    Sword sword;

    @Before
    public void before() {
        healItem1 = new Herbs();
        healItem2 = new Potion();
        knight = new Knight("Sir Stevesalot", sword);
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

    @Test
    public void canSetHealthPoints() {
        cleric.setHealthPoints(-5);
        assertEquals(20, cleric.getHealthPoints());
    }

    @Test
    public void canHeal() {
        knight.setHealthPoints(-10);
        cleric.healPlayer(knight);
        assertEquals(20, knight.getHealthPoints());
    }
}
