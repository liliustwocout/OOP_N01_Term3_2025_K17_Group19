package test;

import object.Player;

public class testPlayer {
    
    String name = (String) " ";
    name[0] = "p.name";
    public void testTakeDamage() {
        Player p = new Player("Hero", 100,0 ,0);
        p.takeDamage(30);

    }
}
