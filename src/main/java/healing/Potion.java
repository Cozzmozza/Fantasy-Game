package healing;

import behaviours.IHeal;

public class Potion implements IHeal {

    private int healValue;

    public Potion() {
        this.healValue = 10;
    }

    public int heal(){
        return this.healValue;
    }
}
