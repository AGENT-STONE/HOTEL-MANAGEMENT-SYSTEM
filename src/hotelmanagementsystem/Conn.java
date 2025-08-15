package hotelmanagementsystem;

import java.sql.*;  

public class Conn{
    
    Connection c;
    Statement s;
    Conn(){  
        try{  
            Class.forName("com.mysql.jdbc.Driver");  
            c =DriverManager.getConnection("jdbc:mysql:///hotelmanagementsystem","root","codewithraj");
            s =c.createStatement();     
        }
        catch(Exception e){ 
            System.out.println(e);
        }  
    }  
}  