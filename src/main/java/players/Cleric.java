package players;

import enemies.Enemy;
import utilities.Weapon;

public class Cleric extends Player {
    public Cleric(Weapon attackObject, int health) {
        super(attackObject, health);
    }

    public void heal() {
       this.health += attackObject.getHealingPower();
    }

    public void drain(Enemy enemy) {
        this.health += attackObject.getHealingPower()/2;
        int enemyHealth = enemy.getHealth();
        enemyHealth -= attackObject.getHealingPower();
        enemy.setHealth(enemyHealth);
    }
}
