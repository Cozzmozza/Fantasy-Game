package players;

import behaviours.IDefend;
import behaviours.ISpell;
import enemies.Enemy;

public abstract class Mage extends Player{

    private ISpell spell;
    private IDefend defender;

    public Mage(String name, int healthPoints, ISpell spell, IDefend defender) {
        super(name, healthPoints);
        this.spell = spell;
        this.defender = defender;
    }

    public ISpell getSpell() {
        return spell;
    }

    public IDefend getDefender() {
        return defender;
    }

    public void setSpell(ISpell spell) {
        this.spell = spell;
    }

    public void setDefender(IDefend defender) {
        this.defender = defender;
    }

    public void defend(Enemy enemy){
        enemy.takeDamage(defender.defend());
    }
}
