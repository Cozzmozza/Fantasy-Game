package enemies;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TrollTest {


    Troll troll;

    @Before
    public void before(){
        troll = new Troll();
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
}
