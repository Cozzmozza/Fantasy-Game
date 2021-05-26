package PlayerTests;

import enemies.Troll;
import org.junit.Before;
import org.junit.Test;
import players.Barbarian;
import players.Monk;
import weapons.Axe;
import weapons.Club;
import weapons.Sword;

import static org.junit.Assert.assertEquals;

public class MonkTest {

    Monk monk;
    Club club;
    Sword sword;
    Troll troll;

    @Before
    public void before(){
        club = new Club();
        sword = new Sword();
        troll = new Troll();
        monk = new Monk("Steve", club);
    }

    @Test
    public void hasName() {
        assertEquals("Steve", monk.getName());
    }

    @Test
    public void hasHealthPoints() {
        assertEquals(30, monk.getHealthPoints());
    }

    @Test
    public void canSetHealthPoints() {
        monk.setHealthPoints(-5);
        assertEquals(25, monk.getHealthPoints());
    }

    @Test
    public void hasWeapon() {
        assertEquals(club, monk.getWeapon());
    }

    @Test
    public void canChangeWeapon() {
        monk.setWeapon(sword);
        assertEquals(sword, monk.getWeapon());
    }

    @Test
    public void canAttackEnemy() {
        monk.attack(troll);
        assertEquals(25, troll.getHealthPoints());
    }
}
