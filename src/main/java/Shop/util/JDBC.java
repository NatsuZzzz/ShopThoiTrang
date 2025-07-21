/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Shop.util;
import java.sql.Connection;
import java.sql.DriverManager;
/**
 *
 * @author ADMIN
 */
public class JDBC {
      public static Connection getConnection() {
        try {
            String url = "jdbc:sqlserver://Natsu:1433;databaseName=ShopQuanAo;encrypt=false";
            String user = "sa";         // Tài khoản SQL Server
            String password = "05082006"; // Mật khẩu SQL Server

            Connection conn = DriverManager.getConnection(url, user, password);
            return conn;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
