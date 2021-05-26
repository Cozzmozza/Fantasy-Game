package WeaponTests;

import org.junit.Before;
import org.junit.Test;
import weapons.Axe;
import weapons.Club;

import static junit.framework.TestCase.assertEquals;

public class ClubTest {

        Club club;

        @Before
        public void before(){
            club = new Club();
        }

        @Test
        public void hasDamageValue() {
            assertEquals(5, club.getDamageValue());
        }
    }

