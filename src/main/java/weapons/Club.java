package weapons;

import behaviours.IWeapon;

public class Club implements IWeapon {

    private int damageValue;

    public Club() {
        this.damageValue = 5;
    }

    public void attack() {

    }

    public int getDamageValue() {
        return this.damageValue;
    }
}
