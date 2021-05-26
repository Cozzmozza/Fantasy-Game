package enemies;

import behaviours.IWeapon;
import players.Player;

public abstract class Enemy {

    private int healthPoints;
    private IWeapon weapon;

    public Enemy(int healthPoints, IWeapon weapon) {
        this.healthPoints = healthPoints;
        this.weapon = weapon;
    }

    public IWeapon getWeapon() {
        return weapon;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public void takeDamage(int value){
        this.healthPoints -= value;
    }

    public void attackPlayer(Player player){
        player.setHealthPoints(-weapon.attack());
    }
}
