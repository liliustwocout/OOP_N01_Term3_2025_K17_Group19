

import general.ObjectGeneral;

public class Enemy extends ObjectGeneral {
    public int enemyId;
    public String type;

	public Enemy(int id, String name) {
        super(id, name);
    }

    public void displayInfo() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'displayInfo'");
    }

    public int attack() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'attack'");
    }

    public void takeDamage(int i) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'takeDamage'");
    }
}

public class Enemy {
    private String name;
    private int hp;
    private boolean isAlive;

    // Constructor (hàm khởi tạo)
    public Enemy(String name, int hp) {
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

