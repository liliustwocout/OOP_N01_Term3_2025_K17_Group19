// Sequence.java
public class Sequence {
    private Object[] objects; // array of Objects
    private int next = 0;

    public Sequence(int size) { 
        objects = new Object[size];   
    }

    public void add(Object x) { // x don't have length
        if (next < objects.length) { 
            objects[next] = x; 
            next++;  // đã có dấu chấm phẩy
        } 
    }

    // inner class SSelector of Sequence
    private class SSelector implements Selector {
        int i = 0;

        public boolean end() { 
            return i == next;  // so sánh với next, không phải length mảng
        }

        public Object current() { 
            return objects[i]; 
        }

        public void next() {
            if (i < next) i++;
        }
    }

    public Selector getSelector() { 
        return new SSelector();
    }
}
