/*

 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package m02a02.View;
import m02a02.Model.User;

public class UserView {
     
     // Method to show user details using individual parameters
     public void showUserDetails(String username, User.UserRole role) {
         System.out.println("----- User Information -----");
         System.out.println("Username: " + username);
         System.out.println("Role: " + role.toString());
     }
 
     // Existing method to show welcome message
     public void showWelcomeMessage(String username) {
         System.out.println("Welcome, " + username + "!");
     }
 }
 