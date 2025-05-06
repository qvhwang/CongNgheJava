package BaiTap;

import java.awt.EventQueue;
import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.Font;

public class Bai12 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	public static void main(String[] args) {
		try {
			// Cố gắng đặt giao diện Nimbus
			UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");
		} catch (Exception e1) {
			try {
				// Nếu Nimbus không có, dùng Metal
				UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
			} catch (Exception e2) {
				// Nếu cả hai đều không được thì dùng mặc định
				System.out.println("Không thể thiết lập LookAndFeel. Dùng mặc định.");
			}
		}

		EventQueue.invokeLater(() -> {
			try {
				Bai12 frame = new Bai12();
				frame.setLocationRelativeTo(null); // Canh giữa màn hình
				frame.setVisible(true);
			} catch (Exception e) {
				e.printStackTrace();
			}
		});
	}

	public Bai12() {
		setTitle("Giao diện Nimbus hoặc Metal");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400, 300);

		contentPane = new JPanel();
		contentPane.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(10, 10));

		JLabel lblLookAndFeel = new JLabel("Giao diện hiện tại: " + UIManager.getLookAndFeel().getName(), SwingConstants.CENTER);
		lblLookAndFeel.setFont(new Font("Times New Roman", Font.BOLD, 18));
		contentPane.add(lblLookAndFeel, BorderLayout.CENTER);
	}
}
