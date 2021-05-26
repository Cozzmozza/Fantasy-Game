package weapons;

import behaviours.IWeapon;

public class Club implements IWeapon {

    private int damageValue;

    public Club() {
        this.damageValue = 5;
    }

    public int attack() {
        return this.damageValue;
    }

}
