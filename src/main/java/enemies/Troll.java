package enemies;

import behaviours.IWeapon;
import players.Player;

public class Troll extends Enemy {

    public Troll(IWeapon weapon) {
        super(30, weapon);
    }

}
