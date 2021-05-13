import enemies.Enemy;
import enemies.Orc;
import enemies.Spider;
import enemies.Troll;
import org.junit.Before;
import org.junit.Test;
import players.Wizard;
import utilities.Creature;
import utilities.Weapon;

import static org.junit.Assert.assertEquals;

public class EnemyTest {
    Orc orc;
    Troll troll;
    Spider spider;
    Wizard wizard;

    @Before
    public void setUp(){
        orc = new Orc(100, 10);
        troll = new Troll(80, 20);
        spider = new Spider(40, 40);
        wizard = new Wizard(Weapon.STAFF, Creature.CAT, 100, 100);
    }
    @Test
    public void canAttack(){
        troll.attack(wizard);
        assertEquals(80, wizard.getHealth());

    }
}
