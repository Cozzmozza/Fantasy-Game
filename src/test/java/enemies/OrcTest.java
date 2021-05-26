package enemies;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class OrcTest {

    Orc orc;

    @Before
    public void before(){
        orc = new Orc();
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

}
