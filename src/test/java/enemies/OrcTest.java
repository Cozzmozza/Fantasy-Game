package enemies;

import org.junit.Before;
import org.junit.Test;
import players.Knight;
import weapons.Club;
import weapons.Sword;

import static org.junit.Assert.assertEquals;

public class OrcTest {

    Orc orc;
    Club club;
    Sword sword;
    Knight knight;

    @Before
    public void before(){
        sword = new Sword();
        knight = new Knight("Sir Stevesalot", sword);
        club = new Club();
        orc = new Orc(club);
    }

    @Test
    public void hasHealthPoints(){
        assertEquals(20, orc.getHealthPoints());
    }

    @Test
    public void canTakeDamage(){
        orc.takeDamage(10);
        assertEquals(10, orc.getHealthPoints());
    }

    @Test
    public void hasWeapon() {
        assertEquals(club, orc.getWeapon());
    }

    @Test
    public void canAttack() {
        orc.attackPlayer(knight);
        assertEquals(20, knight.getHealthPoints());
    }
}
