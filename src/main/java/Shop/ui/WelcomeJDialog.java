/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Shop.ui;

/**
 *
 * @author ADMIN
 */
// 🎉 WelcomeJDialog dạng Splash Screen tự động tắt – đẹp – chuyên nghiệp
// ✅ Tự động đóng sau 3 giây, có thể dùng cho mọi dự án

import java.awt.*;
import javax.swing.*;

public class WelcomeJDialog extends JDialog {
    public WelcomeJDialog(Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();

        // 🕒 Auto close sau 3 giây (3000 ms)
        new javax.swing.Timer(3000, e -> dispose()).start();
    }

    private void initComponents() {
        // 👉 Giao diện đơn giản, hiện đại
        JPanel panel = new JPanel();
        panel.setBackground(new Color(30, 30, 30)); // nền đen hiện đại
        panel.setLayout(new BorderLayout());

        JLabel lblTitle = new JLabel("✨ WELCOME TO RR SHOP ✨", SwingConstants.CENTER);
        lblTitle.setForeground(Color.WHITE);
        lblTitle.setFont(new Font("Arial", Font.BOLD, 24));

        JLabel lblSubtitle = new JLabel("Fashion That Speaks Your Style", SwingConstants.CENTER);
        lblSubtitle.setForeground(Color.LIGHT_GRAY);
        lblSubtitle.setFont(new Font("Arial", Font.ITALIC, 16));

        panel.add(lblTitle, BorderLayout.CENTER);
        panel.add(lblSubtitle, BorderLayout.SOUTH);

        getContentPane().add(panel);
        setUndecorated(true); // không viền, như splash screen chuyên nghiệp
        setSize(500, 250);
        setLocationRelativeTo(null); // căn giữa màn hình
    }

    public static void main(String[] args) {
        // 👉 Chạy Welcome độc lập để test
        SwingUtilities.invokeLater(() -> {
            WelcomeJDialog dialog = new WelcomeJDialog(null, true);
            dialog.setVisible(true);
        });
    }
} // END
