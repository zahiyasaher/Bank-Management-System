/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package bank.management.system;

import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;
//import java.util.*;
/**
 *
 * @author zahiya saher
 */
public class BalanceEnquiry extends JFrame implements ActionListener {

    JButton back;
    String pinnumber;
    
    
    BalanceEnquiry(String pinnumber){
        
        this.pinnumber = pinnumber;
        setLayout(null);
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 900, 900);
        add(image);
        
        back=new JButton("BACK");
        back.setBounds(355,520,150,30);
        back.addActionListener(this);
        image.add(back);
        
        
        Conn c = new Conn();
        int balance=0;
         try{
            String query = "select * from bank where pin = '"+pinnumber+"'";
            ResultSet rs = c.s.executeQuery(query);
           
            while (rs.next()) {
                if (rs.getString("type").equals("Deposit")) {
                    balance += Integer.parseInt(rs.getString("amount"));
                } else {
                    balance -= Integer.parseInt(rs.getString("amount"));
                }
            }
        }catch(Exception e){
        System.out.println(e);
        }
         
       JLabel text=new JLabel("Your Current Account Balance is Rs " + balance);
       text.setForeground(Color.WHITE);
       text.setBounds(170,300,400,30);
       image.add(text);
        
        
        
        setSize(900, 900);
        setUndecorated(true);
        setLocation(300, 0);
        setVisible(true);
        
    }
    
     public void actionPerformed(ActionEvent ae) {
        setVisible(false);
        new Transactions(pinnumber).setVisible(true);
    }
    
    public static void main(String args[]) {
       new BalanceEnquiry("");
    }
}
