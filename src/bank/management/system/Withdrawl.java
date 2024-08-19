/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package bank.management.system;

import javax.swing.*;//for JFrame
import java.awt.*;
import java.awt.event.*;
import java.sql.ResultSet;
import java.util.*; //date
/**
 *
 * @author zahiya saher
 */
public class Withdrawl extends JFrame implements ActionListener{

    JLabel text;
    JTextField amount;
    JButton withdraw,back;
    String pinnumber;
    
    Withdrawl(String pinnumber){
        this.pinnumber=pinnumber;
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 900, 900);
        add(image);
        
        text=new JLabel("ENTER AMOUNT YOU WANT TO WITHDRAW");
        text.setForeground(Color.WHITE);
        text.setFont(new Font("System", Font.BOLD, 16));
        text.setBounds(175,300,400,20);
        image.add(text);
        
        amount=new JTextField();
        amount.setFont(new Font("Raleway", Font.BOLD, 22));
        amount.setBounds(175,350,320,25);
        image.add(amount);
        
        withdraw = new JButton("WITHDRAW");
        withdraw.setBounds(355,485,150,30);
        withdraw.addActionListener(this);
        image.add(withdraw);
         
         back=new JButton("BACK");
         back.setBounds(355,520,150,30);
         back.addActionListener(this);
         image.add(back);
         
        
        
        
        
        setSize(900,900);
        //setUndecorated(true);
        setLocation(300,0);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        
        
        if(ae.getSource()==withdraw){
            String number=amount.getText();
            Date date=new Date();
            if(number.equals("")){
                JOptionPane.showMessageDialog(null, "Please enter the Amount you want to Withdraw");
            }else{
                try{
                Conn conn= new Conn();
               




                int balance=0;
                ResultSet rs=conn.s.executeQuery("select * from bank where pin='"+pinnumber+"'");
                while(rs.next()){
                   if(rs.getString("type").equals("Deposit")){
                      balance+= Integer.parseInt(rs.getString("amount"));
                   }else{
                       balance-= Integer.parseInt(rs.getString("amount"));
                   }
             }
                if(ae.getSource()!=back && balance<Integer.parseInt(number)){
                JOptionPane.showMessageDialog(null, "Insuffient Balance");
                return;
               }


                



                else{
                String query="insert into bank values('"+pinnumber+"','"+date+"','Withdrawl','"+number+"')";
                conn.s.executeUpdate(query);
                JOptionPane.showMessageDialog(null, "Rs. "+number+" Withdrew Successfully");
                setVisible(false);
                new Transactions(pinnumber).setVisible(true);
            }}catch(Exception e){
           System.out.println(e);
        }
        }
        }else if(ae.getSource()==back){
            setVisible(false);
            new Transactions(pinnumber).setVisible(true);
        }
    }
    
    public static void main(String args[]) {
        
        new Deposit("");
    }
}



int balance=0;
               while(rs.next()){
                   if(rs.getString("type").equals("Deposit")){
                      balance+= Integer.parseInt(rs.getString("amount"));
                   }else{
                       balance-= Integer.parseInt(rs.getString("amount"));
                   }
             }
               if(ae.getSource()!=b7 && balance<Integer.parseInt(amount)){
                JOptionPane.showMessageDialog(null, "Insuffient Balance");
                return;
               }
