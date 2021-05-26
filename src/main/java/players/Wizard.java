package players;

import behaviours.IDefend;
import behaviours.ISpell;

public class Wizard extends Mage{

    public Wizard(String name, ISpell spell, IDefend defender) {
        super(name, 15, spell, defender);
    }
}
