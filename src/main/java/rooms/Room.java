package rooms;

import java.util.ArrayList;
import java.util.Random;

public class Room {

    private Exit[] exitsEnums;
    private ArrayList<Exit> exits;

    public Room() {
        this.exitsEnums = Exit.values();
        this.exits = new ArrayList<>();
        setExits();
    }

    public void setExits(){
        for(Exit exit : exitsEnums){
            exits.add(exit);
        }
    }

    public ArrayList getExits(){
        return exits;
    }

    public Exit getRandomExit(){
        Random rand = new Random(); //Create instance of random class
        int upperBound = 4; // max value of 3, so range is 0-3
        int randomInt = rand.nextInt(upperBound); // this is our random int
        return exits.get(randomInt);
    }


}
