package RoomsTests;

import org.junit.Before;
import org.junit.Test;
import rooms.Exit;
import rooms.Room;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class RoomTest {

    Room room;
    Exit exit;

    @Before
    public void before(){
        room = new Room();
    }

    @Test
    public void canReturnExitsArray(){
        ArrayList<Exit> testArray = new ArrayList<>();
        testArray.add(exit.WEST);
        testArray.add(exit.EAST);
        testArray.add(exit.NORTH);
        testArray.add(exit.SOUTH);
        assertEquals(testArray, room.getExits());
    }

//    @Test // Is supposed to fail, returns one of EAST/WEST/NORTH/SOUTH
//    public void canReturnRandomNumber(){
//        assertEquals(0, room.getRandomExit());
//    }

}
