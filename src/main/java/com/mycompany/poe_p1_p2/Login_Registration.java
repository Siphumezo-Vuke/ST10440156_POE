/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poe_p1_p2;

/**
 *
 * @author siphumezo vuke
 */
import javax.swing.JOptionPane;
public class Login_Registration {
    //Declarations
  public String name;
  public String surname;
  public String username;
  public String password;
  public String enteredUsername;
  public String enteredPassword;

  //Registration method
public void registrationMethod(){
    name= JOptionPane.showInputDialog("Enter your name"); // Prompting the user to enter his/her name
    surname = JOptionPane.showInputDialog("Enter your surname"); // Prompting the user to enter his/her surname

    username = JOptionPane.showInputDialog("Create a username");// Prompting the user to create a username
    checkUserName(); //Checking the username

    password = JOptionPane.showInputDialog("Create a password");// Prompting the user to create a password
    checkPasswordComplexity(); //Checking the password
   
    registerUser();
}

// This is the method to check the username
public boolean checkUserName(){
  boolean containsUnderscore = false;
  char underscore='_';
  char u;
  for(int i=0 ; i<username.length(); i++){
    u=username.charAt(i);
    if (u == underscore){
      containsUnderscore = true;
     }
    }

    if(containsUnderscore == true && username.length()<=5){
    return true;
    }else{
    return false;
    }
  }

  // This is the method to check the password
  public boolean checkPasswordComplexity(){
    boolean hasCapitalLetter = false;
    boolean hasNumber = false;
    boolean hasSpecialCharacters =false;
    char specialCharacters[]= {'[','!','@','#','$','%','^','&','(',')','_','+',']'};
    char p;
    for(int i = 0 ;i<password.length(); i++){
       p=password.charAt(i);
       
       if (Character.isDigit(p)){
         hasNumber=true;
       }
       if (Character.isUpperCase(p)){
         hasCapitalLetter= true;
       }
       for (int k= 0; k<specialCharacters.length;k++){
         if(p == specialCharacters[k]){
         hasSpecialCharacters = true;
         }
       }
     }
     if (hasCapitalLetter == true && hasNumber == true && hasSpecialCharacters==true && password.length()>=8){
        return true;
     }else{
        return false;
     }
    

   }
   //This method returns the relevant message to the user when registering
   public String registerUser(){
      if (checkUserName() == false) {
          return "The user name is incorrectly formatted";
      }
      if (checkPasswordComplexity()==false){
          return "The password does not meet complexity requirements";
      }
      if(checkUserName()==true && checkPasswordComplexity()==true){
      }
      JOptionPane.showMessageDialog(null,"The two conditions have been met and the user has been succesfully registered");
      return "The two conditions have been met and the user has been succesfully registered";
  }
 
   //This is the login method  
   public void loginMethod(){
      enteredUsername = JOptionPane.showInputDialog(null, "Enter your username"); //Prompting the user to enter his/her username
      enteredUsername = JOptionPane.showInputDialog(null, "Enter your passsword"); // Prompting the user to enter his/her password
         if (loginUser() == true){
              JOptionPane.showMessageDialog(null,"Welcome "+name+", "+surname+ " it is great to see you again" );  
              returnLoginStatus();  
            }else{
              JOptionPane.showConfirmDialog(null,"Username or password incorrect, please try again" ); 
              returnLoginStatus();
             }
        returnLoginStatus();
        }

    //This method checks the password entered and the passwird stored
    public boolean loginUser(){
      if (enteredUsername == username&& enteredPassword == password){
      }
      return true;
    }
   
    // This method return the login status of the user
    public String returnLoginStatus(){
     if(loginUser()==true){
     return "A successful login";
     }else {
    return "A failed login";
     }
    }
}


