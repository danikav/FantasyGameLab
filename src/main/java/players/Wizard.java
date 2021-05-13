package players;

import enemies.Enemy;
import utilities.Creature;
import utilities.Item;
import utilities.Weapon;

import java.util.Random;


public class Wizard extends Player{
    private Creature creature;
    private int mana;
    Random rand = new Random();

    public Wizard(Weapon attackObject, Creature creature, int health, int mana) {
        super(attackObject, health);
        this.creature = creature;
        this.mana = mana;

    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public Creature getCreature() {
        return creature;
    }

    public void setCreature(Creature creature) {
        this.creature = creature;
    }

    public void spellAttack(Enemy enemy){
        int enemyHealth = enemy.getHealth();
        enemyHealth -= attackObject.getMagicPower();
        enemy.setHealth(enemyHealth);
        this.mana -= attackObject.getMagicPower();
    }

    public void useCreature(Enemy enemy) {
        int enemyHealth = enemy.getHealth();
        enemyHealth -= creature.getCreaturePower();
        enemy.setHealth(enemyHealth);
//        if (rand.nextInt(4) == 1) {
//            enemy.missTurn();
//        }
    }
    public void useItem(Item item){
        switch (item){
            case ATTACKPOTION:
                attackObject.setAttackPower(item.getObjectPower());
                break;
            case HEALINGPOWERPOTION:
                attackObject.setHealingPower(item.getObjectPower());
                break;
            case SPELLPOTION:
                attackObject.setMagicPower(item.getObjectPower());
                break;
            case GOLD:
                System.out.println("Gold does nothing!");
                break;
            case HEALINGPOTION:
                if(health < 80){
                    health += 20;
                }
                else { health = 100;}
                break;
            case MANAPOTION:
                if(mana < 80){
                    mana += 20;
                }
                else { mana = 100;}
                break;
        }
    }
}
