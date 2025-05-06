package BaiTap;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JDialog;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;

public class Bai9 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Bai9 frame = new Bai9();
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
	public Bai9() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		JButton btnDialog = new JButton("Open JDialog");
		btnDialog.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JDialog dialog = new JDialog(Bai9.this, "Dialog", true);
				dialog.setSize(200, 150);
				dialog.getContentPane().setLayout(new BorderLayout());
				dialog.setLocationRelativeTo(Bai9.this);
				
				JLabel label = new JLabel("This is a dialog", SwingConstants.CENTER);
                dialog.getContentPane().add(label, BorderLayout.CENTER);
                dialog.setVisible(true);

			}
		});
		btnDialog.setFont(new Font("Times New Roman", Font.BOLD, 20));
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addComponent(btnDialog, GroupLayout.PREFERRED_SIZE, 476, GroupLayout.PREFERRED_SIZE)
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addComponent(btnDialog, GroupLayout.PREFERRED_SIZE, 353, GroupLayout.PREFERRED_SIZE)
		);
		contentPane.setLayout(gl_contentPane);
	}

}
