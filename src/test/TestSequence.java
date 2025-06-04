package test;

interface Selector {
    boolean end();
    Object current();
    void next();
}

class Sequence {
    private Object[] objects;
    private int next = 0;

    public Sequence(int size) {
        objects = new Object[size];
    }

    public void add(Object x) {
        if (next < objects.length) {
            objects[next] = x;
            next++;
        }
    }

    private class SSelector implements Selector {
        int i = 0;

        public boolean end() {
            return i == next;
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

public class TestSequence {
    public static void test() {
        Sequence s = new Sequence(10);
        for (int i = 0; i < 10; i++) {
            s.add(Integer.toString(i));
        }

        Selector sl = s.getSelector();
        while (!sl.end()) {
            System.out.println(sl.current());
            sl.next();
        }
    }

    public static void main(String[] args) {
        test();
    }
}
