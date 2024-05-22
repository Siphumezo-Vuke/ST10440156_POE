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
public class TaskTest {

    
    public TaskTest() {
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

    /**
     * Test of createTaskID method, of class Task.
     */
    @Test
    public void testCreateTaskID() {
        System.out.println("createTaskID");
        String developerDetails = "Robyn Harrison";
        String taskName = "Login Feature";
        int numTask = 1;
        String expResult = "LO:1:BYN";
        String result = Task.createTaskID(developerDetails, numTask,taskName);
        assertEquals(expResult, result);
    }

    /**
     * Test of returnTotalHours method, of class Task.
     */
    @Test
    public void testReturnTotalHours() {
        System.out.println("returnTotalHours");
        int duration[]={8,10};
        int expResult = 18;
        int result = Task.returnTotalHours(duration);
        assertEquals(expResult, result);   
    }
    /**
     * Test of returnTotalHours method with additional data, of class Task.
     */
    @Test
    public void testReturnTotalHours2(){
        int numtasks=5;
        int duration[]={10,12,55,11,1};
        int expResult = 89;
        int result=  Task.returnTotalHours(duration);
        assertEquals(expResult,result); 
    }
 

    /**
     * Test of checkTaskDescription method, of class Task for a pass.
     */
    @Test
    public void testCheckTaskDescription() {
        // Unit test for task number 1
        System.out.println("checkTaskDescription");
        String taskDescription ="Create login to authenticate users";
        boolean expResult1 = true;
        boolean result1 = Task.checkTaskDescription(taskDescription);
        assertEquals(expResult1, result1);
    }
    /**
     * Test of checkTaskDescription method, of class Task for a fail.
     */
     @Test
    public void testCheckTaskDescription2() {
        // Unit test for task number 1
        Task t = new Task();
        System.out.println("checkTaskDescription");
        String taskDescription ="Create login feature so that users are able to use the application efficiently";
        boolean expResult1 = false;
        boolean result1 = Task.checkTaskDescription(taskDescription);
        assertEquals(expResult1, result1);
    }
    
}
