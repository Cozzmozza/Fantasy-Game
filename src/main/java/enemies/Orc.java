package enemies;

import behaviours.IWeapon;

public class Orc extends Enemy{

    public Orc(IWeapon weapon) {
        super(20, weapon);
    }
}
