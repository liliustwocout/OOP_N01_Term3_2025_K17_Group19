import test.testPlayer;
import test.testAccount;
import test.testEnemy;

public class Main {
    public static void main(String[] args) {
        testAccount ts = new testAccount();
        ts.testEditDelete();

        testPlayer tp = new testPlayer();
        tp.testEditDelete();  

        testEnemy te = new testEnemy();
        te.testEditDelete();

    }
}
