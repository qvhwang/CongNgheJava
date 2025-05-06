package BaiTap;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

public class Bai47 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JLabel lblNewLabel; // Phải khai báo biến lblNewLabel toàn cục

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Bai47 frame = new Bai47();
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
	public Bai47() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 200);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));

		textField = new JTextField();
		textField.setToolTipText("Chỉ được nhập số");
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setFont(new Font("Times New Roman", Font.BOLD, 15));
		textField.setColumns(10);

		lblNewLabel = new JLabel("Number"); // Khởi tạo lblNewLabel
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);

		contentPane.add(textField, BorderLayout.SOUTH);
		contentPane.add(lblNewLabel, BorderLayout.CENTER);

		textField.getDocument().addDocumentListener(new DocumentListener() {
			public void insertUpdate(DocumentEvent e) {
				validateInput();
			}

			public void removeUpdate(DocumentEvent e) {
				validateInput();
			}

			public void changedUpdate(DocumentEvent e) {
				validateInput();
			}
		});
	}

	private void validateInput() {
		String text = textField.getText();
		if (text.matches("\\d*")) { // chỉ cho phép nhập số
			lblNewLabel.setText(text);
		} else {
			SwingUtilities.invokeLater(() -> {
				textField.setText(text.replaceAll("[^\\d]", ""));
			});
		}
	}
}
