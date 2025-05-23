import java.util.ArrayList;
import java.util.Scanner;

public class testAccount {
    ArrayList<Account> sl = new ArrayList<Account>();

    public void testEditDelete() {

        ArrayList<Account> sl = new ArrayList<Account>();
        Account s1 = new Account("Nguyen Thi Lan Anh", 12345);
        Account s2 = new Account("Tran Van Minh", 2);
        Account s3 = new Account("Nguyen An", 101010);

        sl.add(s1);
        sl.add(s2);
        sl.add(s3);

        AccountList accList = new AccountList();
        accList.addAccount(s1);
        accList.addAccount(s2);
        accList.addAccount(s3);

        // cap nhat thong tin

        System.out.println("Enter student ID");
        Scanner accountID = new Scanner(System.in);

        int s = accountID.nextInt();

        System.out.println("Enter student name");

        Scanner name = new Scanner(System.in); // Create a Scanner object

        String newName = name.nextLine();

        accList.getEditAccounts(newName, s);

        accList.printAccountList();

        System.out.print("test xoa:");

       
        System.out.println("Enter account ID");
        Scanner ID = new Scanner(System.in);

        int studentDel = ID.nextInt();
        accList.getDeleteAccounts(studentDel);
        System.out.print("danh sach sau khi xoa:");
        accList.printAccountList();
       
    }

    
}
