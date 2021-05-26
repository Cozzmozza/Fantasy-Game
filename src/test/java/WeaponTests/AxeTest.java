package WeaponTests;

import org.junit.Before;
import org.junit.Test;
import weapons.Axe;

import static junit.framework.TestCase.assertEquals;

public class AxeTest {

    Axe axe;

    @Before
    public void before(){
        axe = new Axe();
    }

    @Test
    public void hasDamageValue() {
        assertEquals(10, axe.getDamageValue());
    }
}
