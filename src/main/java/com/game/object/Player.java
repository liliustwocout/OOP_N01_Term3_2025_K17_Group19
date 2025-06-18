package com.game.object;

import com.game.general.ObjectGeneral;
import java.util.List;

public class Player extends ObjectGeneral {
    private int level;

    public Player(int id, String name, int level) {
        super(id, name);
        this.level = level;
    }

    public int getLevel() {
        return level;
    }

    public void attack(Enemy enemy, int damage) {
        System.out.println(getName() + " tấn công " + enemy.getName() + " với " + damage + " sát thương.");
        enemy.takeDamage(damage);
    }

    public void showHighLevelPlayers(List<ObjectGeneral> list, int levelThreshold) {
        try {
            for (ObjectGeneral obj : list) {
                if (obj instanceof Player) {
                    Player p = (Player) obj;
                    if (p.getLevel() >= levelThreshold) {
                        System.out.println(p);
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("Có lỗi xảy ra khi hiển thị người chơi cấp cao: " + e.getMessage());
        }
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