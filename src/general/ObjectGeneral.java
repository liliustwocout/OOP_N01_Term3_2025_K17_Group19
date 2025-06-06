package general;

public class ObjectGeneral {
    protected int id;
    public String name;
<<<<<<< HEAD
=======
    
>>>>>>> c3c0a1817899fe998fa9532f4b9e08f14e1650c2

    public ObjectGeneral(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() { return id; }
    public String getName() { return name; }

    public void setId(int id) { this.id = id; }
    public void setName(String name) { this.name = name; }

    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name;
    }
}
