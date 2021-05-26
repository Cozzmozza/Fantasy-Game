package healing;

import behaviours.IHeal;
import players.Player;

public class Herbs implements IHeal {

    private int healValue;

    public Herbs() {
        this.healValue = 5;
    }

    public int heal(){
        return this.healValue;
    }
}
