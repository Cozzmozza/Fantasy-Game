package PlayerTests;

import defenders.Dragon;
import defenders.Ogre;
import enemies.Troll;
import org.junit.Before;
import org.junit.Test;
import players.Wizard;
import spells.Fire;
import spells.Water;

import static org.junit.Assert.assertEquals;

public class WizardTest {

    Wizard wizard;
    Fire fire;
    Dragon dragon;
    Water water;
    Ogre ogre;
    Troll troll;

    @Before
    public void before(){
        fire = new Fire();
        dragon = new Dragon();
        troll = new Troll();
        wizard = new Wizard("Magic Steve", fire, dragon);
    }

    @Test
    public void hasName() {
        assertEquals("Magic Steve", wizard.getName());
    }

    @Test
    public void hasHealthPoints() {
        assertEquals(15, wizard.getHealthPoints());
    }

    @Test
    public void canSetHealthPoints() {
        wizard.setHealthPoints(-5);
        assertEquals(10, wizard.getHealthPoints());
    }

    @Test
    public void hasSpell() {
        assertEquals(fire, wizard.getSpell());
    }

    @Test
    public void canSetSpell() {
        water = new Water();
        wizard.setSpell(water);
        assertEquals(water, wizard.getSpell());
    }

    @Test
    public void hasDefender() {
        assertEquals(dragon, wizard.getDefender());
    }

    @Test
    public void canSetDefender() {
        ogre = new Ogre();
        wizard.setDefender(ogre);
        assertEquals(ogre, wizard.getDefender());
    }

    @Test
    public void canDefend() {
        wizard.defend(troll);
        assertEquals(15, troll.getHealthPoints());
    }
}
