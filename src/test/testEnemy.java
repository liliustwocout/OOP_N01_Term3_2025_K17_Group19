package test;

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
    }
}
