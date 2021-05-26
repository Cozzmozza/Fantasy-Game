package rooms;

import java.util.ArrayList;
import java.util.Arrays;

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


}
