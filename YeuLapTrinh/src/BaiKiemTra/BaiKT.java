package BaiKiemTra;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Color;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.DateFormatter;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class BaiKT extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtHoTen;
	private JTextField txtQueQuan;
	private JFormattedTextField txtNgaySinh;
	private JTable table;
	private DefaultTableModel tableModel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BaiKT frame = new BaiKT();
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
	public BaiKT() {
		setTitle("Nhập thông tin sinh viên");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 550, 400);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(200, 255, 255));
		contentPane.setBorder(new EmptyBorder(10, 10, 10, 10));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblHoTen = new JLabel("Họ tên:");
		lblHoTen.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblHoTen.setBounds(30, 30, 80, 30);
		contentPane.add(lblHoTen);

		txtHoTen = new JTextField();
		txtHoTen.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		txtHoTen.setBounds(120, 30, 370, 30);
		contentPane.add(txtHoTen);

		JLabel lblNgaySinh = new JLabel("Ngày sinh:");
		lblNgaySinh.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblNgaySinh.setBounds(30, 80, 90, 30);
		contentPane.add(lblNgaySinh);

		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		DateFormatter dateFormatter = new DateFormatter(dateFormat);
		txtNgaySinh = new JFormattedTextField(dateFormatter);
		txtNgaySinh.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		txtNgaySinh.setBounds(120, 80, 370, 30);
		txtNgaySinh.setValue(new Date());
		txtNgaySinh.setToolTipText("Nhập theo định dạng dd/MM/yyyy");
		contentPane.add(txtNgaySinh);

		JLabel lblQueQuan = new JLabel("Quê quán:");
		lblQueQuan.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblQueQuan.setBounds(30, 130, 90, 30);
		contentPane.add(lblQueQuan);

		txtQueQuan = new JTextField();
		txtQueQuan.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		txtQueQuan.setBounds(120, 130, 370, 30);
		contentPane.add(txtQueQuan);

		JButton btnHienThi = new JButton("Hiển thị");
		btnHienThi.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		btnHienThi.setBounds(200, 180, 120, 35);
		contentPane.add(btnHienThi);

		tableModel = new DefaultTableModel(new Object[]{"Họ tên", "Ngày sinh", "Quê quán"}, 0);
		table = new JTable(tableModel);
		table.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		table.setRowHeight(24);

		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setBounds(30, 230, 460, 110);
		contentPane.add(scrollPane);

		btnHienThi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String hoTen = txtHoTen.getText().trim();
				String ngaySinh = txtNgaySinh.getText().trim();
				String queQuan = txtQueQuan.getText().trim();

				StringBuilder errors = new StringBuilder();

				if (!hoTen.matches("[a-zA-Z\\p{L}\\s]+")) {
					errors.append("Họ tên chỉ được chứa chữ và khoảng trắng.\n");
				}
				if (ngaySinh.isEmpty()) {
					errors.append("Ngày sinh không được để trống.\n");
				}
				if (queQuan.isEmpty()) {
					errors.append("Quê quán không được để trống.\n");
				}

				if (errors.length() > 0) {
					JOptionPane.showMessageDialog(null, errors.toString(), "Lỗi nhập liệu", JOptionPane.ERROR_MESSAGE);
				} else {
					tableModel.addRow(new Object[]{hoTen, ngaySinh, queQuan});
				}
			}
		});
	}
}
