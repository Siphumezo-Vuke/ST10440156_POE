
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.poe_p1_p2;

/**
 *
 * @author zmlaz
 */
import javax.swing.JOptionPane;
public class POE_P1_P2 {

    public static void main(String[] args) throws Exception {
         // This is where I am instantiating the object that I will use
        Login_Registration reg = new Login_Registration();
        Task p2 = new Task();
        
       String option =JOptionPane.showInputDialog(null, """
                                                        Option 1) Register 
                                                        Option 2) Login 
                                                        Option 3) Quit""");
       
       switch(option){
           case "1":
                reg.registrationMethod(); 
                JOptionPane.showMessageDialog(null, "You can now login, you will be directed there shortly");
                reg.loginMethod();
                if (reg.loginUser()== true) {
                    JOptionPane.showMessageDialog(null,"Welcome to Easy Kanban");
                    p2.main();
                 }  
                break;
           case "2":
                String choice = JOptionPane.showInputDialog(null,"Have you registered? (Yes/No)");
                if (choice.equalsIgnoreCase("Yes")){
                 reg.loginMethod(); 
                 if (reg.loginUser()== true) {
                    JOptionPane.showMessageDialog(null,"Welcome to Easy Kanban");
                    p2.main();
                 }  
                }else{
                  JOptionPane.showMessageDialog(null, "You have to register first, you will be directed there shortly");
                  reg.registrationMethod();
                }
                break; 
           default:
                    System.exit(0);
    }
    
}
}
