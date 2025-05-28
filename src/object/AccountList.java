package object;
import java.util.ArrayList;

public class AccountList {
    ArrayList<Account> ac = new ArrayList<Account>();

    public ArrayList<Account> addAccount(Account acc) {

        ac.add(acc);
        return ac;

    }

    public ArrayList<Account> getEditAccounts(String fullname, int accId) {

        for (int i = 0; i < ac.size(); i++) {

            if (ac.get(i).accId == accId) {

                System.out.print("true");

                ac.get(i).nameAcc = fullname;
            }

        }

        return ac;
    }

    public ArrayList<Account> getDeleteAccounts(int accId) {

        for (int i = 0; i < ac.size(); i++) {

            if (ac.get(i).accId == accId) {

                ac.remove(i);

            }

        }

        return ac;
    }

    public void printAccountList() {
        int len = ac.size();

        for (int i = 0; i < len; i++) {
            System.out.println("Account ID: " + ac.get(i).accId + " Name: " + ac.get(i).nameAcc);

        }

    }
}
