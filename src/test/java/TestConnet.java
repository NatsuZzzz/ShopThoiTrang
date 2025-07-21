
import Shop.util.JDBC;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ADMIN
 */
public class TestConnet {
        public static void main(String[] args) {
        if (JDBC.getConnection() != null) {
            System.out.println("✅ Kết nối SQL Server thành công!");
        } else {
            System.out.println("❌ Kết nối thất bại!");
        }
    }
}
