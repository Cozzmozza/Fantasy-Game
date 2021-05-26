package spells;

import behaviours.ISpell;

public class Water implements ISpell {

    private int powerValue;

    public Water() {
        this.powerValue = 5;
    }

//    public int getPowerValue() {
//        return powerValue;
//    }

    public int cast() {
        return powerValue;
    }
}
