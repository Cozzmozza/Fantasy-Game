package enemies;

import org.junit.Before;
import org.junit.Test;
import players.Knight;
import weapons.Axe;
import weapons.Sword;

import static org.junit.Assert.assertEquals;

public class TrollTest {


    Troll troll;
    Axe axe;
    Sword sword;
    Knight knight;

    @Before
    public void before(){
        axe = new Axe();
        sword = new Sword();
        knight = new Knight("Sir Stevesalot", sword);
        troll = new Troll(axe);
    }

    @Test
    public void hasHealthPoints(){
        assertEquals(30, troll.getHealthPoints());
    }

    @Test
    public void canTakeDamage(){
        troll.takeDamage(10);
        assertEquals(20, troll.getHealthPoints());
    }

    @Test
    public void hasWeapon() {
        assertEquals(axe, troll.getWeapon());
    }

    @Test
    public void canAttack() {
        troll.attackPlayer(knight);
        assertEquals(15, knight.getHealthPoints());
    }
}
