package com.game.object;

import com.game.general.ObjectGeneral;

public class Enemy extends ObjectGeneral {
    private int health;

    public Enemy(int id, String name, int health) {
        super(id, name);
        this.health = health;
    }

    public void takeDamage(int damage) {
        health -= damage;
        if (health <= 0) {
            System.out.println(getName() + " đã bị đánh bại!");
        } else {
            System.out.println(getName() + " còn " + health + " máu.");
        }
    }

    @Override
    public String toString() {
        return "Enemy{" +
               "id=" + getId() +
               ", name='" + getName() + '\'' +
               ", health=" + health +
               '}';
    }
} 