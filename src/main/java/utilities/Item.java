package utilities;

public enum Item {
    HEALINGPOTION(20, "Healing Potion"),
    MANAPOTION(20, "Mana Potion"),
    GOLD(0, "Gold"),
    ATTACKPOTION(5, "Attack Power Potion"),
    SPELLPOTION(5, "Magic Power Potion"),
    HEALINGPOWERPOTION(5, "Healing Power Potion");

    private int objectPower;
    private String name;

    Item(int objectPower, String name){
        this.objectPower = objectPower;
        this.name = name;
    }

    public int getObjectPower(){
        return this.objectPower;
    }

    public String getName(){
        return this.name;
    }


}
