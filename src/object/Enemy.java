package object;

import general.ObjectGeneral;

public class Enemy extends ObjectGeneral {
    public final int enemyId = 0;
    public String type;
    public int heal;

    public Enemy(int id, String name, int heal) {
        super(id, name);
    }

}
