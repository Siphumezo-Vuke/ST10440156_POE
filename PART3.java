/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poe_p1_p2;

/**
 *
 * @author siphumezoVuke
 */
import javax.swing.JOptionPane;
import java.util.Arrays;

public class PART3 extends Task {
       public String developers[];
       public String taskNames[];
       public String taskIDs[];
       public int taskDuration[];
       public String taskStatus[];
       
       // This is the method to populate arrays
    public void populateArrays(){
        int numOfTasks = Integer.parseInt(JOptionPane.showInputDialog(null, "How many task do you want to add")); //Prompting the user to enter how many tasks they want to add
               developers = new String[numOfTasks];
               taskNames = new String[numOfTasks];
               taskIDs = new String[numOfTasks];
               taskDuration = new int[numOfTasks];
               taskStatus = new String[numOfTasks];
           for(int i = 0; i <numOfTasks;i++){
                 
               String devs = JOptionPane.showInputDialog(null,"Enter the name of developer "+(i+1)); //Prompting the user to enter the name of the developer
               Arrays.fill(developers,devs);
               
               String name_of_task = JOptionPane.showInputDialog(null,"Enter the name of task "+(i+1)); //Prompting the user to enter the name of the task
               Arrays.fill(taskNames, name_of_task);
               
               String id_of_task = createTaskID(devs,numOfTasks,name_of_task);
               Arrays.fill(taskIDs, id_of_task);
               
               int duration_of_task =Integer.parseInt(JOptionPane.showInputDialog(null,"Enter the duration of task "+(i+1)));//Prompting the user to enter the duration of the task
               Arrays.fill(taskDuration, duration_of_task);
               
                       String status_of_task = JOptionPane.showInputDialog(null, """
                      What is your task status of task?
                      Option 1) To do
                      Option 2) Done
                      Option 3) Doing"""); //Prompting the user to enter the status of the task
                     switch (status_of_task) {
                        case "1":
                        Arrays.fill(taskStatus, "To do");
                            break;
                        case "2":
                        Arrays.fill(taskStatus, "Done");
                            break;
                        default:
                        Arrays.fill(taskStatus, "Doing");
                            break;
                    }
           }
    }
    
   
    // This is the method to display the menu of options available to the user
   public void displayOptions()  {
    Task t = new Task();
    PART3 p3 = new PART3();
     int menu =Integer.parseInt(JOptionPane.showInputDialog(null,"""
         Option 1) Display task with status done,
         Option 2) Display task with longest duration,
         Option 3) Search for task by task name,
         Option 4) Search for tasks associated with devloper,
         Option 5) Delete task,
         Option 6) Show report,
         Option 7) Quit
         """));
         switch (menu) {
            case 1 -> p3.displayTaskDone(taskStatus);
              case 2 -> p3.longestDuration(taskDuration,developers);
                  case 3 -> p3.taskNameSearch(taskNames,developers,taskStatus);
                    case 4 -> p3.developerSearch(developers,taskNames,taskStatus);
                      case 5 -> p3.deleteTask(taskNames);
                         case 6 -> p3.displayTaskDone(taskStatus);
                             case 7 -> p3.exit();
         }
   }

   //This is the method that displays the status of specific tasks
    public void displayTaskDone(String status[]){
            for(int i = 0; i<status.length;i++){
               String statusSearch = JOptionPane.showInputDialog(null,"What is the status of the tasks you are"+"looking for");
               if (statusSearch.equals(status[i])) {
                   JOptionPane.showMessageDialog(null, "Task Name :"+taskNames[i]
                   + "Developer: "+developer[i]+"Duration: "+duration[i]);
               }
            }
           }
    
    // This is the method that displays the task with the longest duration
    public String longestDuration(int taskDuration[], String developers[]){
           int maximum = taskDuration[0];
           int index = 0;
           for(int i = 0; i<taskDuration.length;i++){
               if(maximum < taskDuration[i]){
                   maximum = taskDuration[i];
               }
           }
           
           for(int i = 0; i<taskDuration.length;i++){
              if(maximum == taskDuration[i]){
                  index = i;
              }  
           }
           
            JOptionPane.showMessageDialog(null,"Developer: "+developers[index]+ "Duration: "+taskDuration[index]); 
            String output = "Developer: "+developers[index] + " Duration: "+taskDuration[index];
            return output;
    }
    
    //This is the method that searches for a specific task
    public String taskNameSearch(String taskNames[], String developers[], String taskStatus[]){
            String taskSearch = JOptionPane.showInputDialog(null, "What task you looking for");
            int index = 0;
            for(int i = 0; i<taskNames.length;i++){
            if (taskSearch.equalsIgnoreCase(taskNames[i])){
               index = i; 
            }
            }
                 JOptionPane.showMessageDialog(null, "Task Name: "+taskNames[index]
                + " Developer: "+developers[index]+" Status: "+taskStatus[index]);   
             String output ="Task Name: "+taskNames[index]+""+" Developer: "+developers[index]+" Status: "+taskStatus[index];
          return output;
        }

    //This method searches for a developer and outputs the tasks assigned to that developer   
   public String developerSearch(String developers[],String taskNames[], String taskStatus[]){
        String developerSearch = JOptionPane.showInputDialog(null, "Enter developer that you are looking for");
        int index = 0;
       for(int i = 0; i<developers.length;i++){
          if(developerSearch.equalsIgnoreCase(developers[i])){
              index = i; 
        }
        }
       JOptionPane.showMessageDialog(null, "Task Name :"+taskNames[index]
             +"Status: "+taskStatus[index]);    
       return "Task Name :"+taskNames[index]
             +" Status: "+taskStatus[index];
   }
    
    //This is a method to delete a task
    public String deleteTask(String taskNames[]){
            taskName =JOptionPane.showInputDialog(null, "Enter the task name that you would like to delete");
            int subscript = 0;
            String outcome="";
            for (int i = 0;i<taskNames.length;i++){
              if (taskName.equalsIgnoreCase(taskNames[i])) {
                  subscript = i;
                  outcome =taskNames[subscript]+" has been deleted"; 
                  JOptionPane.showMessageDialog(null,taskNames[subscript]+" has been deleted");
                  taskNames[subscript] = "";
              }
            }             
           return outcome;
           
          }
   
    //This is a method to show a report of all the tasks
    public String showReport(String taskName[],String developers[], int taskDuration[], String taskIDs[], String taskStatus[]){
        String output = "";    
        for(int i = 0 ;i<tasks; i++){
                JOptionPane.showMessageDialog(null,"Task name: "+taskNames[i] +"\n"+ "Task Description: "+
                        "\n"+"Developer details: "+ developers[i]+"\n"+"Duration: "+taskDuration[i]+"\n"+"Task ID: "+
                "\n"+ "Task Status: "+taskStatus[i]);
                output = "Task name: "+taskNames[i] +"\n"+ "Task Description: "+
                        "\n"+"Developer details: "+ developers[i]+"\n"+"Duration: "+taskDuration[i]+"\n"+"Task ID: "+"\n"+ "Task Status: "+taskStatus[i]; 
            } 
            return output;
    }
   
    //This is a method to exit the task
    public void exit(){
        System.exit(0);
    }
}

