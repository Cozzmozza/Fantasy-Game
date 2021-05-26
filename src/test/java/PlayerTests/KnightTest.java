package PlayerTests;

import enemies.Orc;
import enemies.Troll;
import org.junit.Before;
import org.junit.Test;
import players.Knight;
import players.Monk;
import weapons.Axe;
import weapons.Club;
import weapons.Sword;

import static org.junit.Assert.assertEquals;

public class KnightTest {

    Knight knight;
    Sword sword;
    Axe axe;
    Orc orc;

    @Before
    public void before(){
        sword = new Sword();
        axe = new Axe();
        orc = new Orc();
        knight = new Knight("Sir Stevesalot", sword);
    }

    @Test
    public void hasName() {
        assertEquals("Sir Stevesalot", knight.getName());
    }

    @Test
    public void hasHealthPoints() {
        assertEquals(25, knight.getHealthPoints());
    }

    @Test
    public void canSetHealthPoints() {
        knight.setHealthPoints(-5);
        assertEquals(20, knight.getHealthPoints());
    }

    @Test
    public void hasWeapon() {
        assertEquals(sword, knight.getWeapon());
    }

    @Test
    public void canChangeWeapon() {
        knight.setWeapon(axe);
        assertEquals(axe, knight.getWeapon());
    }

    @Test
    public void canAttackEnemy() {
        knight.attack(orc);
        assertEquals(5, orc.getHealthPoints());
    }
}
