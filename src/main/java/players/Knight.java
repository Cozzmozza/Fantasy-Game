package players;

import behaviours.IWeapon;

public class Knight extends Fighter{

    public Knight(String name, IWeapon weapon) {
        super(name, 25, weapon);
    }

    public void healSelf(){
        setHealthPoints(5);
    }
}
