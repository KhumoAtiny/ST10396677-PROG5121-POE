/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package POE_PROG5121_ST10396677;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// This class implements a simple login and registration system where users can register 
//with a username and password and then log in using the same credentials.

public class Login {
     String userName;
     String password;
     String firstName;
     String lastName;

    
    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
         try ( Scanner sc = new Scanner(System.in)) {
             Login user1 = new Login(); // Initialize a Login object to hold user information
             
             // User registration section
             System.out.println("Registration:");
             System.out.print("Enter your First Name: ");
             user1.firstName = sc.nextLine();
             System.out.print("Enter your Last Name: ");
             user1.lastName = sc.nextLine();
             System.out.print("Enter the username: ");
             user1.userName = sc.nextLine();
             System.out.print("Enter the password: ");
             user1.password = sc.nextLine();
             
             // Validates the username
             if (checkUsername(user1.userName)) {
                 System.out.println("Username successfully captured.");
             } else {
                 System.out.println("Username is not correctly formatted. Please ensure that your username contains an underscore and is no more than 5 characters long.");
             }    
             
            // Validates the password
             if (checkPasswordComplexity(user1.password)) {
                 System.out.println("Password successfully captured.");
             } else {
                 System.out.println("Password is not correctly formatted. Please ensure that the password contains at least 8 characters, a capital letter, a number, and a special character.");
             }   
             
             
            // Login section
             System.out.print("Enter your username to login: ");
             String enteredUsername = sc.nextLine();
             System.out.print("Enter your password to login: ");
             String enteredPassword = sc.nextLine();
             // Check the credentials and greets the user if correct
             if (enteredUsername.equals(user1.userName) && enteredPassword.equals(user1.password)) {
                 System.out.println("Welcome " + user1.firstName + " " + user1.lastName + ", it is great to see you again.");
             } else {
                 System.out.println("Username or password incorrect, please try again.");
             }
             // Close the Scanner object
         } 
    }

    /**
     * Checks if the provided username is valid based on predefined rules.
     * @return true if valid, false otherwise.
     */
    static boolean checkUsername(String userName) {
        if (userName.length() <= 5 && userName.contains("_")) {
            return true; // Valid username
        } else {
            return false; // Invalid username
        }
    }

    /**
     * Checks if the provided password meets the complexity requirements.
     * @return true if it meets the requirements, false otherwise.
     */
    static boolean checkPasswordComplexity(String password) {
        String regex = "^(?=.*[0-9])"
                + "(?=.*[a-z])"
                + "(?=.*[A-Z])("
                + "?=.*[@#$%^&+=])("
                + "?=\\S+$).{8,20}$";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(password);
        if (m.matches()) {
            return true; // Password is complex enough
        } else {
            return false; // Password does not meet complexity requirements
        }
    }
}
