/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poepart1;
import java.util.*;
import javax.swing.*;  
/**
 *
 * @author Daki
 */
public class Task { 
    // Declaring variables
    private String firstName;
    private String lastName; 
    private String taskName;
    private int taskNumber;
    private String taskDiscript;
    private String developDetails;
    private int taskDuration;
    private int taskID;
    private String taskStatus;
    
    // Initializing variables
    public Task(){
        this.firstName = "";
        this.lastName = "";
        this.taskName = "";
        this.taskNumber = 0;
        this.taskDiscript = "";
        this.developDetails = "";
        this.taskDuration = 0;
        this.taskID = 0;
        this.taskStatus = "";
        
    }
    
    // Using setter and getters to get access to the private variables
    public void setTaskName(String taskName){
        this.taskName = taskName;
    }
     public String getTaskName(){
        return this.taskName;
    }
     
     
    public void setTaskNumber(int taskNumber) {
        this.taskNumber = taskNumber;
    }
    public int getTaskNumber(){
        return this.taskNumber;
    }
    
    
      public void setTaskDiscript(String taskDiscript){
        this.taskDiscript = taskDiscript;
    }
      public String getTaskDiscript(){
        return this.taskDiscript;
    }
     
     
      public void setDevelopDetails(String developDetails){
        this.developDetails = developDetails;
    }
     public String getDevelopDetails(){
        return this.developDetails;
    }
     
     
      public void setTaskDuration(int taskDuration){
        this.taskDuration = taskDuration;
    }
      public int getTaskDuration(){
        return this.taskDuration;
    }
     
     
      public void setTaskID(int taskID){
        this.taskID = taskID;
    }
     public int getTaskID(){
        return this.taskID;
    }
     
     
      public void setTaskStatus(String taskStatus){
        this.taskStatus = taskStatus;
    }
     public String getTaskStatus(){
        return this.taskStatus;
    }
     
     //Creating a welcome page
    // public static String welcomePage(){
            
    // } 
     
     // Creating method to set conditions for length
     public boolean checkTaskDiscription(){
        boolean taskDescriptionlength = false;
         int taskLength = this.taskDiscript.length();
        if(taskLength < 50){taskDescriptionlength = true;}
            return taskDescriptionlength;     
    }
     // Creating a method that autogenerates a taskID
     public String creatTaskID(){
         String taskName = this.taskName;
         int taskNumber = this.taskNumber;
         String developDetails = this.developDetails;
         // Making use of string manipulation and length method creat the elements contained in the taskID
         String firstTwoLetter = taskName.substring(0, Math.min(taskName.length(), 2)).toUpperCase();
         
         String lastThreeLetters = developDetails.substring(Math.max(0,developDetails.length() - 3)).toUpperCase();
        
        return firstTwoLetter + ":" + taskNumber + ":" + lastThreeLetters;
        
    }
     
     // Creating method that returns the full task details of each task
     public String printTaskDetails(){
         String taskId = creatTaskID();
       return (("Task Status: ") + this.taskStatus + ("\n") + ("Developer Details: ") + this.developDetails + ("\n") + ("Task Number: ") + this.taskNumber + ("\n")
                + ("Task Name: ") + this.taskName + ("\n") + ("Task Description: ") + this.taskDiscript + ("\n") + ("Task ID: ") + taskId + ("\n") + ("Task Duration: ") + this.taskDuration);
     }
     
     // Creating a method that returns the total combined hours of entered tasks
     public int toHours = 0;
     public int returnTotalHours(){
         toHours = toHours + this.taskDuration;
         return toHours;
         
     }
}    
        
                
                

         
     
     

     
     
 
    
  
    
    
    
    
    

   

