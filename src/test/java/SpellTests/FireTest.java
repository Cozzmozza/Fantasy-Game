package SpellTests;

import org.junit.Before;
import org.junit.Test;
import spells.Fire;

import static org.junit.Assert.assertEquals;

public class FireTest {

    Fire fire;

    @Before
    public void before(){
        fire = new Fire();
    }

//    @Test
//    public void hasPowerValue() {
//        assertEquals(15, fire.getPowerValue());
//    }
//
    @Test
    public void canCast(){
        assertEquals(15, fire.cast());
    }
}
