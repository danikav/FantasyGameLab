import enemies.Spider;
import org.junit.Before;
import org.junit.Test;
import players.Knight;
import utilities.Item;
import utilities.Weapon;

import static org.junit.Assert.assertEquals;

public class KnightTest {
    Knight knight;
    Spider spider;

    @Before
    public void setUp(){
        knight = new Knight(Weapon.SWORD, 80);
        spider = new Spider(40, 40);
    }

    @Test
    public void canAttack(){
        knight.attack(spider);
        assertEquals(20, spider.getHealth());
    }
    @Test
    public void canDefend(){
        knight.defend(spider);
        assertEquals(60, knight.getHealth());
    }
    @Test
    public void canChangeWeapon(){
        knight.setAttackObject(Weapon.STAFF);
        assertEquals("STAFF", knight.getAttackObject().toString());
    }
    @Test
    public void canAddItem(){
        knight.addItem(Item.GOLD);
        assertEquals(1, knight.getInventory().size());
    }
    @Test
    public void canUseItem(){
        knight.useItem(Item.HEALINGPOTION);
        assertEquals(100, knight.getHealth());
    }
    @Test
    public void canNotUseMana(){
        knight.useItem(Item.MANAPOTION);
        assertEquals(81, knight.getHealth());
    }
}
