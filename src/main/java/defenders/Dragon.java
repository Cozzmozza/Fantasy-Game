package defenders;

import behaviours.IDefend;

public class Dragon implements IDefend {

    private int defendValue;

    public Dragon() {
        this.defendValue = 15;
    }

    public int defend(){
        return defendValue;
    }

}
