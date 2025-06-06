package object;

import general.ObjectGeneral;

public class Player extends ObjectGeneral {
    private int level;
    public int playerId;

    public Player(int id, String name, int level) {
        super(id, name);
        this.level = level;

    }

    public int getLevel(){
        return level;
    }

    public void attack(Enemy enemy, int damage) {
        System.out.println(this.getName() + " tấn công " + enemy.getName() + " với " + damage + " sát thương.");
        enemy.takeDamage(damage);
    }

    @Override
    public String toString() {
        return "Player{" +
               "id=" + getId() +
               ", name='" + getName() + '\'' +
               ", level=" + level +
               '}';
    }
}
