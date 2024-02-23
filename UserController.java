/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package m02a02.Controller;

import m02a02.Model.User;
import m02a02.View.UserView;

public class UserController {
    private User model;
    private UserView view;

    public UserController(User model, UserView view) {
        this.model = model;
        this.view = view;
    }

    public String getUsername() {
        return model.getUsername();
    }

    public void setUsername(String username) {
        model.setUsername(username);
    }

    // Consider removing or securing this method
    public void setPassword(String password) {
        // Implement password update logic here
    }

    public User.UserRole getRole() {
        return model.getRole();
    }

    public void setRole(User.UserRole role) {
        model.setRole(role);
    }

    public void updateUserView() {
        // Revised to avoid showing the password
        view.showUserDetails(getUsername(), getRole());
    }
}
