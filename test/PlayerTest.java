package test;

import characters.Player;


public class PlayerTest {

    
    public void testTakeDamage() {
        Player p = new Player("Hero", 100, 0, 0);
        p.takeDamage(30);

    }
}
