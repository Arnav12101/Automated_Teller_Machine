
package bank.management.system;

import com.toedter.calendar.*;
import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.awt.event.*;

public class SignupTwo extends JFrame implements ActionListener{

    String formno;
    JComboBox religion, occupation, catagory,income,education;
    JTextField nameTextField, fnameTextField , emailTextField, addressTextField, cityTextField, pinTextField, stateTextField;
    JButton next;
    JRadioButton female, male, married, unmarried, other; 
    JDateChooser dateChooser;
    public SignupTwo(String formno)//constructor
    {
        this.formno = formno;
        setLayout(null);

        
        setTitle("New Account Application - Page 2");
        
       
        JLabel additionaldetails = new JLabel("Page 2: Additional details");//THIS IS THE FIST PAGE OF THE REGISTRATION FORM
        additionaldetails.setFont(new Font("Raleway", Font.BOLD, 22));
        additionaldetails.setBounds(290, 80, 400, 30);
        add(additionaldetails);

        JLabel name = new JLabel("Religion:");
        name.setFont(new Font("Raleway", Font.BOLD, 20));
        name.setBounds(100, 140, 100, 30);
        add(name);
        
            String valreligion[] =  {"--Select--","Hindu","Muslim","Sikh","Christian","Buddhist","Jain"};
            religion = new JComboBox(valreligion);
            religion.setBounds(300, 140, 400, 30);
            religion.setBackground(Color.WHITE);
            add(religion);
            
           
            
        JLabel fname = new JLabel("Catagory:");
        fname.setFont(new Font("Raleway", Font.BOLD, 20));
        fname.setBounds(100, 190, 200, 30);
        add(fname);

            String valCatagory[] = {"--Select--","General", "OBC", "SC", "ST", "Other"};
            catagory = new  JComboBox(valCatagory);
            catagory.setBackground(Color.WHITE);
            catagory.setBounds(300, 190, 400, 30);
            add(catagory);
            


        JLabel dob = new JLabel("Income:");
        dob.setFont(new Font("Raleway", Font.BOLD, 20));
        dob.setBounds(100, 240, 200, 30);
        add(dob);


            String incomeCatagory[] = {"--Select--","null", "<1,50,000", "2,50,000", "5,00,000", "Upto 10,00,000"};
            income = new  JComboBox(incomeCatagory);
            income.setBackground(Color.WHITE);
            income.setBounds(300,240,400,30);
            add(income);

        JLabel gender = new JLabel("Educational:");
        gender.setFont(new Font("Raleway", Font.BOLD, 20));
        gender.setBounds(100, 290, 200, 30);
        add(gender);

        JLabel email = new JLabel("Qualification:");
        email.setFont(new Font("Raleway", Font.BOLD, 20));
        email.setBounds(100, 315, 200, 30);
        add(email);

            String educationValues[] =  {"--Select--","Non-Graduate","Under-Graduate","Post-Graduate","Doctrate","Other"};
            education = new JComboBox(educationValues);
            education.setBounds(300, 315, 400, 30);
            education.setBackground(Color.WHITE);
            add(education);

        JLabel marital = new JLabel("Occupation:");
        marital.setFont(new Font("Raleway", Font.BOLD, 20));
        marital.setBounds(100, 390  , 200, 30);
        add(marital);
        
//            String occupationValues[] =  {"--Select--","Salaried","Self-Employed","Bussiness","Student","Retired"};
//            JComboBox occupation = new JComboBox(occupationValues);
//            occupation.setBackground(Color.WHITE);
//            occupation.setBounds(300,390,400,30);
//            add(occupation);

            String occupationValues[] =  {"--Select--","Salaried","Self-Employed","Bussiness","Student","Retired"};
            occupation = new JComboBox(occupationValues);
            occupation.setBounds(300, 390, 400, 30);
            occupation.setBackground(Color.WHITE);
            add(occupation);

        JLabel address = new JLabel("PAN No:");
        address.setFont(new Font("Raleway", Font.BOLD, 20));
        address.setBounds(100, 440  , 200, 30);
        add(address);


             addressTextField = new JTextField();
            addressTextField.setFont(new Font("Raleway", Font.BOLD, 14));
            addressTextField.setBounds(300, 440, 400, 30);
            add(addressTextField);

        JLabel city = new JLabel("Aadhar No:");
        city.setFont(new Font("Raleway", Font.BOLD, 20));
        city.setBounds(100, 490  , 200, 30);
        add(city);

             cityTextField = new JTextField();
            cityTextField.setFont(new Font("Raleway", Font.BOLD, 14));
            cityTextField.setBounds(300, 490, 400, 30);
            add(cityTextField);
  
        next = new JButton("Next");
        next.setBackground(Color.BLACK);
        next.setForeground(Color.white);
        next.setFont(new Font("Raleway", Font.BOLD, 14));
        next.setBounds(620, 560, 80,30);
        next.addActionListener(this);
        add(next);
        // next.getActionListeners()

        getContentPane().setBackground(Color.white);

        setSize(850,800);
        setLocation(350,10);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae)
    {
        String formno = " ";//ITS A LONG VALUE, THAT HAS TO BE CONVERTED INTO A STRING
        String sreligion = (String)religion.getSelectedItem(); 
        String scatagory = (String)catagory.getSelectedItem();
        String sincome = (String)income.getSelectedItem();
        String seducation = (String)education.getSelectedItem();
        String soccupation = (String)occupation.getSelectedItem();
        String span = addressTextField.getText();
        String saadhar = cityTextField.getText();
        
        
        try
        {
                Conn c = new Conn();//CREATING AN OBJECT OF THE CONN CLASS
                String query = "insert into Signuptwo values ('"+formno+"', '"+sreligion+"', '"+scatagory+"', '"+sincome+"', '"+seducation+"', '"+soccupation+"', '"+span+"', '"+saadhar+"')";
                c.s.executeUpdate(query);
                
                setVisible(false);
                new SignupThree(formno).setVisible(true);
        }
        //SIGNUP3 Object
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    
//    "String'"+variable+"'String"
    public static void main(String args[])
    {
        new SignupTwo("");//CREATING AN OBJECT OF THE SIGNUP CLASS
    }
}
