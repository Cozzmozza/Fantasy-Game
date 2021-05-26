package PlayerTests;

import enemies.Orc;
import enemies.Troll;
import org.junit.Before;
import org.junit.Test;
import players.Barbarian;
import weapons.Axe;
import weapons.Sword;

import static org.junit.Assert.assertEquals;

public class BarbarianTest {

    Barbarian barbarian;
    Axe axe;
    Sword sword;
    Troll troll;

    @Before
    public void before(){
        axe = new Axe();
        sword = new Sword();
        troll = new Troll(axe);
        barbarian = new Barbarian("Steve", axe);
    }

    @Test
    public void hasName() {
        assertEquals("Steve", barbarian.getName());
    }

    @Test
    public void hasHealthPoints() {
        assertEquals(20, barbarian.getHealthPoints());
    }

    @Test
    public void canSetHealthPoints() {
        barbarian.setHealthPoints(-5);
        assertEquals(15, barbarian.getHealthPoints());
    }

    @Test
    public void hasWeapon() {
        assertEquals(axe, barbarian.getWeapon());
    }

    @Test
    public void canChangeWeapon() {
        barbarian.setWeapon(sword);
        assertEquals(sword, barbarian.getWeapon());
    }

    @Test
    public void canAttackEnemy() {
        barbarian.attack(troll);
        assertEquals(20, troll.getHealthPoints());
    }

    @Test
    public void canRageAttack(){
        barbarian.rageAttack(troll);
        assertEquals(10, troll.getHealthPoints());
    }
}
