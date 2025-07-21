/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Shop.entity;

/**
 *
 * @author ADMIN
 */
public class Admins {
      private int adminId;
    private String fullName;
    private String username;
    private String password;
    private String role;

    // Constructor không tham số
    public Admins() {
    }
    public int getAdminId() {
        return adminId;
    }

    public void setAdminId(int adminId) {
        this.adminId = adminId;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    // Constructor đầy đủ
    public void setRole(String role) {
        this.role = role;
    }

    public Admins(int adminId, String fullName, String username, String password, String role) {
        this.adminId = adminId;
        this.fullName = fullName;
        this.username = username;
        this.password = password;
        this.role = role;
    }
}
