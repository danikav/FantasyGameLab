
import enemies.Troll;
import org.junit.Before;
import org.junit.Test;
import players.Wizard;
import utilities.Creature;
import utilities.Item;
import utilities.Weapon;


import static org.junit.Assert.assertEquals;

public class WizardTest {
    Wizard wizard;
    Troll troll;

    @Before
    public void setUp(){
        wizard = new Wizard(Weapon.STAFF, Creature.CAT, 100, 70);
        troll = new Troll(80, 20);
    }

    @Test
    public void canGetMana(){
        assertEquals(70, wizard.getMana());
    }
    @Test
    public void hasCreature(){
        assertEquals("CAT", wizard.getCreature().toString());
    }
    @Test
    public void canSpellAttack(){
        wizard.spellAttack(troll);
        assertEquals(50, troll.getHealth());
        assertEquals(40, wizard.getMana());
    }
    @Test
    public void canUseCreature(){
        wizard.useCreature(troll);
        assertEquals(75, troll.getHealth());
    }
    @Test
    public void canUseManaPotion(){
        wizard.useItem(Item.MANAPOTION);
        assertEquals(90, wizard.getMana());
    }

}
