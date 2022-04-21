package bank.management.system;
import com.toedter.calendar.*;
import java.io.Console;

import javax.swing.*;

import java.awt.*;
import java.util.*;

public class SignupOne extends JFrame{

    SignupOne()//constructor
    {

        setLayout(null);

        Random ran = new Random();//CREATING AN OBJECT OF THE RANDOM CLASS, THIS RANDOM CLASS WILL BE USED TO GENERATE 4 DIGIT NUMBER
        long random = (Math.abs(ran.nextLong() % 9000L) + 1000L);
        
        
        JLabel formno = new JLabel("APPLICATION FORM NO." + random);//HEADING OF THE PAGE
        formno.setFont(new Font("Raleway", Font.BOLD, 38));
        formno.setBounds(140,20,600,40);
        add(formno);

        JLabel personaldetails = new JLabel("Page 1: Personal Details");//THIS IS THE FIST PAGE OF THE REGISTRATION FORM
        personaldetails.setFont(new Font("Raleway", Font.BOLD, 22));
        personaldetails.setBounds(290, 80, 400, 30);
        add(personaldetails);

        JLabel name = new JLabel("Name:");
        name.setFont(new Font("Raleway", Font.BOLD, 20));
        name.setBounds(100, 140, 100, 30);
        add(name);

            JTextField nameTextField = new JTextField();
            nameTextField.setFont(new Font("Raleway", Font.BOLD, 14));
            nameTextField.setBounds(300, 140, 400, 30);
            add(nameTextField);

        JLabel fname = new JLabel("Father's Name:");
        fname.setFont(new Font("Raleway", Font.BOLD, 20));
        fname.setBounds(100, 190, 200, 30);
        add(fname);

            JTextField fnameTextField = new JTextField();
            fnameTextField.setFont(new Font("Raleway", Font.BOLD, 14));
            fnameTextField.setBounds(300, 190, 400, 30);
            add(fnameTextField);


        JLabel dob = new JLabel("Date Of Birth:");
        dob.setFont(new Font("Raleway", Font.BOLD, 20));
        dob.setBounds(100, 240, 200, 30);
        add(dob);


            JDateChooser dateChooser = new JDateChooser();//DOWNLOADED A CALENDER JAR FILE WHICH IS LATER IMPORTED USING THE PACKAGE
            dateChooser.setBounds(300,240,400,30);
            dateChooser.setForeground(new Color(105,105,105));
            add(dateChooser);

        JLabel gender = new JLabel("Gender:");
        gender.setFont(new Font("Raleway", Font.BOLD, 20));
        gender.setBounds(100, 290, 200, 30);
        add(gender);

        
            JRadioButton male = new JRadioButton("Male");
            male.setBackground(Color.white);
            male.setBounds(300,290,60,30);
            add(male);
        
            JRadioButton female = new JRadioButton("Female");
            female.setBackground(Color.white);
            female.setBounds(450,290,100,30);
            add(female);

            ButtonGroup gendergroup = new ButtonGroup();
            gendergroup.add(male);
            gendergroup.add(female);
        
        
        JLabel email = new JLabel("Email Address:");
        email.setFont(new Font("Raleway", Font.BOLD, 20));
        email.setBounds(100, 340, 200, 30);
        add(email);


            JTextField emailTextField = new JTextField();
            emailTextField.setFont(new Font("Raleway", Font.BOLD, 14));
            emailTextField.setBounds(300, 340, 400, 30);
            add(emailTextField);

        JLabel marital = new JLabel("Marital Status:");
        marital.setFont(new Font("Raleway", Font.BOLD, 20));
        marital.setBounds(100, 390  , 200, 30);
        add(marital);
        
            JRadioButton married = new JRadioButton("Married");
            married.setBackground(Color.white);
            married.setBounds(300,390,120,30);
            add(married);
        
            JRadioButton unmarried = new JRadioButton("Unmarried");
            unmarried.setBackground(Color.white);
            unmarried.setBounds(450,390,120,30);
            add(unmarried);

            JRadioButton other = new JRadioButton("Other");
            other.setBackground(Color.white);
            other.setBounds(600,390,120,30);
            add(other);

            ButtonGroup maritalgroup = new ButtonGroup();
            maritalgroup.add(married);
            maritalgroup.add(unmarried);
            maritalgroup.add(other);
            
            
        JLabel address = new JLabel("Address:");
        address.setFont(new Font("Raleway", Font.BOLD, 20));
        address.setBounds(100, 440  , 200, 30);
        add(address);


            JTextField addressTextField = new JTextField();
            addressTextField.setFont(new Font("Raleway", Font.BOLD, 14));
            addressTextField.setBounds(300, 440, 400, 30);
            add(addressTextField);

        JLabel city = new JLabel("City:");
        city.setFont(new Font("Raleway", Font.BOLD, 20));
        city.setBounds(100, 490  , 200, 30);
        add(city);

            JTextField cityTextField = new JTextField();
            cityTextField.setFont(new Font("Raleway", Font.BOLD, 14));
            cityTextField.setBounds(300, 490, 400, 30);
            add(cityTextField);

        JLabel state = new JLabel("State:");
        state.setFont(new Font("Raleway", Font.BOLD, 20));
        state.setBounds(100, 540  , 200, 30);
        add(state);


            JTextField stateTextField = new JTextField();
            stateTextField.setFont(new Font("Raleway", Font.BOLD, 14));
            stateTextField.setBounds(300, 540, 400, 30);
            add(stateTextField);

        JLabel pincode = new JLabel("Pincode: ");
        pincode.setFont(new Font("Raleway", Font.BOLD, 20));
        pincode.setBounds(100, 590,200,30);
        add(pincode);

            JTextField pinTextField = new JTextField();
            pinTextField.setFont(new Font("Raleway", Font.BOLD, 14));
            pinTextField.setBounds(300, 590, 400, 30);
            add(pinTextField);
            
            
        JButton next = new JButton("Next");
        next.setBackground(Color.BLACK);
        next.setForeground(Color.white);
        next.setFont(new Font("Raleway", Font.BOLD, 14));
        next.setBounds(620, 660, 80,30);
        add(next);
        // next.getActionListeners()

        getContentPane().setBackground(Color.white);

        setSize(850,800);
        setLocation(350,10);
        setVisible(true);
    }
    public static void main(String args[])
    {
        new SignupOne();//CREATING AN OBJECT OF THE SIGNUP CLASS

    }
}