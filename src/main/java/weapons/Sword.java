package weapons;

import behaviours.IWeapon;

public class Sword implements IWeapon {

    private int damageValue;

    public Sword() {
        this.damageValue = 15;
    }

    public int attack() {
        return this.damageValue;
    }
}
