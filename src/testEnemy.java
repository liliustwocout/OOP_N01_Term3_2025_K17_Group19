

<<<<<<< HEAD
import object.Enemy;

public class testEnemy {
    public static void run() {
        System.out.println("=== Kiểm thử Enemy ===");

        // Tạo một đối tượng Enemy
        Enemy enemy = new Enemy("Quái Rừng", 100, 10, 0);

        // Kiểm tra hiển thị thông tin
        enemy.displayInfo();

        // Kiểm tra hành động tấn công
        int damage = enemy.attack();
        System.out.println("Enemy tấn công gây sát thương: " + damage);

        // Kiểm tra khi nhận sát thương
        enemy.takeDamage(30);
        enemy.displayInfo();

        System.out.println("");
=======
import java.util.Scanner;
import object.Enemy;
import object.EnemyList;

public class testEnemy {
    public void testEditDelete() {
        Enemy e1 = new Enemy(201, "Goblin");
        Enemy e2 = new Enemy(202, "Orc");
        Enemy e3 = new Enemy(203, "Dragon");

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
>>>>>>> ffdd3312dd8d34b5f20f0a348286d1e81d1477da
    }
}
