package weapons;

import behaviours.IWeapon;

public class Sword implements IWeapon {

    private int damageValue;

    public Sword() {
        this.damageValue = 15;
    }

    public void attack() {

    }

    public int getDamageValue() {
        return this.damageValue;
    }
}
