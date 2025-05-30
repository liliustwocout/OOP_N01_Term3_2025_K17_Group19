package test;

import java.util.ArrayList;
import java.util.Scanner;

import object.Account;
import object.AccountList;

public class testAccount {
    ArrayList<Account> sl = new ArrayList<Account>();

    public void testEditDelete() {

        ArrayList<Account> sl = new ArrayList<Account>();
        Account s1 = new Account(269205, "Lilius");
        Account s2 = new Account(292005, "Hoiah");
        Account s3 = new Account(696969, "Duynhat");

        sl.add(s1);
        sl.add(s2);
        sl.add(s3);

        AccountList accList = new AccountList();
        accList.addAccount(s1);
        accList.addAccount(s2);
        accList.addAccount(s3);

        // cap nhat thong tin

        System.out.println("Enter account ID");
        Scanner accountID = new Scanner(System.in);
        int s = accountID.nextInt();

        System.out.println("Enter account name");
        Scanner name = new Scanner(System.in); 
        // Create a Scanner object
        String newName = name.nextLine();

        accList.getEditAccounts(newName, s);
        accList.printAccountList();
        System.out.print("test xoa:");

        System.out.println("Enter account ID");
        Scanner ID = new Scanner(System.in);

        int studentDel = ID.nextInt();
        accList.getDeleteAccounts(studentDel);
        System.out.print("danh sach sau khi xoa: \n");
        accList.printAccountList();
       
    }

    
}
