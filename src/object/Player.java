package object;

import general.ObjectGeneral;

public class Player extends ObjectGeneral {
    private int level;

    public Player(int id, String name, int level) {
        super(id, name);
        this.level = level;

    }

    public int getLevel(){
        return level;
    }

    
}
