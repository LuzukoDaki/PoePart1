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
     // linking the login classs to the main method/class
    static Login login = new Login();
       
    // creating class to get the methods from the login class
   public static void getuserInput(){
    //method to request user input
    login.setName(JOptionPane.showInputDialog("Enter your Name "));
    login.setLastName(JOptionPane.showInputDialog("Enter your last Name "));
    
    
    
    // Using the set method to diplay conditions the user must input
    login.setuserName(JOptionPane.showInputDialog("Enter your user name which must contain an _ and must be no more than 5 characters long "));
    
    // Using the set method to diplay conditions the user must input
    login.setpassWord(JOptionPane.showInputDialog("Enter your password which must be at least 8 characters long. It must contain a capital letter, a number, and a special character "));  
    
   }
   
   //Linking the Task to the main class/method //
   static Task task = new Task();
   
   // creating class to get the methods from the login class
   public static void taskPage(){
       JOptionPane.showMessageDialog(null, "Welcome to EasyKanban ");
       
       // Promts for user
       int Options = Integer.parseInt(JOptionPane.showInputDialog("Select features from the the folowing menu - \n\n1: Add Tasks \n2: Show Report \n3: Quit "));
       
       while( Options != 1 && Options != 2 && Options != 3 ) {
           JOptionPane.showMessageDialog(null, "This is an incorrect option. Try again ");
           Options = Integer.parseInt(JOptionPane.showInputDialog("Select features from the the folowing menu - \n\n1: Add Tasks \n2: Show Report \n3: Quit "));
       }    
       switch(Options){
            case 1: 
                
                        creatTask();
                        break;
                
            case 2:
                JOptionPane.showMessageDialog(null, "Coming Soon ");
               break;
            case 3:
                JOptionPane.showMessageDialog(null, "Quit");
                break;
            default: System.out.println("");
   } //
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
       
       // Calling the taskPage class methods //
       taskPage(); //
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
    public static void creatTask(){
        int nuOfTasks = Integer.parseInt(JOptionPane.showInputDialog("Please enter the number of tasks to create "));
       
        // Creating method to creat the number of tasks the user wants
        for (int i = 1; nuOfTasks >= i; ++i){
            String tasName = JOptionPane.showInputDialog("Please enter the task name for the task No. " + i);
            task.setTaskName(tasName);
            String tasDescription = JOptionPane.showInputDialog("Task Description");
            task.setTaskDiscript(tasDescription);
            
            String devDetail = JOptionPane.showInputDialog("Enter Developer Detail ");
            task.setDevelopDetails(devDetail);
            int tasDuration = Integer.parseInt(JOptionPane.showInputDialog("Duration (in hours)"));
            task.setTaskDuration(tasDuration);
            // Creating drop down for user options
            String[] tasStatusOption = {"To do", "Done", "Doing"};
            String taStatus = (String) JOptionPane.showInputDialog(null, "Choose one of the following task statuses ", "Task Status", JOptionPane.QUESTION_MESSAGE, null, tasStatusOption, tasStatusOption[0]);
           task.setTaskStatus(taStatus);
           
           task.setTaskNumber(i);
            
            String tasDetails = task.printTaskDetails();
            JOptionPane.showMessageDialog(null, tasDetails);
            
            // Calling the returnTotalHours method
            int returnTotalHours = task.returnTotalHours();
            JOptionPane.showMessageDialog(null, ("Total Hours: ") + returnTotalHours);
            
        }     
        
        }   
    }
    



