package SpellTests;

import org.junit.Before;
import org.junit.Test;
import spells.Water;

import static org.junit.Assert.assertEquals;

public class WaterTest {

    Water water;

    @Before
    public void before(){
        water = new Water();
    }

//    @Test
//    public void hasPowerValue() {
//        assertEquals(5, water.getPowerValue());
//    }

    @Test
    public void canCast() {
        assertEquals(5, water.cast());
    }
}
