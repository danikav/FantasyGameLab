package players;

import enemies.Enemy;
import utilities.Weapon;

public class Knight extends Player{
    public Knight(Weapon attackObject, int health) {
        super(attackObject, health);
    }

    public void attack(Enemy enemy){
        int enemyHealth = enemy.getHealth();
        enemyHealth -= attackObject.getAttackPower();
        enemy.setHealth(enemyHealth);
    }

    public void defend(Enemy enemy){
        health -= enemy.getDamage() / 2;
        // turnCounter += 1;
    }
}
