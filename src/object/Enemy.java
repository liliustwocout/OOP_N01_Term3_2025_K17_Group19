package object;

import general.ObjectGeneral;

public class Enemy extends ObjectGeneral {
    private int hp;
    private boolean isAlive;
    public String enemyId;

    public Enemy(int id, String name, int hp) {
        super(id, name);
        this.hp = hp;
        this.isAlive = true;
    }

    public void takeDamage(int damage) {
        if (!isAlive) {
            System.out.println(getName() + " đã bị tiêu diệt. Không thể nhận sát thương thêm.");
            return;
        }

        hp -= damage;
        System.out.println(getName() + " nhận " + damage + " sát thương. HP còn lại: " + hp);

        if (hp <= 0) {
            hp = 0;
            isAlive = false;
            System.out.println(getName() + " đã bị đánh bại!");
        }
    }

    public boolean isAlive() {
        return isAlive;
    }

    public int getHp() {
        return hp;
    }
}
