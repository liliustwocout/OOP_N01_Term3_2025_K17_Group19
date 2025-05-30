package test;

import java.util.Scanner;
import object.Player;
import object.PlayerList;

public class testPlayer {
    public void testEditDelete() {
        Player p1 = new Player(101, "Knight");
        Player p2 = new Player(102, "Mage");
        Player p3 = new Player(103, "Archer");

        PlayerList pl = new PlayerList();
        pl.addPlayer(p1);
        pl.addPlayer(p2);
        pl.addPlayer(p3);

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Player ID to edit:");
        int id = sc.nextInt();
        sc.nextLine(); // consume newline

        System.out.println("Enter new name:");
        String newName = sc.nextLine();
        pl.editPlayer(newName, id);
        pl.printPlayers();

        System.out.println("Enter Player ID to delete:");
        int delId = sc.nextInt();
        pl.deletePlayer(delId);
        System.out.println("After deletion:");
        pl.printPlayers();
    }
}
