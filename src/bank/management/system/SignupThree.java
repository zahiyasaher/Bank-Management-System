/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*; // to implement ActionListener
import java.util.*;//for random
//import java.sql.*;
/**
 *
 * @author zahiya saher
 */
public class SignupThree extends JFrame implements ActionListener{
    
    JRadioButton r1,r2,r3,r4; 
    JCheckBox c1,c2,c3,c4,c5,c6,c7;
    JButton submit,cancel;
    String formno;
    
    
    SignupThree(String formno){
        this.formno=formno;
        setLayout(null);
               
        
        JLabel l1= new JLabel("Page 3:Account Details");//swing package
        l1.setFont(new Font("Raleway",Font.BOLD,22));//awt package
        l1.setBounds(280,40,400,40);
        add(l1);
        
        JLabel type= new JLabel("Account Type");//swing package
        type.setFont(new Font("Raleway",Font.BOLD,22));//awt package
        type.setBounds(100,140,200,30);
        add(type);
        
        r1=new JRadioButton("Saving Account");
        r1.setFont(new Font("Raleway",Font.BOLD,16));
        r1.setBackground(Color.WHITE);
        r1.setBounds(100,180,250,20);
        add(r1);
        
        r2=new JRadioButton("Fixed Deposit Account");
        r2.setFont(new Font("Raleway",Font.BOLD,16));
        r2.setBackground(Color.WHITE);
        r2.setBounds(350,180,250,20);
        add(r2);
        
        r3=new JRadioButton("Current Account");
        r3.setFont(new Font("Raleway",Font.BOLD,16));
        r3.setBackground(Color.WHITE);
        r3.setBounds(100,220,250,20);
        add(r3);
        
        r4=new JRadioButton("Recurring Deposit Account");
        r4.setFont(new Font("Raleway",Font.BOLD,16));
        r4.setBackground(Color.WHITE);
        r4.setBounds(350,220,250,20);
        add(r4);
        
        ButtonGroup groupr= new ButtonGroup();
        groupr.add(r1);
        groupr.add(r2);
        groupr.add(r3);
        groupr.add(r4);
        
        JLabel card=new JLabel("Card Number");
        card.setFont(new Font("Raleway",Font.BOLD,22));
        card.setBounds(100,300,200,30);
        add(card);
        
        JLabel number=new JLabel("XXXX-XXXX-XXXX-0000");
        number.setFont(new Font("Raleway",Font.BOLD,22));
        number.setBounds(330,300,300,30);
        add(number);
        
        JLabel carddet=new JLabel("Your 16 Digit Card Number");
        carddet.setFont(new Font("Raleway",Font.BOLD,12));
        carddet.setBounds(100,330,300,20);
        add(carddet);
        
        JLabel pin=new JLabel("Pin Number");
        pin.setFont(new Font("Raleway",Font.BOLD,22));
        pin.setBounds(100,370,200,30);
        add(pin);
        
        JLabel numberp=new JLabel("XXXX");
        numberp.setFont(new Font("Raleway",Font.BOLD,22));
        numberp.setBounds(330,370,300,30);
        add(numberp);
        
        JLabel pindet=new JLabel("Your 4 Digit Card Number");
        pindet.setFont(new Font("Raleway",Font.BOLD,12));
        pindet.setBounds(100,400,300,20);
        add(pindet);
        
        
        JLabel serv=new JLabel("Services Required:");
        serv.setFont(new Font("Raleway",Font.BOLD,22));
        serv.setBounds(100,450,400,30);
        add(serv);
        //checkbox
        c1=new JCheckBox("ATM CARD");
        c1.setBackground(Color.WHITE);
        c1.setFont(new Font("Raleway",Font.BOLD,16));
        c1.setBounds(100,500,200,30);
        add(c1);
        
        c2=new JCheckBox("Internet Banking");
        c2.setBackground(Color.WHITE);
        c2.setFont(new Font("Raleway",Font.BOLD,16));
        c2.setBounds(350,500,200,30);
        add(c2);
        
        c3=new JCheckBox("Mobile Banking");
        c3.setBackground(Color.WHITE);
        c3.setFont(new Font("Raleway",Font.BOLD,16));
        c3.setBounds(100,550,200,30);
        add(c3);
        
        c4=new JCheckBox("Email & SMS Alerts");
        c4.setBackground(Color.WHITE);
        c4.setFont(new Font("Raleway",Font.BOLD,16));
        c4.setBounds(350,550,200,30);
        add(c4);
        
        c5=new JCheckBox("Cheque Book");
        c5.setBackground(Color.WHITE);
        c5.setFont(new Font("Raleway",Font.BOLD,16));
        c5.setBounds(100,600,200,30);
        add(c5);
        
        c6=new JCheckBox("E-Statement");
        c6.setBackground(Color.WHITE);
        c6.setFont(new Font("Raleway",Font.BOLD,16));
        c6.setBounds(350,600,200,30);
        add(c6);
        
        c7=new JCheckBox("I hearby declare that the above entered details are correct to the best of my knowledge");
        c7.setBackground(Color.WHITE);
        c7.setFont(new Font("Raleway",Font.BOLD,14));
        c7.setBounds(100,670,680,30);
        add(c7);
        
        submit = new JButton("Submit");
        submit.setBackground(Color.BLACK);
        submit.setForeground(Color.WHITE);
        submit.setFont(new Font("Raleway",Font.BOLD,14));
        submit.setBounds(250,720,100,30);
        submit.addActionListener(this);
        add(submit);
        
        cancel = new JButton("Cancel");
        cancel.setBackground(Color.BLACK);
        cancel.setForeground(Color.WHITE);
        cancel.setFont(new Font("Raleway",Font.BOLD,14));
        cancel.setBounds(420,720,100,30);
        cancel.addActionListener(this);
        add(cancel);
        
        
        

        
        
        
        
        getContentPane().setBackground(Color.WHITE);
        setSize(850,820);
        setLocation(350,0);
        setVisible(true);
    }
     
