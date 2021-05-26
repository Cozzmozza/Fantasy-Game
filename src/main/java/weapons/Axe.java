package weapons;

import behaviours.IWeapon;


public class Axe implements IWeapon {

    private int damageValue;

    public Axe() {
        this.damageValue = 10;
    }

    public int getDamageValue() {
        return damageValue;
    }

    public void attack() {

    }
}
