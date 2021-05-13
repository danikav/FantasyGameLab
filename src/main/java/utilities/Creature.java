package utilities;

public enum Creature {
    CAT(5);

    private int creaturePower;

    Creature(int creaturePower){
        this.creaturePower = creaturePower;
    }

    public int getCreaturePower(){
        return this.creaturePower;
    }

}
