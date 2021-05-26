package DefenderTests;

import defenders.Dragon;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DragonTest {

    Dragon dragon;

    @Before
    public void before(){
        dragon = new Dragon();
    }

    @Test
    public void hasDefendValue(){
        assertEquals(15,dragon.getDefendValue());
    }

}
