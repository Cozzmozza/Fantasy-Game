package players;

import behaviours.IWeapon;
import enemies.Enemy;

public class Monk extends Fighter{

    public Monk(String name, IWeapon weapon) {
        super(name, 30, weapon);
    }

    public void multiAttack(Enemy enemy) {
        enemy.takeDamage(getWeapon().attack()*3);
    }
}
