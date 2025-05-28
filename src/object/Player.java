// src/characters/Player.java
package object;

public class Player {
    public String name;
    public int health;
    private int x, y;

    public Player(String name, int health, int x, int y) {
        this.name = name;
        this.health = health;
        this.x = x;
        this.y = y;
    }

    public void move(String direction) {
        System.out.println(name + " is moving " + direction);
    }

    public void attack() {
        System.out.println(name + " attacks!");
    }

    public void takeDamage(int amount) {
        health -= amount;
    }
}
