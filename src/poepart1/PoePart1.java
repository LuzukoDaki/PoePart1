/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poepart1;
import javax.swing.JOptionPane;
/**
 *
 * @author Daki
 */
public class PoePart1 {

    /**
     * @param args the command line arguments
     */
     // linking the login classs to the main method
    static Login login = new Login();
       
    // creating class to get the methods from the other class
   public static void getuserInput(){
    //method to request user
    login.getName();
    login.getLastName();
    // assigning values to attributes
    // we will login attributes they are public
    login.setuserName(JOptionPane.showInputDialog("Enter your user name which must contain an _ and must be no more than 5 characters long "));
    login.getUserName();
    boolean uCheck = login.checkUserName();
    if(uCheck == false ){
        JOptionPane.showMessageDialog(null, "User Name is not correctly formated, please  ensure correct instruction is followed ");
        }
    if(uCheck == true){
        JOptionPane.showMessageDialog(null, "user name is correctly formatted ");
        }
    login.setpassWord(JOptionPane.showInputDialog("Enter your password which must be at least 8 characters long. It must contain a capital letter, a number, and a special character "));
    login.getPassword();
    boolean pCheck = login.checkPasswordComplexity();
    if(pCheck == false){
        JOptionPane.showMessageDialog(null, "Password is not correctly formated, please  ensure correct instruction is followed ");
        }
       if(pCheck == true){
        JOptionPane.showMessageDialog(null, "Password succesfully captured "); 
        }
       login.setName(JOptionPane.showInputDialog("Please enter first name "));
       login.getName();
       login.setLastName(JOptionPane.showInputDialog("Enter your last name "));
       login.getLastName();
       if(uCheck == true){
        JOptionPane.showMessageDialog(null, "Welcom " + login.getName() + " " + login.getLastName() +  " it is great to see you ");
        }
        
       
    String loginUserName = "";
    String loginPassWord = "";
    boolean logCheck = login.loginUser(loginUserName, loginPassWord);
  
   }

    public static void main(String[] args) {
        // calling getUser method for 
        getuserInput();
        
        
   
    }
    
    
    
}

