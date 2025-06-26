package com.example.servingwebcontent.database;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
//import java.util.List;

import com.example.servingwebcontent.model.ListAccount;
import com.example.servingwebcontent.model.Account;



public class AccountAiven {

    ArrayList<Account> items = new ArrayList<Account>(); 
    //Account account = new Account();

    /**
     * @return
     */
    public ArrayList<Account> accountAivenList() {
      
        Connection conn = null;
        try {
           
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(
                    "jdbc:mysql://avnadmin:AVNS_JQhZX9R1M50Gf1sWxfe@mysql-288a0e3d-datpltn205-8c11.c.aivencloud.com:15317/defaultdb?ssl-mode=REQUIRED",
                    "avnadmin", "AVNS_JQhZX9R1M50Gf1sWxfe");
            Statement sta = conn.createStatement();

            ResultSet setdata = sta.executeQuery("select * from accounts");
            int index =0;
            int columnCount = setdata.getMetaData().getColumnCount();
             System.out.println("column #"+columnCount);
   
          

            while (setdata.next()) {
                Account account = new Account();
              
                String username = setdata.getString("username");
          
                String password = setdata.getString("password");
                System.out.println("USER AIVEN TEST:");
                System.out.println(username + " " + password);

                account.setUsername(username);
                account.setPassword(password);

                System.out.println("Get username in user Aiven");
                System.out.println(account.getUsername());
                System.out.println(index);
                

        
            items.add(account);
       }

            setdata.close();
            sta.close();
            conn.close();
           
        } 
        catch (Exception e) {
            System.out.println("Error in database connecion");
            System.out.println(e);
            e.printStackTrace();
        }

        
        return items;

    }
    
}