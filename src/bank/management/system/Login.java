package ASimulatorSystem;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Login extends JFrame implements ActionListener{
    JButton login, signup, clear;//MAKING THESE FIELDS GLOBAL
    JTextField cardTextField;//MAKING THESE FIELDS GLOBAL
    JPasswordField pinTextField;
    Login()
    {
        setTitle("AUTOMATED TELLER MACHINE");//THIS WILL SET THE NAME AT THE TOP LEFT CORNER 
        setLayout(null);//THIS WILL ALLOW US TO PUT CUSTOM BOUNDS
        // ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("ASimulatorSystem/icons/logo.jpg"));
        // Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        // ImageIcon i3 = new ImageIcon();
        // JLabel label = new JLabel(i3);
        // label.setBounds(70,10,100,100);
        // add(label);//TO SOMETHING ON THE FRAME

        JLabel text = new JLabel("WELCOME TO ATM");
        text.setFont(new Font("Osward", Font.BOLD, 38));
        text.setBounds(200,40,400,40);
        add(text);

        JLabel cardno = new JLabel("CARD NO: ");
        cardno.setFont(new Font("Raleway", Font.BOLD, 28));
        cardno.setBounds(120,150,150,40);
        add(cardno);


        cardTextField = new JTextField();//THIS IS THE CARD NO TEXT FIELD
        cardTextField.setBounds(300,157,225,30);
        cardTextField.setFont(new Font("Osward", Font.BOLD, 14));
        add(cardTextField);

        JLabel pin = new JLabel("PIN: ");
        pin.setFont(new Font("Raleway", Font.BOLD, 28));
        pin.setBounds(120,220,400,40);
        add(pin);

        pinTextField = new JPasswordField();//THIS IS THE PIN TEXT FIELD
        pinTextField.setBounds(300,227,225,30);
        pinTextField.setFont(new Font("Osward", Font.BOLD, 14));
        add(pinTextField);


        login = new JButton("SIGN IN");
        login.setBounds(300,300,100,30);
        login.setBackground(Color.black);
        login.setForeground(Color.white);
        login.addActionListener(this);
        add(login);

        clear = new JButton("CLEAR");
        clear.setBounds(430,300,100,30);
        clear.setBackground(Color.black);
        clear.setForeground(Color.white);
        clear.addActionListener(this);
        add(clear);

        signup = new JButton("SIGN UP");
        signup.setBounds(300,350,230,30);
        signup.setBackground(Color.black);
        signup.setForeground(Color.white);
        signup.addActionListener(this);
        add(signup);
        getContentPane().setBackground(Color.WHITE);

        setSize(800,600);
        setVisible(true);//WILL MAKE THE FRAME VISIBLE 
        setLocation(350,200);
    }

    @Override
    public void actionPerformed(ActionEvent ae)//ae IS THE OBJECT OF THE ACTIONPERFORMED CLASS
    {
        if(ae.getSource() == clear)
        {
            cardTextField.setText(null);
            pinTextField.setText(null);
        }
        else if(ae.getSource() == login)
        {

        }
        else if(ae.getSource() == signup)
        {

        }
    }
    
    public static void main(String[] args)
    {
        new Login();
    }
}
