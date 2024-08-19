/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package bank.management.system;
import java.awt.*;
import javax.swing.*;
import java.util.*;
import java.awt.event.*;

public class SignupOne extends JFrame implements ActionListener{
    
    long random;
    JTextField nameTextField,fnameTextField,emailTextField,addrTextField,cityTextField,statTextField,pincTextField,dobTextField;
    JButton next;
    JRadioButton male,female,otherg,married,unmarried,other;
    //constructor
    SignupOne(){
        setLayout(null);
        Random ran= new Random();
        random=Math.abs((ran.nextLong()%9000L)+1000L);
        
        JLabel formno=new JLabel("APPLICATION FORM NO. " + random);
        formno.setFont(new Font("Raleway",Font.BOLD,38));
        formno.setBounds(140,20,600,40);
        add(formno);
        
        JLabel persond = new JLabel("Page 1: Personal Details");
        persond.setFont(new Font("Raleway",Font.BOLD,22));
        persond.setBounds(290,80,400,30);
        add(persond);
        
        JLabel name=new JLabel("Name: ");
        name.setFont(new Font("Raleway",Font.BOLD,20));
        name.setBounds(100,140,100,30);
        add(name);
        
        nameTextField= new JTextField();
        nameTextField.setBounds(300,140,400,30);
        nameTextField.setFont(new Font("Raleway",Font.BOLD,14));
        add(nameTextField);
        
        JLabel fname=new JLabel("Father's name: ");
        fname.setFont(new Font("Raleway",Font.BOLD,20));
        fname.setBounds(100,190,200,30);
        add(fname);
        
        fnameTextField= new JTextField();
        fnameTextField.setBounds(300,190,400,30);
        fnameTextField.setFont(new Font("Raleway",Font.BOLD,14));
        add(fnameTextField);
        
        JLabel dob =new JLabel("Date of Birth: ");
        dob.setFont(new Font("Raleway",Font.BOLD,20));
        dob.setBounds(100,240,200,30);
        add(dob);
        
        dobTextField= new JTextField();
        dobTextField.setBounds(300,240,400,30);
        dobTextField.setFont(new Font("Raleway",Font.BOLD,14));
        add(dobTextField);
        
        
        
        /*JDateChooser dateChooser=new JDateChooser();
        dateChooser.setBounds(300,240,200,30);
        add(dateChooser);*/
        
        JLabel gen=new JLabel("Gender: ");
        gen.setFont(new Font("Raleway",Font.BOLD,20));
        gen.setBounds(100,290,200,30);
        add(gen);
        
        male=new JRadioButton("Male");
        male.setBounds(300,290,120,30);
        male.setBackground(Color.WHITE);
        add(male);
        
        female=new JRadioButton("Female");
        female.setBounds(450,290,120,30);
        female.setBackground(Color.WHITE);
        add(female);
        
        otherg=new JRadioButton("Other");
        otherg.setBounds(630,290,120,30);
        otherg.setBackground(Color.WHITE);
        add(otherg);
        
        //allows only one radio button to be selected at a time
        ButtonGroup gendgroup= new ButtonGroup();
        gendgroup.add(male);
        gendgroup.add(female);

        
        
        JLabel email=new JLabel("Email Address: ");
        email.setFont(new Font("Raleway",Font.BOLD,20));
        email.setBounds(100,340,200,30);
        add(email);
        
        emailTextField= new JTextField();
        emailTextField.setBounds(300,340,400,30);
        emailTextField.setFont(new Font("Raleway",Font.BOLD,14));
        add(emailTextField);
        
        JLabel mar=new JLabel("Marital Status: ");
        mar.setFont(new Font("Raleway",Font.BOLD,20));
        mar.setBounds(100,390,200,30);
        add(mar);
        
        married=new JRadioButton("Married");
        married.setBounds(300,390,100,30);
        married.setBackground(Color.WHITE);
        add(married);
        
        unmarried=new JRadioButton("Unmarried");
        unmarried.setBounds(450,390,100,30);
        unmarried.setBackground(Color.WHITE);
        add(unmarried);
        
        other=new JRadioButton("Other");
        other.setBounds(630,390,100,30);
        other.setBackground(Color.WHITE);
        add(other);
        
        
        
        //allows only one radio button to be selected at a time
        ButtonGroup marrgroup= new ButtonGroup();
        marrgroup.add(married);
        marrgroup.add(unmarried);
        marrgroup.add(other);
        
        JLabel addr=new JLabel("Address: ");
        addr.setFont(new Font("Raleway",Font.BOLD,20));
        addr.setBounds(100,440,200,30);
        add(addr);
        
        addrTextField= new JTextField();
        addrTextField.setBounds(300,440,400,30);
        addrTextField.setFont(new Font("Raleway",Font.BOLD,14));
        add(addrTextField);
        
        JLabel city=new JLabel("City: ");
        city.setFont(new Font("Raleway",Font.BOLD,20));
        city.setBounds(100,490,200,30);
        add(city);
        
        cityTextField= new JTextField();
        cityTextField.setBounds(300,490,400,30);
        cityTextField.setFont(new Font("Raleway",Font.BOLD,14));
        add(cityTextField);
        
        JLabel state =new JLabel("State: ");
        state.setFont(new Font("Raleway",Font.BOLD,20));
        state.setBounds(100,540,200,30);
        add(state);
        
        statTextField= new JTextField();
        statTextField.setBounds(300,540,400,30);
        statTextField.setFont(new Font("Raleway",Font.BOLD,14));
        add(statTextField);
        
        JLabel pinc=new JLabel("Pincode: ");
        pinc.setFont(new Font("Raleway",Font.BOLD,20));
        pinc.setBounds(100,590,100,30);
        add(pinc);
        
        pincTextField= new JTextField();
        pincTextField.setBounds(300,590,400,30);
        pincTextField.setFont(new Font("Raleway",Font.BOLD,14));
        add(pincTextField);
        
        next=new JButton("Next");
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setFont(new Font("Raleway",Font.BOLD,14));
        next.setBounds(620,660,80,30);
        next.addActionListener(this);
        add(next);
        
        getContentPane().setBackground(Color.WHITE);
        
        setSize(850,800);
        setLocation(350,10);
        setVisible(true);
    }
    
    
    public void actionPerformed(ActionEvent ae){
        String formno=""+random; // converting long to string
        String name=nameTextField.getText();
        String fname=fnameTextField.getText();
        String dob=""+dobTextField.getText();
        String gender=null;//radiobutton
        if(male.isSelected()){
            gender="Male";  
        }
        else if(female.isSelected()){
            gender="Female";
        }
        else if(otherg.isSelected()){
            gender="Other";
        }
        String email=emailTextField.getText();
        String marital=null;
        if(married.isSelected()){
            marital="Married";
        }
        else if(unmarried.isSelected()){
            marital="Unmarried";
        }
        else if(other.isSelected()){
            marital="Other";
        }
        String address=addrTextField.getText();
        String city=cityTextField.getText();
        String state=statTextField.getText();
        String pin=pincTextField.getText();
        
        
        
        //since sql is an external entity we need to add try catch as theres possibility of runtime error
        try{
          if(name.equals("")){
              JOptionPane.showMessageDialog(null,"Name is Required");
          } 
          
          
           //ADD FOR OTHERS
           
           
          else{
              Conn c=new Conn();
              //mysql query
              String query="insert into signup values('"+formno+"','"+name+"','"+fname+"','"+dob+"','"+gender+"','"+email+"','"+marital+"','"+address+"','"+city+"','"+pin+"','"+state+"')";
              //from Conn class
              c.s.executeUpdate(query);
              
              setVisible(false);
              new SignupTwo(formno).setVisible(true);
          }
        }
        catch(Exception e){
            System.out.println(e);
        }
        
    }
    
   
    
    public static void main(String args[]) {
        // TODO code application logic here
        new SignupOne();
    }
}
