package object;

import general.ObjectGeneral;

public class Enemy {
    public int id;
    public String name;
    public int hp;
    public boolean isAlive;

    // Constructor (hàm khởi tạo)
    public Enemy(int id, String name, int hp) {
        this.name = name;
        this.hp = hp;
        this.isAlive = true;
    }
         // Phương thức nhận sát thương
    public void takeDamage(int damage) {
        if (!isAlive) {
            System.out.println(name + " đã bị tiêu diệt. Không thể nhận sát thương thêm.");
            return;
        }

        hp -= damage;
        System.out.println(name + " nhận " + damage + " sát thương. HP còn lại: " + hp);

        if (hp <= 0) {
            hp = 0;
            isAlive = false;
            System.out.println(name + " đã bị đánh bại!");
        }
    
    }
     public boolean isAlive() {
        return isAlive;
    }

    public int getHp() {
        return hp;
    }

    public String getName() {
        return name;
    }
}

