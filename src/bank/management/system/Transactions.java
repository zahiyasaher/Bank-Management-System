
package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/**
 *
 * @author zahiya saher
 */
public class Transactions extends JFrame implements ActionListener{

    JLabel text;
    JButton b1,b2,b3,b4,b5,b6,b7;
    String pinnumber;
    
    
    Transactions(String pinnumber){
        this.pinnumber=pinnumber;
        setLayout(null);
        
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0,0,900,900);
        add(image);
        
        text= new JLabel("Please Select Your Transaction");
        text.setBounds(215,300,700,35);
        text.setForeground(Color.WHITE);
        text.setFont(new Font("System", Font.BOLD, 16));
        image.add(text);
        
        b1 = new JButton("DEPOSIT");
        b1.setBounds(170,415,150,30);
        b1.addActionListener(this);
        image.add(b1);
        
        b2 = new JButton("CASH WITHDRAWL");
        b2.setBounds(355,415,150,30);
        b2.addActionListener(this);
        image.add(b2);
        
        b3 = new JButton("FAST CASH");
        b3.setBounds(170,450,150,30);
        b3.addActionListener(this);
        image.add(b3);
        
        b4 = new JButton("MINI STATEMENT");
        b4.setBounds(355,450,150,30);
        b4.addActionListener(this);
        image.add(b4);
       
        b5 = new JButton("PIN CHANGE");
        b5.setBounds(170,485,150,30);
        b5.addActionListener(this);
        image.add(b5);
        
        b6 = new JButton("BALANCE ENQUIRY");
        b6.setBounds(355,485,150,30);
        b6.addActionListener(this);
        image.add(b6);
        
        b7 = new JButton("EXIT");
        b7.setBounds(265,520,150,30);
        b7.addActionListener(this);
        image.add(b7);
        
        
        setSize(900,900);
        setLocation(300,0);
        setUndecorated(true);
        setVisible(true);
        
        
        
    }
    
    @Override
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==b7){
            System.exit(0);
        }else if(ae.getSource()== b1){
            setVisible(false);
            new Deposit(pinnumber).setVisible(true);
        }else if(ae.getSource()== b2){
            setVisible(false);
            new Withdrawl(pinnumber).setVisible(true);
        }else if(ae.getSource()==b3){
            setVisible(false);
            new FastCash(pinnumber).setVisible(true);
        }else if(ae.getSource()==b5){
            setVisible(false);
            new PinChange(pinnumber).setVisible(true);
        }else if(ae.getSource()==b6){
            setVisible(false);
            new BalanceEnquiry(pinnumber).setVisible(true);
        }else if(ae.getSource()==b4){
            
            new MiniStatement(pinnumber).setVisible(true);
        }
    }
    
    public static void main(String args[]) {
        new Transactions("");
    }
}
