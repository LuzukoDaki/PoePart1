/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poepart1;
// Filename Account.java
// Written by <Luzuko Daki>
// Written on < 17/4/24 - 19/4/24 >
import javax.swing.JOptionPane;
/**
 *
 * @author Daki
 */
public class Login {
    //declaring variables
   private String userName;
   private String passWord;
   private String name;
   private String lastName;
    
    
    // This method ensures that any username contains an under score (_) and is no more than
    public Login (){
        this.userName = "";
        this.passWord = "";
        this.name = "";
        this.lastName = "";  
    }
    //setters for first name
    public void setName(String name){
        this.name = name;
    }
    //getters for first name
    public String getName(){
        return this.name;
    }
    //setters for last name
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    // getter for last name
    public String getLastName(){
        return this.lastName;
    }
    //setters
    public void setuserName(String userName){
        this.userName = userName;
    }
    
    //getters
    public String getUserName(){
        return this.userName;
    }
    public boolean checkUserName(){
       // This method ensures that any username contains an under score (_) and is no more than 5 characters long
       boolean underScore = false;
        underScore=this.userName.contains("_");
        // using if statements to creat condition
        if(this.userName.length()<=5 && underScore==true){ 
           return true;
            
        }else{
          return false;  
        } 
       }
    //setter
    public void setpassWord(String passWord){
        this.passWord = passWord;
    }
    //getters
    public String getPassword(){
        return this.passWord;
    }
    public boolean checkPasswordComplexity(){
        // This method ensures that passwords meet the following password complexity rules
        // initializing variables
        boolean minimumPassWordLength = (passWord.length()>=8);
        boolean containsCapitalLetter = false;
        boolean containsNumber = false;
        boolean containsSpecialCharacter = false;
     
        // Declared and initialized variable for special characters
        String specialChars = "/*!@#$%^&*()\"{}_[]|\\?/<>,.";

        char[] passWordChars  = passWord.toCharArray();
        for(int i = 0; i >= passWord.length(); i++){
            if(Character.isUpperCase(passWordChars[i])){
                containsCapitalLetter = true;
                continue;                                                                 
            }
           if(Character.isDigit(passWordChars[i])){
               containsNumber = true;
               continue;
               
           }
           if(specialChars.contains(passWord)){
               containsSpecialCharacter = true;
               
           }
        }
        if(minimumPassWordLength && containsCapitalLetter && containsNumber && containsSpecialCharacter){
            return true;
            
        }
        return false;    
    }
    // This method returns the necessary registration messaging indicating if:
    // 1 The username is incorrectly formatted
    // 2 The password does not meet the complexity requirements.
    // 3 The two above conditions have been met and the user has been registered successfully.
    public String registerUser(){   
        boolean isValidUserName = checkUserName();
        boolean isValidPassWord = checkPasswordComplexity();
       
   
        if(!isValidPassWord){
            return ("Password is not correctly formatted, please ensure that the password contains at least 8 characters, a capital letter, a number and a special character.");
        }
        if(!isValidUserName){
            return ("Username is not correctly formatted, please ensure that your username contains an underscore and is no more than 5 characters in length ");
        }
            return  ("Username and Password have been successfully captured"); 
    
        
    }
    // using method that verifies that the login details entered matches the login details stored when the user registers.
    public boolean loginUser(String loginUserName, String loginPassWord){
    
        if(loginUserName.equals(userName) || loginPassWord.equals(passWord) ){
          return false;
        }
          return true;
         
   }
    
    public class returnLoginStatus {
        public String returnLoginStatus(boolean isSuccess){
            if(isSuccess){
                return "Welcome <user first name> ,<user last name> it is great to see you again";
            } else { return "Username or password incorrect, please try again";
        }
        }       
    }
        //boolean isuserLogin;
       // boolean ispassLogin;
        
      // if(isuserLogin = userName && ispassLogin = passWord){
         //  return "Welcome <user first name> ,<user last name> it is great to see you again";
    //   } 
   // }
    
}

