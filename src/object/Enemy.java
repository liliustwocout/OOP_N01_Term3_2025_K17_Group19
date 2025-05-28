// src/characters/Enemy.java
package object;

public class Enemy {
    private String name;
    private int health;
    private int x, y;

    public Enemy(String name, int health, int x, int y) {
        this.name = name;
        this.health = health;
        this.x = x;
        this.y = y;
    }

    public void patrol() {
        System.out.println(name + " is patrolling.");
    }

    public void chasePlayer(int playerX, int playerY) {
        System.out.println(name + " is chasing player at (" + playerX + "," + playerY + ")");
    }

    public void takeDamage(int amount) {
        health -= amount;
    }
}
