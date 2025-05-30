package general;
import general.ObjectList;
import object.Account;
import object.Player;
import object.Enemy;

public class TestObjectList {
    public static void main(String[] args) {
        ObjectList<Account> accountList = new ObjectList<>();
        ObjectList<Player> playerList = new ObjectList<>();
        ObjectList<Enemy> enemyList = new ObjectList<>();

        accountList.add(new Account(1, "Alice"));
        accountList.add(new Account(2, "Lilius"));
        accountList.add(new Account(3, "Hoiah"));
        playerList.add(new Player(1, "Bob"));
        playerList.add(new Player(2, "Lili"));
        playerList.add(new Player(3, "Duynqu"));
        enemyList.add(new Enemy(1, "Boss"));
        enemyList.add(new Enemy(2, "Slime"));

        System.out.println("=== Danh sách Account ===");
        accountList.readAll();

        System.out.println("\n=== Danh sách Player ===");
        playerList.readAll();

        System.out.println("\n=== Danh sách Enemy ===");
        enemyList.readAll();

        System.out.println("\n=== Cập nhật tên Player ===");
        playerList.update(2, "PlayerBob");
        playerList.readAll();

        System.out.println("\n=== Xóa Enemy ===");
        enemyList.delete(1);
        enemyList.readAll();
    }
}
