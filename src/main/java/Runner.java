import enemies.Orc;
import players.Knight;
import quests.Quest;
import utilities.Weapon;

public class Runner {

    public static void main(String[] args) {

        Quest quest = new Quest(0,0);

        Knight knight = new Knight(Weapon.SWORD, 80);
        Orc orc = new Orc(100,20);

        quest.enemyEvent(orc, knight);


    }
}
