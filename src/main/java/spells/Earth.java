package spells;

import behaviours.ISpell;

public class Earth implements ISpell {

    private int powerValue;

    public Earth() {
        this.powerValue = 10;
    }

//    public int getPowerValue() {
//        return powerValue;
//    }

    public int cast() {
        return powerValue;
    }
}
