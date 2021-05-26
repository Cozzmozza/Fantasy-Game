package PlayerTests;

import defenders.Dragon;
import defenders.Ogre;
import enemies.Troll;
import org.junit.Before;
import org.junit.Test;
import players.Warlock;
import players.Wizard;
import spells.Earth;
import spells.Fire;
import spells.Water;

import static org.junit.Assert.assertEquals;

public class WarlockTest {
    Warlock warlock;
    Earth earth;
    Dragon dragon;
    Water water;
    Ogre ogre;
    Troll troll;

    @Before
    public void before(){
        earth = new Earth();
        ogre = new Ogre();
        dragon = new Dragon();
        troll = new Troll();
        warlock = new Warlock("Creepy Steve", earth, ogre);
    }

    @Test
    public void hasName() {
        assertEquals("Creepy Steve", warlock.getName());
    }

    @Test
    public void hasHealthPoints() {
        assertEquals(20, warlock.getHealthPoints());
    }

    @Test
    public void canSetHealthPoints() {
        warlock.setHealthPoints(-5);
        assertEquals(15, warlock.getHealthPoints());
    }

    @Test
    public void hasSpell() {
        assertEquals(earth, warlock.getSpell());
    }

    @Test
    public void canSetSpell() {
        water = new Water();
        warlock.setSpell(water);
        assertEquals(water, warlock.getSpell());
    }

    @Test
    public void hasDefender() {
        assertEquals(ogre, warlock.getDefender());
    }

    @Test
    public void canSetDefender() {
        warlock.setDefender(dragon);
        assertEquals(dragon, warlock.getDefender());
    }

    @Test
    public void canDefend() {
        warlock.defend(troll);
        assertEquals(20, troll.getHealthPoints());
    }
}
