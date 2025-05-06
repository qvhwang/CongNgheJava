package Hoang;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JFormattedTextField;
import javax.swing.text.DateFormatter;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JScrollPane;

public class VDjtextfiled extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtQuchVitHong;
	private JTextField textField;
	private JLabel lblThngTinSinh;
	private JTextArea textArea;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VDjtextfiled frame = new VDjtextfiled();
					frame.setLocationRelativeTo(null);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public VDjtextfiled() {
		setTitle("Quách Việt Hoàng");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 551);
		contentPane = new JPanel();
		contentPane.setBackground(Color.CYAN);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		txtQuchVitHong = new JTextField();
		txtQuchVitHong.setBackground(Color.LIGHT_GRAY);
		txtQuchVitHong.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		txtQuchVitHong.setColumns(10);

		JLabel lblNewLabel = new JLabel("Họ tên:");
		lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 20));

		textField = new JTextField();
		textField.setBackground(Color.LIGHT_GRAY);
		textField.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		textField.setColumns(10);

		JLabel lblMSv = new JLabel("Mã SV:");
		lblMSv.setFont(new Font("Times New Roman", Font.PLAIN, 20));

		JLabel lblNewLabel_1_1 = new JLabel("Ngày sinh:");
		lblNewLabel_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 20));

		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        DateFormatter dateFormatter = new DateFormatter(dateFormat);
		JFormattedTextField txtNgaysinh = new JFormattedTextField(dateFormatter);
		txtNgaysinh.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		txtNgaysinh.setBackground(Color.LIGHT_GRAY);
		txtNgaysinh.setValue(new Date());
		txtNgaysinh.setToolTipText("Nhập theo định dạng dd/MM/yyyy");

		JButton btnNewButton = new JButton("Hiển thị");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String hoTen = txtQuchVitHong.getText();
				String Masv = textField.getText();
				String Ngaysinh = txtNgaysinh.getText();
				StringBuilder output = new StringBuilder();
				boolean hasError = false;
				if (!hoTen.matches("[a-zA-Z\\p{L}\\s]+")) {
					output.append("Lỗi: Họ tên không hợp lệ! Chỉ được nhập chữ.\n");
					hasError = true;
				}

				if (!Masv.matches("\\d+")) {
					output.append("Lỗi: Mã sinh viên không hợp lệ! Chỉ được nhập số.\n");
					hasError = true;
				}

				if (!hasError) {
					output.append("Thông tin sinh viên:\n");
					output.append("Họ tên: ").append(hoTen).append("\n");
					output.append("Mã sinh viên: ").append(Masv).append("\n");
					output.append("Ngày sinh: ").append(Ngaysinh).append("\n");
				}

				textArea.setForeground(hasError ? Color.RED : Color.BLACK);
				textArea.setText(output.toString());
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 20));

		lblThngTinSinh = new JLabel("Thông tin sinh viên");
		lblThngTinSinh.setFont(new Font("Times New Roman", Font.PLAIN, 20));

		textArea = new JTextArea();
		textArea.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		textArea.setBackground(Color.ORANGE);
		JScrollPane scrollPane = new JScrollPane(textArea);
		scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);  // Luôn hiển thị thanh cuộn dọc
		scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS); // Luôn hiển thị thanh cuộn ngang

		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap(138, Short.MAX_VALUE)
					.addComponent(lblThngTinSinh, GroupLayout.PREFERRED_SIZE, 174, GroupLayout.PREFERRED_SIZE)
					.addGap(118))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(167)
					.addComponent(btnNewButton)
					.addContainerGap(166, Short.MAX_VALUE))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(10)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(lblNewLabel_1_1)
							.addGap(18)
							.addComponent(txtNgaysinh, 259, 259, 259))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 82, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblMSv))
							.addGap(18)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(textField, GroupLayout.PREFERRED_SIZE, 263, GroupLayout.PREFERRED_SIZE)
								.addComponent(txtQuchVitHong, GroupLayout.PREFERRED_SIZE, 263, GroupLayout.PREFERRED_SIZE))))
					.addContainerGap(57, Short.MAX_VALUE))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap(20, Short.MAX_VALUE)
					.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 384, GroupLayout.PREFERRED_SIZE)
					.addGap(26))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(12)
					.addComponent(lblThngTinSinh)
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel)
						.addComponent(txtQuchVitHong, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE))
					.addGap(23)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addComponent(lblMSv)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addComponent(lblNewLabel_1_1)
						.addComponent(txtNgaysinh, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addComponent(btnNewButton)
					.addGap(73)
					.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, 121, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(43, Short.MAX_VALUE))
		);
		contentPane.setLayout(gl_contentPane);
	}
}
