package BaiTap;

import javax.swing.*;
import java.awt.*;

public class Bai19 {
    public static void main(String[] args) {
        // Tạo JFrame với kích thước 400x300
        JFrame frame = new JFrame("BoxLayout Example");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Tạo JPanel chính với BoxLayout dọc
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
        
        // Tạo hai JPanel con với BoxLayout ngang
        JPanel panel1 = createSubPanel();
        JPanel panel2 = createSubPanel();
        
        // Thêm các JPanel con vào JPanel chính
        mainPanel.add(panel1);
        mainPanel.add(panel2);
        
        // Thêm JPanel chính vào JFrame
        frame.add(mainPanel);
        
        // Hiển thị JFrame
        frame.setVisible(true);
    }

    // Phương thức tạo JPanel con
    private static JPanel createSubPanel() {
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.X_AXIS));
        
        // Tạo các JLabel
        JLabel label1 = new JLabel("Label 1");
        JLabel label2 = new JLabel("Label 2");
        
        // Tạo JButton
        JButton button = new JButton("Button");
        
        // Thêm JLabel và JButton vào JPanel con
        panel.add(label1);
        panel.add(label2);
        panel.add(button);
        
        return panel;
    }
}
