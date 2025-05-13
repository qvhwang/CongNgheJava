package BaiTap;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Bai32 extends JFrame {

    private static final long serialVersionUID = 1L;

    public Bai32() {
        setTitle("TextArea Example");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLocationRelativeTo(null); // Căn giữa màn hình

        // Tạo JTextArea và đặt trong JScrollPane
        JTextArea textArea = new JTextArea();
        JScrollPane scrollPane = new JScrollPane(textArea);

        // Tạo nút Clear
        JButton clearButton = new JButton("Clear");

        // Sự kiện xóa nội dung khi bấm nút
        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textArea.setText("");
            }
        });

        // Layout chính
        add(scrollPane, BorderLayout.CENTER);
        add(clearButton, BorderLayout.SOUTH);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Bai32 frame = new Bai32();
            frame.setVisible(true);
        });
    }
}
