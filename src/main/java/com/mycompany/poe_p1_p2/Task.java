/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poe_p1_p2;

/**
 *
 * @author zmlaz
 */
import java.util.Arrays;
import javax.swing.JOptionPane;

public class Task extends Login_Registration {
    public void main(){
                 //This is to display a menu to the user to choose what they want to do
                 int choice =Integer.parseInt(JOptionPane.showInputDialog(null, """
                    Option 1) Add tasks 
                    Option 2) Show report - This feature is under development 
                    Option 3) Quit"""));
             if(choice == 1){
             int tasks = Integer.parseInt(JOptionPane.showInputDialog(null,"How many tasks do you want to add?"));
                  // This is the declaration of all variables and arrays that I will use
                String taskName = "";
                String descriptionArr[]= new String[tasks];
                int taskNumber[] = new int[tasks];
                String developer[]= new String[tasks];
                String taskID[]= new String[tasks];
                String status[]= new String[tasks];
                String taskNameArr[]= new String[tasks];
                int duration[]=new int[tasks];
                int numTask = 0;
                int hours = 0;

                 for (int j = 1; j<=tasks;j++){
                    taskName = JOptionPane.showInputDialog(null,"What is the name of task "+ (j)); //Prompting the user to enter the name of the task
                    Arrays.fill(taskNameArr, taskName);
       
                    numTask++;
                    Arrays.fill(taskNumber, numTask);
       
                  String description = JOptionPane.showInputDialog(null,"Enter the task description");//Prompting the user to enter the description of the task
       
                  if( checkTaskDescription(description) == true){//Checking if the task description matches the required length
                     JOptionPane.showMessageDialog(null,"Task succesfully captured" );
                     Arrays.fill(descriptionArr, description);
                  }else{
                       JOptionPane.showMessageDialog(null,"Please enter a task description of less than 50 characters" );
                   } 
           

                  String developerDetails = JOptionPane.showInputDialog(null,"Enter the devoloper details, name and surname");//Prompting the user to enter the developer of the task
                  Arrays.fill(developer, developerDetails);
       
                  hours = Integer.parseInt(JOptionPane.showInputDialog(null,"What is the task duration"));//Prompting the user to enter the duration of the task
                  Arrays.fill(duration, hours);
       
                  String taskId = createTaskID(developerDetails, numTask,taskName);
                  Arrays.fill(taskID, taskId);


                  String taskStatus =JOptionPane.showInputDialog(null, """
                    What is your task status?
                    Option 1) To do
                    Option 2) Done
                    Option 3) Doing"""); //Prompting the user to enter the status of the task
                    switch (taskStatus) {
                        case "1":
                        Arrays.fill(status, "To do");
                            break;
                        case "2":
                        Arrays.fill(status, "Done");
                            break;
                        default:
                        Arrays.fill(status, "Doing");
                            break;
                    }
                     
                  
              }
            printTaskDetails(descriptionArr, developer, taskID, status, taskNameArr, taskNumber, duration,tasks); //Printing the task details
            //returnTotalHours(hours);

             }
         if (choice == 2) {
            JOptionPane.showMessageDialog(null,"Coming soon");
         }
         
         if (choice == 3){
            System.exit(0);
        }

    }

    //This is the method that creates the TaskId for the user
    public static String createTaskID(String developerDetails, int numTask,String taskName){
        String first2 = taskName.substring(0, 2);
        String last3 = developerDetails.substring(2,6);
        String taskNumber =  Integer.toString(numTask);
        String taskId= first2.toUpperCase()+":"+taskNumber+":"+last3.toUpperCase(); 
        return taskId;
    }

    //This is the method that return the total hours of each task
    public static int returnTotalHours(int duration[]){
        int totalHours = 0;
        for(int i =0 ; i<duration.length;i++){
           totalHours = totalHours+duration[i]; 
        }
        JOptionPane.showMessageDialog(null,totalHours);
        return totalHours;
    }

    //This is the method that prints the task details
    public static String printTaskDetails(String descriptionArr[], String developer[], String taskID[],
    String status[],String taskNameArr[],int taskNumber[],int duration[],int tasks){
        String output = "";
        for(int i = 0 ;i<tasks; i++){
            output= "Task name: "+taskNameArr[i] + "\n"+ "Task number: "+taskNumber[i]+"\n"+ "Task Description: "+
            descriptionArr[i]+"\n"+"Developer details: "+ developer[i]+"\n"+"Duration: "+duration[i]+"\n"+"Task ID: "+taskID[i]+
            "\n"+ "Task Status: "+status[i];
        }
      JOptionPane.showMessageDialog(null,output);
      return output;
    }

    // This is the method that checks if the description is more or less than 50 characters
    public static boolean checkTaskDescription(String description){
        if (description.length()<=50) {
            return true;
        }else{
            return false;
        }
    }   
}
