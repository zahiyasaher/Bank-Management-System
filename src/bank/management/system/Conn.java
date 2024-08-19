/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package bank.management.system;
import java.sql.*;
/**
 *
 * @author zahiya saher
 */
public class Conn {
    
    Connection c;//global object of class connection
    Statement s;
    //no need of main method
    //will not run this class, will make obj of this class and use so
    public Conn(){
        try{
         
         //STEP 1 CREATE CONNECTION
         c=DriverManager.getConnection("jdbc:mysql:///bankmanagementsystem","root","zahiya2004");
         
         //STEP 2 CREATE STATEMENT
         s = c.createStatement();
        }
        catch(Exception e){
            System.out.println(e);
        }
        
    }
    
    
    
   
}
