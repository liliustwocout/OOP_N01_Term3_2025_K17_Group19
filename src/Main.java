import object.Enemy;

public class Main {
    public static void main(String[] args) {
        Enemy slime = new Enemy(1, "Slime", 30);
        slime.takeDamage(10); // Slime còn 20 HP
        slime.takeDamage(25); // Slime chết
        slime.takeDamage(5);  // Không thể nhận thêm sát thương
    }
}


