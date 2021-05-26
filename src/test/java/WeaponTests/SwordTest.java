package WeaponTests;

import org.junit.Before;
import org.junit.Test;
import weapons.Axe;
import weapons.Sword;

import static junit.framework.TestCase.assertEquals;

public class SwordTest {

        Sword sword;

        @Before
        public void before(){
            sword = new Sword();
        }

        @Test
        public void hasDamageValue() {
            assertEquals(15, sword.getDamageValue());
        }
    }

