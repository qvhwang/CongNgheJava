package BaiTap;

import javax.swing.*;
import java.awt.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Bai26 extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JSlider slider;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Bai26 frame = new Bai26();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public Bai26() {
        // Thiết lập cửa sổ JFrame
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 400, 200); // Kích thước cửa sổ
        contentPane = new JPanel();
        setContentPane(contentPane);
        contentPane.setLayout(new BorderLayout()); // Sử dụng BorderLayout

        // Tạo JSlider từ 0 đến 255
        slider = new JSlider(0, 255);
        slider.setPaintTicks(true);  // Hiển thị dấu tick
        slider.setPaintLabels(true); // Hiển thị giá trị trên slider
        slider.setMajorTickSpacing(51); // Khoảng cách chính giữa các dấu tick
        slider.setMinorTickSpacing(25); // Khoảng cách nhỏ giữa các dấu tick

        // Lắng nghe sự thay đổi giá trị của JSlider
        slider.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                int value = slider.getValue();
                // Cập nhật màu nền với giá trị RGB
                contentPane.setBackground(new Color(value, value, value));
            }
        });

        // Thêm JSlider vào cửa sổ
        contentPane.add(slider, BorderLayout.SOUTH);
    }
}
