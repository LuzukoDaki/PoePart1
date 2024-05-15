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
    //method to request user input
    login.setName(JOptionPane.showInputDialog("Enter your Name "));
    login.setLastName(JOptionPane.showInputDialog("Enter your last Name "));
    
    
    
    // Using the set method to diplay conditions the user must input
    login.setuserName(JOptionPane.showInputDialog("Enter your user name which must contain an _ and must be no more than 5 characters long "));
    
    // Using the set method to diplay conditions the user must input
    login.setpassWord(JOptionPane.showInputDialog("Enter your password which must be at least 8 characters long. It must contain a capital letter, a number, and a special character "));  
    
   }
  
    public static void main(String[] args) {
       // Creating a method for user input
       getuserInput();
       // Calling the registerUser method from the login class
       String registerMessage = login.registerUser();
       // Dispalying message set in the register method
       JOptionPane.showMessageDialog(null,registerMessage);
       
       // Using the while loop to dipaly method
       while (!registerMessage.endsWith("Username and Password have been successfully captured")){
           login.setuserName(JOptionPane.showInputDialog("Enter your user name which must contain an _ and must be no more than 5 characters long "));
           login.setpassWord(JOptionPane.showInputDialog("Enter your password which must be at least 8 characters long. It must contain a capital letter, a number, and a special character "));
           
           registerMessage = login.registerUser();
           JOptionPane.showMessageDialog(null,registerMessage);   
       }       
       // Calling matchLogin method
       matchLogin();
    }
    // Creating this method to vefrify the user deatil
    public static void matchLogin(){
        String loginUserName, loginPassWord;
        loginUserName = JOptionPane.showInputDialog(null,"Re-enter your user name ");
        loginPassWord = JOptionPane.showInputDialog(null, "Re-enter your password ");
        
        boolean isUserLogin = false;
        // Using while loop to loop the method if condition is not met
        while (!isUserLogin){
            // Check if the entered login match the stored credentials
            isUserLogin = login.loginUser(loginUserName, loginPassWord);
            // Using if statement to display message if user input is incorrect
            if(!isUserLogin){
                JOptionPane.showMessageDialog(null,"Username or password incorrect, please try agin ");
                loginUserName = JOptionPane.showInputDialog(null,"Enter your user name ");
                loginPassWord = JOptionPane.showInputDialog(null, "Enter your password ");
            }
            
        }
        
        String status = login.returnLoginStatus(isUserLogin);
        
        //Dispaly the welcome message
        JOptionPane.showMessageDialog(null, status);
        
        
                
    }
    
}


