public class Player {
    // Thuộc tính của nhân vật
    private String name;
    private int x, y;       // Tọa độ vị trí nhân vật
    private int health;
    private int speed;
    private boolean isAlive;

    // Constructor khởi tạo
    public Player(String name, int x, int y) {
        this.name = name;
        this.x = x;
        this.y = y;
        this.health = 100;
        this.speed = 5;
        this.isAlive = true;
    }

    // Các phương thức di chuyển
    public void moveUp() {
        y -= speed;
    }

    public void moveDown() {
        y += speed;
    }

    public void moveLeft() {
        x -= speed;
    }

    public void moveRight() {
        x += speed;
    }

    // Gây sát thương cho người chơi
    public void takeDamage(int damage) {
        health -= damage;
        if (health <= 0) {
            health = 0;
            isAlive = false;
        }
    }

    // Hồi máu cho người chơi
    public void heal(int amount) {
        if (isAlive) {
            health += amount;
            if (health > 100) {
                health = 100;
            }
        }
    }

    // Getter
    public String getName() {
        return name;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getHealth() {
        return health;
    }

    public boolean isAlive() {
        return isAlive;
    }

    // Setter (nếu cần)
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }
}
