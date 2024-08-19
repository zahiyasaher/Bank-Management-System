/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package bank.management.system;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class SignupTwo extends JFrame implements ActionListener{
    
    
    JTextField panTextField,aadharTextField;
    JButton next;
    JRadioButton Yesp,Nop,Yess,Nos;
    JComboBox religion,category,income,educal,occupation;
    String formno;
    //constructor
    SignupTwo(String formno){
        this.formno=formno;
        setLayout(null);
        
        setTitle("NEW ACCOUNT APPLICATION FORM - PAGE 2");
        
        
        JLabel additionald = new JLabel("Page 2: Additional Details");
        additionald.setFont(new Font("Raleway",Font.BOLD,22));
        additionald.setBounds(290,80,400,30);
        add(additionald);
        
        JLabel name=new JLabel("Religion: ");
        name.setFont(new Font("Raleway",Font.BOLD,20));
        name.setBounds(100,140,100,30);
        add(name);
        
        //dropdown
        String valReligion[]={"Christianity","Islam","Hinduism","Buddhism","Sikhism","Judaism","Bahá'í Faith","Jainism","Shinto","Taoism","Confucianism","Zoroastrianism"};
        religion = new JComboBox(valReligion);
        religion.setBounds(300,140,400,30);
        religion.setBackground(Color.WHITE);
        add(religion);
        
        
        JLabel fname=new JLabel("Category: ");
        fname.setFont(new Font("Raleway",Font.BOLD,20));
        fname.setBounds(100,190,200,30);
        add(fname);
        
        String valcategory[]={"General","OBC","SC","ST","Other"};
        category= new JComboBox(valcategory);
        category.setBounds(300,190,400,30);
        category.setBackground(Color.WHITE);
        add(category);
        
       
        
        JLabel dob =new JLabel("Income: ");
        dob.setFont(new Font("Raleway",Font.BOLD,20));
        dob.setBounds(100,240,200,30);
        add(dob);
       
        String inccategory[]={"Null","<1,50,000","<2,50,000","<=5,00,000",">5,00,000"};
        income= new JComboBox(inccategory);
        income.setBounds(300,240,400,30);
        income.setBackground(Color.WHITE);
        add(income);
        
        
        
        JLabel gen=new JLabel("Educational ");
        gen.setFont(new Font("Raleway",Font.BOLD,20));
        gen.setBounds(100,290,200,30);
        add(gen);
        JLabel email=new JLabel("Qualification: ");
        email.setFont(new Font("Raleway",Font.BOLD,20));
        email.setBounds(100,315,200,30);
        add(email);
        
        String valed[] = {
        "High School (10th)",
        "Senior Secondary (12th)",
        "Diploma",
        "Bachelor's Degree",
        "Master's Degree",
        "Postgraduate Diploma",
        "Doctorate (PhD)",
        "MPhil",
        "MBA",
        "BTech",
        "MTech"
        };
        educal= new JComboBox(valed);
        educal.setBounds(300,315,400,30);
        educal.setBackground(Color.WHITE);
        add(educal);
        
        
        JLabel mar=new JLabel("Occupation: ");
        mar.setFont(new Font("Raleway",Font.BOLD,20));
        mar.setBounds(100,390,200,30);
        add(mar);
        
        String valoccu[]={"Salaried","Self-Employed","Buissness","Student","Retired","Others"};
        occupation= new JComboBox(valoccu);
        occupation.setBounds(300,390,400,30);
        occupation.setBackground(Color.WHITE);
        add(occupation);
        
       
        
        JLabel addr=new JLabel("PAN number: ");
        addr.setFont(new Font("Raleway",Font.BOLD,20));
        addr.setBounds(100,440,200,30);
        add(addr);
        
        panTextField= new JTextField();
        panTextField.setBounds(300,440,400,30);
        panTextField.setFont(new Font("Raleway",Font.BOLD,14));
        add(panTextField);
        
        JLabel city=new JLabel("Aadhar number: ");
        city.setFont(new Font("Raleway",Font.BOLD,20));
        city.setBounds(100,490,200,30);
        add(city);
        
        aadharTextField= new JTextField();
        aadharTextField.setBounds(300,490,400,30);
        aadharTextField.setFont(new Font("Raleway",Font.BOLD,14));
        add(aadharTextField);
        
        JLabel state =new JLabel("Senior Citizen: ");
        state.setFont(new Font("Raleway",Font.BOLD,20));
        state.setBounds(100,540,200,30);
        add(state);
        
        Yess=new JRadioButton("Yes");
        Yess.setBounds(300,540,100,30);
        Yess.setBackground(Color.WHITE);
        add(Yess);
        
        Nos=new JRadioButton("No");
        Nos.setBounds(450,540,100,30);
        Nos.setBackground(Color.WHITE);
        add(Nos);
        
        ButtonGroup seniorgroup= new ButtonGroup();
        seniorgroup.add(Yess);
        seniorgroup.add(Nos);
        
       
        
        JLabel pinc=new JLabel("Existing Account: ");
        pinc.setFont(new Font("Raleway",Font.BOLD,20));
        pinc.setBounds(100,590,200,30);
        add(pinc);
        
        Yesp=new JRadioButton("Yes");
        Yesp.setBounds(300,590,100,30);
        Yesp.setBackground(Color.WHITE);
        add(Yesp);
        
        Nop=new JRadioButton("No");
        Nop.setBounds(450,590,100,30);
        Nop.setBackground(Color.WHITE);
        add(Nop);
        
        ButtonGroup accgroup= new ButtonGroup();
        accgroup.add(Yesp);
        accgroup.add(Nop);
        
        
        
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
        //String formno=""+random; // converting long to string
        String sreligion=(String)religion.getSelectedItem();//to get value from drop down , returns object so typecast
        String scategory=(String)category.getSelectedItem();
        String sincome=(String)income.getSelectedItem();
        String seducal=(String)educal.getSelectedItem();
        String soccupation=(String)occupation.getSelectedItem();
        
        String seniorcitizen=null;//radiobutton
        if(Yess.isSelected()){
            seniorcitizen="Yes";  
        }
        else if(Nos.isSelected()){
            seniorcitizen="No";
        }
        
        
        String existing=null;
        if(Yesp.isSelected()){
            existing="Yes";
        }
        else if(Nop.isSelected()){
            existing="No";
        }
        
        String span=(String)panTextField.getText();
        String saadhar=(String)aadharTextField.getText();
        
        
        //since sql is an external entity we need to add try catch as theres possibility of runtime error
        try{
              Conn c=new Conn();
              //mysql query
              String query="insert into signuptwo values('"+formno+"','"+sreligion+"','"+scategory+"','"+sincome+"','"+seducal+"','"+soccupation+"','"+span+"','"+saadhar+"','"+seniorcitizen+"','"+existing+"')";
              //from Conn class
              c.s.executeUpdate(query);
              
              //Signup 3 object
              setVisible(false);
              new SignupThree(formno).setVisible(true);
         
        }
        catch(Exception e){
            System.out.println(e);
        }
        
    }
    
   
    
    public static void main(String args[]) {
        // TODO code application logic here
        new SignupTwo("");
    }
}

