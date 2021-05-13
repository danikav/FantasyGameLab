package players;

import utilities.Item;
import utilities.Weapon;

import java.util.ArrayList;

public abstract class Player {

    protected Weapon attackObject;
    protected int health;
    protected ArrayList<Item> inventory;

    public Player(Weapon attackObject, int health){
        this.attackObject = attackObject;
        this.health = health;
        this.inventory = new ArrayList<Item>();
    }

    public Weapon getAttackObject() {
        return attackObject;
    }

    public int getHealth() {
        return health;
    }

    public ArrayList<Item> getInventory() {
        return inventory;
    }

    public void setAttackObject(Weapon attackObject) {
        this.attackObject = attackObject;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setInventory(ArrayList<Item> inventory) {
        this.inventory = inventory;
    }

    public void getItem(int index){
        inventory.get(index);
    }

    public void addItem(Item item){
        this.inventory.add(item);
    }

    public void viewInventory(){
        int index = 1;
        for (Item item : inventory){
            System.out.println(index + ": " + item.getName());
            index += 1;
        }
    }

    public void useItem(int index){
        switch (index){
            case 1:
                attackObject.setAttackPower(Item.ATTACKPOTION.getObjectPower());
                this.inventory.remove(Item.ATTACKPOTION);
                break;
            case 2:
                attackObject.setHealingPower(Item.HEALINGPOTION.getObjectPower());
                this.inventory.remove(Item.HEALINGPOTION);
                break;
            case 3:
                attackObject.setMagicPower(Item.SPELLPOTION.getObjectPower());
                this.inventory.remove(Item.SPELLPOTION);
                break;
            case 4:
                System.out.println("Gold does nothing!");
                this.inventory.remove(Item.GOLD);
                break;
            case 5:
                if(health < 80){
                    health += 20;
                }
                else { health = 100;}
                this.inventory.remove(Item.HEALINGPOTION);
                break;
            case 6:
                System.out.println("You are not a wizard");
                this.inventory.remove(Item.MANAPOTION);
//                health += 1;
                break;
                }
        }
    }

// Set QUEST - 20 Events, 5 of each type - Enemy, Nothing, RandomEvent, Treasure.
// Set PLAYER - Knight(Sword, 100)
// Random remove from AllEvents()
// Start QUEST - While loop.
// Event 1 - Enemy (Orc)
// Turn 1 - Knight - Attack / Defend / UseItem
// Attack() CheckIfEnemyIsDead() If dead end Event otherwise go to turn 2.
// Turn 2 - Orc - Attack() CheckIfPlayerIsDead().  If dead end game. Otherwise go to turn 3.
// Turn 3 - Knight - UseItem()
// Turn 4 - Orc - Attack() CheckIfPlayerIsDead()
// Turn 5 - Knight - Attack() CheckIfEnemyIsDead()
// Event 2 - Nothing
// UseItem() or Move()
// Event 3 - RandomEvent()
// Maybe an Option?  Like a robber attacks you can either defend, which risks damage, or run away which risks losing an item.
// Event 4 - Treasure()
// AddItem() or Ignore()
// Event 5 - Enemy (Spider)


