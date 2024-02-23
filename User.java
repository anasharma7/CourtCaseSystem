/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package m02a02.Model;

public class User {
    private String username;
    private String password;
    private UserRole role;

    public enum UserRole {
        ADMIN, CLERK, ATTORNEY, JUDGE
    }

    public User(String username, String password, UserRole role) {
        this.username = username;
        this.password = password;
        this.role = role;
    }

    public String getUsername() { return username; }
    public void setUsername(String username) { this.username = username; }
    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }
    public UserRole getRole() { return role; }
    public void setRole(UserRole role) { this.role = role; }

    public boolean isAdmin() { return this.role == UserRole.ADMIN; }
    public boolean isClerk() { return this.role == UserRole.CLERK; }
    public boolean isAttorney() { return this.role == UserRole.ATTORNEY; }
    public boolean isJudge() { return this.role == UserRole.JUDGE; }
}
