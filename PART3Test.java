/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.poe_p1_p2;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author zmlaz
 */
public class PART3Test {
    
    public PART3Test() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }
    
    PART3 p3 = new PART3();
    
    //This is where I declare the data to be used for testing 
    
    String developers[]={"Mike Smith","Edward Harrison","Samantha Paulson","Glenda Oberholzer"};
    String taskNamesTest[]= {"Create Login","Create Add Features","Create Reports","Add Arrays"};
    int taskDurationTest[] = {5,8,2,11};
    String taskStatusTest[] ={"To Do","Doing","Done","To Do"};
    
    
    //This is the array population test
    @Test
    public void populateArrays(){
        System.out.println("Developer Array");
        p3.populateArrays();
        String expResult[] = {"Mike Smith","Edward Harrison","Samantha Paulson","Glenda Oberholzer"};
        String result[] = p3.developers;
        for(int i = 0;i<expResult.length;i++){
            for(int j =0 ; i<p3.developers.length;j++ ){
                assertEquals(expResult[i],result[j]);
            }
        }
    }
    
    //This is the longest duration method test
    @Test
    public void longestDuration(){
      System.out.println("Longest Duration check");
              String expResult = "Developer: "+"Glenda Oberholzer "+ "Duration: "+11;
              String result = p3.longestDuration(taskDurationTest, developers);
              assertEquals(expResult,result); 
    }
    
    //This is the search for task method test
    @Test
    public void searchForTask(){
        System.out.println("Search for a task"); 
         String exp = "Task Name: "+"Create Login"+" Developer: "+"Mike Smith"+" Status: "+" To Do";
         String result = p3.taskNameSearch(taskNamesTest,developers,taskStatusTest);
         assertEquals(exp,result);
    }
    
    @Test
    public void searchForTaskAssignedToDeveloper(){
        System.out.println("Search for a task assigned to developer"); 
         String exp = "Task Name: Create Reports Status: Done";
         String result = p3.developerSearch(developers, taskNamesTest,taskStatusTest);
         assertEquals(exp,result);
    }
    
    @Test
    public void deleteTask(){
        System.out.println("Delete"); 
         String result = "Create Reports has been deleted";
         String exp =p3.deleteTask(taskNamesTest);
         assertEquals(exp,result);
    } 
    
    @Test
    public void showReport(){
        System.out.println("Show Report"); 
        for(int i = 0;i<taskNamesTest.length;i++){
            for(int j =0 ; i<developers.length;j++ ){
                String exp = "Task name: "+taskNamesTest[i] +"\n"+ "Task Description: "+
                        "\n"+"Developer details: "+ developers[i]+"\n"+"Duration: "+taskDurationTest[i]+"\n"+
                "\n"+ "Task Status: "+taskStatusTest[i]; 
                String result = p3.showReport(taskNamesTest, developers, taskDurationTest, taskNamesTest, taskStatusTest);
                assertEquals(exp,result);
            }
        }
    } 
}
