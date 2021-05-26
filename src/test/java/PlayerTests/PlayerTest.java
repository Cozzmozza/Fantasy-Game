package PlayerTests;

import org.junit.Before;
import org.junit.Test;
import players.Player;

import static org.junit.Assert.assertEquals;

public class PlayerTest {

    Player player;

    @Before
    public void before(){
        player = new Player("Steve", 25);
    }

    @Test
    public void hasName() {
        assertEquals("Steve", player.getName());
    }

    @Test
    public void hasHealth() {
        assertEquals(25, player.getHealthPoints());
    }

    @Test
    public void canChangeHealth() {
        player.setHealthPoints(20);
        assertEquals(20, player.getHealthPoints());
    }
}
