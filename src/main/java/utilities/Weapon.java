package utilities;

public enum Weapon {
    SWORD (20, 0, 0),
    STAFF (5, 30 ,0),
    HEALINGWAND(1, 0, 10);

    private int attackPower;
    private int magicPower;
    private int healingPower;

    Weapon(int attackPower, int magicPower, int healingPower) {
        this.attackPower = attackPower;
        this.magicPower = magicPower;
        this.healingPower = healingPower;
    }

    public int getAttackPower(){
        return this.attackPower;
    }

    public int getMagicPower(){
        return this.magicPower;
    }

    public int getHealingPower(){
        return this.healingPower;
    }

    public void setAttackPower(int number){
        this.attackPower = number;
    }

    public void setMagicPower(int number){
        this.magicPower = number;
    }

    public void setHealingPower(int number){
        this.healingPower = number;
    }

}

