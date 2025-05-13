package BaiTap;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Bai25 extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JLabel label;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Bai25 frame = new Bai25();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public Bai25() {
        // Thiết lập cửa sổ JFrame
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 300, 200); // Kích thước cửa sổ
        contentPane = new JPanel();
        contentPane.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20)); // Khoảng cách xung quanh
        setContentPane(contentPane);
        contentPane.setLayout(new FlowLayout()); // Sử dụng FlowLayout cho bố cục

        // Thêm JLabel để hiển thị lựa chọn
        label = new JLabel("Your gender is: ");
        contentPane.add(label);

        // Tạo ButtonGroup để chứa các JRadioButton
        ButtonGroup group = new ButtonGroup();

        // Tạo JRadioButton cho "Male" và "Female"
        JRadioButton maleButton = new JRadioButton("Male");
        JRadioButton femaleButton = new JRadioButton("Female");

        // Thêm các JRadioButton vào ButtonGroup
        group.add(maleButton);
        group.add(femaleButton);

        // Thêm các nút vào contentPane
        contentPane.add(maleButton);
        contentPane.add(femaleButton);

        // Lắng nghe sự kiện chọn giới tính
        maleButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText("Your gender is: Male");
            }
        });

        femaleButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText("Your gender is: Female");
            }
        });
    }
}