    //overriding function of actionlistener
    public void actionPerformed (ActionEvent ae){
        if(ae.getSource()== submit){
            String atype=null;
            if(r1.isSelected()){ 
            atype = "Saving Account";
        }
        else if(r2.isSelected()){ 
            atype = "Fixed Deposit Account";
        }
        else if(r3.isSelected()){ 
            atype = "Current Account";
        }else if(r4.isSelected()){ 
            atype = "Recurring Deposit Account";
        }
        Random random = new Random();
        
        //generating random cardno
        long first7 = (random.nextLong() % 90000000L) + 5040936000000000L;
        String cardno = "" + Math.abs(first7);
        //generating random pin
        long first3 = (random.nextLong() % 9000L) + 1000L;
        String pin = "" + Math.abs(first3);
        
        //SERVICES REQUIRED
        String facility = "";
        if(c1.isSelected()){
            //concating selected facilities as it is a multiple checkbox
            facility = facility + " ATM Card";
        }
        if(c2.isSelected()){ 
            facility = facility + " Internet Banking";
        }
        if(c3.isSelected()){ 
            facility = facility + " Mobile Banking";
        }
        if(c4.isSelected()){ 
            facility = facility + " Email & SMS Alerts";
        }
        if(c5.isSelected()){ 
            facility = facility + " Cheque Book";
        }
        if(c6.isSelected()){ 
            facility = facility + " E-Statement";
        }
        
        //since sql is an external entity we need to add try catch as theres possibility of runtime error
        try{
            if(ae.getSource()== submit){
                if(atype.equals("")){
                    ///dialog box
                    JOptionPane.showMessageDialog(null, "Fill all the required fields");
                }
                else{
                    Conn conn=new Conn();
                    String query1="insert into signupthree values('"+formno+"','"+atype+"','"+cardno+"','"+pin+"','"+facility+"')";
                     String query2 = "insert into login values('"+formno+"','"+cardno+"','"+pin+"')";
                    conn.s.executeUpdate(query1);
                    conn.s.executeUpdate(query2);
                    JOptionPane.showMessageDialog(null, "Card Number: " + cardno + "\n Pin:"+ pin);
                }
                setVisible(false);
                new Deposit(pin).setVisible(false);
            }
          
        }
        catch(Exception e){
            System.out.println(e);
        }
        
        }
        else if(ae.getSource()== cancel){
            setVisible(false);
            new Login().setVisible(true);
        }
    }
    
    public static void main(String args[]) {
        // TODO code application logic here
        
        new SignupThree("");
    }
}
