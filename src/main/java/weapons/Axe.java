package weapons;

import behaviours.IWeapon;


public class Axe implements IWeapon {

    private int damageValue;

    public Axe() {
        this.damageValue = 10;
    }

    public int attack() {
        return this.damageValue;
    }
}
