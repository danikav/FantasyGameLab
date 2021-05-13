package enemies;

import players.Player;

public abstract class Enemy {

    protected int health;
    protected int damage;

    public Enemy(int health, int damage){
        this.health = health;
        this.damage = damage;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public void attack(Player player){
        int playerHealth = player.getHealth();
        playerHealth -= damage;
        player.setHealth(playerHealth);
    }

//    public void missTurn() {
//       turnCounter += 1;
//    }

}
