import enemies.Enemy;
import org.junit.Before;
import org.junit.Test;
import players.Cleric;
import enemies.Orc;
import utilities.Weapon;


import static org.junit.Assert.assertEquals;

public class ClericTest {
    
    Cleric cleric;
    Orc orc;
    
    @Before
    public void setUp(){
        cleric = new Cleric(Weapon.HEALINGWAND, 80);
        orc = new Orc(100, 10);
    }
    
    @Test
    public void canHeal(){
        cleric.heal();
        assertEquals(90, cleric.getHealth());
    }
    
    @Test
    public void canDrain(){
        cleric.drain(orc);
        assertEquals(85, cleric.getHealth());
        assertEquals(90, orc.getHealth());
    }
}
