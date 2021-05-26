package healing;

import behaviours.IHeal;

public class Herbs implements IHeal {

    private int healValue;

    public Herbs() {
        this.healValue = 5;
    }

    public int getHealValue() {
        return healValue;
    }

    public void heal(){

    }
}
