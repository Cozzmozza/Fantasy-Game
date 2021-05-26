package SpellTests;

import org.junit.Before;
import org.junit.Test;
import spells.Earth;

import static org.junit.Assert.assertEquals;

public class EarthTest {

    Earth earth;

    @Before
    public void before(){
        earth = new Earth();
    }

//    @Test
//    public void hasPowerValue() {
//        assertEquals(10, earth.getPowerValue());
//    }

    @Test
    public void canCast() {
        assertEquals(10, earth.cast());
    }
}
