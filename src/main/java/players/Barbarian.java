package players;

import behaviours.IWeapon;
import enemies.Enemy;

public class Barbarian extends Fighter{

    public Barbarian(String name, IWeapon weapon) {
        super(name, 20, weapon);
    }

    public void rageAttack(Enemy enemy) {
        enemy.takeDamage(getWeapon().attack()*2);
    }
}
