package spells;

import behaviours.ISpell;

public class Fire implements ISpell {

    private int powerValue;

    public Fire() {
        this.powerValue = 15;
    }

    public int getPowerValue() {
        return powerValue;
    }

    public void cast() {

    }
}
