package BaiTap;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Bai23 extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField textField;
    
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Bai23 frame = new Bai23();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public Bai23() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 300, 400); // Kích thước cửa sổ
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(new GridBagLayout()); // Sử dụng GridBagLayout

        GridBagConstraints gbc = new GridBagConstraints();

        // Tạo JTextField để hiển thị kết quả
        textField = new JTextField();
        textField.setEditable(false);
        textField.setHorizontalAlignment(JTextField.RIGHT);
        gbc.gridwidth = 4;  // Chiếm hết 4 cột
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets = new Insets(10, 10, 10, 10); // Khoảng cách
        contentPane.add(textField, gbc);

        // Mảng các nút cho máy tính
        String[] buttons = {
            "7", "8", "9", "/",
            "4", "5", "6", "*",
            "1", "2", "3", "-",
            "0", "=", "+"
        };

        int row = 1, col = 0;

        // Thêm các nút vào trong GridBagLayout
        for (String text : buttons) {
            JButton button = new JButton(text);
            gbc.gridwidth = (text.equals("0")) ? 2 : 1; // Nút "0" chiếm 2 cột
            gbc.gridx = col;
            gbc.gridy = row;
            contentPane.add(button, gbc);

            col++;
            if (col > 3) { // Sau khi đã đủ 4 cột, chuyển sang dòng mới
                col = 0;
                row++;
            }

            // Lắng nghe sự kiện khi nhấn nút
            button.addActionListener(new ActionListener() {
                private String currentText = "";

                @Override
                public void actionPerformed(ActionEvent e) {
                    String command = e.getActionCommand();

                    if (command.equals("=")) {
                        try {
                            currentText = String.valueOf(eval(currentText));
                        } catch (Exception ex) {
                            currentText = "Error";
                        }
                    } else {
                        currentText += command;
                    }

                    textField.setText(currentText);
                }

                // Hàm tính toán đơn giản
                private double eval(String expr) {
                    try {
                        ScriptEngine engine = new ScriptEngineManager().getEngineByName("JavaScript");
                        Object result = engine.eval(expr);
                        if (result instanceof Number) {
                            return ((Number) result).doubleValue();
                        }
                        return 0; // Trả về 0 nếu kết quả không phải là số
                    } catch (Exception ex) {
                        return 0; // Trả về 0 nếu có lỗi xảy ra
                    }
                }
            });
        }
    }
}
