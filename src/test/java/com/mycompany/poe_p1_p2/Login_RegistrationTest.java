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
public class Login_RegistrationTest {
    
    public Login_RegistrationTest() {
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
    
    Login_Registration log = new Login_Registration();
    /**
     * Test of checkUserName method, of class Login_Registration
     */
    @Test
    public void testCheckUserName(){
        
        System.out.println("checkUsername");
        String username = "ky1_1";
        boolean expResult = false;
        boolean result = log.checkUserName();
        assertEquals(expResult,result);
        //TODO review the generated test code and remove the default call to fail
        //fail("The test case is a prototype");
    }
    
    /**
     * Test of passwordComplexity method, of class Login_Registration
     */
    @Test
    public void testPasswordComplexity(){
        System.out.println("passwordComplexity");
        String password = "Ch&&sec@ke99!";
        boolean expResult = false;
        boolean result = log.checkPasswordComplexity();
        assertEquals(expResult,result);
         //TODO review the generated test code and remove the default call to fail
        fail("The test case is a prototype");
    }  
     
    /**
     * Test of registerUser method, of class Login_Registration
     */
    @Test
    public void testRegisterUser(){
        System.out.println("registerUser");
        String username = "ky1_1";
        String password = "Ch&&sec@ke99!";
        String expResult = "";
        String result = log.registerUser();
        assertEquals(expResult,result);
         //TODO review the generated test code and remove the default call to fail
        fail("The test case is a prototype");
    }  
    
     /**
     * Test of loginUser method, of class Login_Registration
     */
    @Test
     public void testLoginUser(){
        System.out.println("loginUser");
        String username = "ky1_1";
        String password = "Ch&&sec@ke99!";
        boolean expResult = false;
        boolean result = log.loginUser();
        assertEquals(expResult,result);
         //TODO review the generated test code and remove the default call to fail
        fail("The test case is a prototype");
    }
     
     /**
     * Test of returnLoginStatus method, of class Login_Registration
     */
}
