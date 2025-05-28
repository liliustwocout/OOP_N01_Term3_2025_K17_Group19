package test;

import java.util.Scanner;
import object.Enemy;
import object.EnemyList;

public class testEnemy {
    public void testEditDelete() {
        Enemy e1 = new Enemy("Goblin", 201);
        Enemy e2 = new Enemy("Orc", 202);
        Enemy e3 = new Enemy("Dragon", 203);

        EnemyList el = new EnemyList();
        el.addEnemy(e1);
        el.addEnemy(e2);
        el.addEnemy(e3);

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Enemy ID to edit:");
        int id = sc.nextInt();
        sc.nextLine(); // consume newline

        System.out.println("Enter new type:");
        String newType = sc.nextLine();
        el.editEnemy(newType, id);
        el.printEnemies();

        System.out.println("Enter Enemy ID to delete:");
        int delId = sc.nextInt();
        el.deleteEnemy(delId);
        System.out.println("After deletion:");
        el.printEnemies();
    }
}
