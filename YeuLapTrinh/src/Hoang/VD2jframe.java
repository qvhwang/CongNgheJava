package Hoang;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.ImageIcon;

public class VD2jframe extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JButton btnNewButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VD2jframe frame = new VD2jframe();
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
	public VD2jframe() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Thoát cửa sổ");
		setBounds(100, 100, 300, 200);
		contentPane = new JPanel();
		contentPane.setBackground(Color.CYAN);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		btnNewButton = new JButton("Exit");
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\admin\\Pictures\\check.png"));
		btnNewButton.setForeground(Color.BLUE);
		btnNewButton.setBackground(Color.YELLOW);
		btnNewButton.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        int confirm = JOptionPane.showConfirmDialog(
		        		null,
		            "Bạn có chắc chắn muốn thoát không?",
		            "Xác nhận thoát",
		            JOptionPane.YES_NO_CANCEL_OPTION,
		            JOptionPane.QUESTION_MESSAGE
		        );

		        if (confirm == JOptionPane.YES_OPTION) {
		            System.exit(0);
		        }
		    }
		});
		

		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(98)
					.addComponent(btnNewButton)
					.addContainerGap(129, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(62)
					.addComponent(btnNewButton)
					.addContainerGap(70, Short.MAX_VALUE))
		);
		contentPane.setLayout(gl_contentPane);
	}
}
