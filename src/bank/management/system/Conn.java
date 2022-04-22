//AN OBJECT OF THIS CLASS WILL BE USED 
package bank.management.system;
import java.sql.*;
public class Conn {
    
    Connection c;//GLOBAL
    Statement s;//GLOBAL
        //CREATING A CONNECTION
        public Conn()//CONSTRUCTOR
        {
               try{
//                    Class.forName(com.mysql.cj.jdbc.Driver);//THIS STATEMENT IS NOT REQUIRED
                    c = DriverManager.getConnection("jdbc:mysql:///bankmanagementsystem", "root", "password");//CONNECTION STRING, (ROOT IS THE USERNAME AND 'password' IS THE PASSWORD)
                 
                    //CREATE STATEMENT
                    s = c.createStatement();//c is the connection variable 
                  }
               catch(Exception e)
               {
                   System.out.println(e);
               }
        }
}
