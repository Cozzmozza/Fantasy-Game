package players;

import behaviours.IHeal;

public class Cleric extends Player implements IHeal{

    private IHeal healItem;

    public Cleric(String name, int healthPoints, IHeal healItem) {
        super(name, healthPoints);
        this.healItem = healItem;
    }

    public IHeal getHealItem() {
        return healItem;
    }

    public void setHealItem(IHeal newHealItem){
        healItem = newHealItem;
    }

    public void heal() {

    }
}
