package BaiTap;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.ButtonGroup;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.JRadioButton;
import javax.swing.JToggleButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Bai49 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
    private Color defaultColor; // màu mặc định ban đầu

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Bai49 frame = new Bai49();
					frame.setLocationRelativeTo(frame);
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
	public Bai49() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 300, 200);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		

		JLabel lblNewLabel = new JLabel("Sample");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		defaultColor = lblNewLabel.getForeground();
		
		JRadioButton rdbtnRed = new JRadioButton("Red");
		rdbtnRed.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				lblNewLabel.setForeground(Color.RED);
			}
		});
		rdbtnRed.setHorizontalAlignment(SwingConstants.CENTER);
		
		JRadioButton rdbtnBlue = new JRadioButton("Blue");
		rdbtnBlue.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				lblNewLabel.setForeground(Color.BLUE);
			
			}
		});
		rdbtnBlue.setHorizontalAlignment(SwingConstants.CENTER);
		
		JRadioButton rdbtnGreen = new JRadioButton("Green");
		rdbtnGreen.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				lblNewLabel.setForeground(Color.GREEN);
			}
		});
		rdbtnGreen.setHorizontalAlignment(SwingConstants.CENTER);
		ButtonGroup group = new ButtonGroup();
		group.add(rdbtnRed);
		group.add(rdbtnBlue);
		group.add(rdbtnGreen);
		
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(113)
							.addComponent(lblNewLabel))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(84)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
								.addComponent(rdbtnBlue, GroupLayout.PREFERRED_SIZE, 103, GroupLayout.PREFERRED_SIZE)
								.addComponent(rdbtnRed, GroupLayout.PREFERRED_SIZE, 103, GroupLayout.PREFERRED_SIZE)
								.addComponent(rdbtnGreen, GroupLayout.PREFERRED_SIZE, 103, GroupLayout.PREFERRED_SIZE))))
					.addContainerGap(89, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(rdbtnRed)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(rdbtnBlue)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(rdbtnGreen)
					.addContainerGap(79, Short.MAX_VALUE))
		);
		contentPane.setLayout(gl_contentPane);
	}
}
