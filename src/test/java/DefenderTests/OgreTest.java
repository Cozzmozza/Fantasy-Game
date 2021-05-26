package DefenderTests;

import defenders.Ogre;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class OgreTest {

    Ogre ogre;

    @Before
    public void before(){
        ogre = new Ogre();
    }

    @Test
    public void hasDefendValue(){
        assertEquals(10, ogre.getDefendValue());
    }

}
