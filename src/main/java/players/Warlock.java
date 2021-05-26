package players;

import behaviours.IDefend;
import behaviours.ISpell;

public class Warlock extends Mage{

    public Warlock(String name, ISpell spell, IDefend defender) {
        super(name, 20, spell, defender);
    }
}
