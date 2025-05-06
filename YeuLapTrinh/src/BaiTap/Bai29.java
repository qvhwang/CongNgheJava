package BaiTap;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.CardLayout;
import javax.swing.JLabel;
import javax.swing.JButton;

public class Bai29 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	 private CardLayout cardLayout;
	    private JPanel cardPanel;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Bai29 frame = new Bai29();
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
	public Bai29() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new CardLayout(0, 0));
		JPanel panel = new JPanel();
		
		contentPane.add(panel, "name_296476476816200");
		
		JLabel lblNewLabel = new JLabel("New label");
		panel.add(lblNewLabel);
        
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1, "name_296478192929300");
		
		JButton btnNewButton = new JButton("New button");
		panel_1.add(btnNewButton);
		
		JButton btnSwitch = new JButton("Switch");
		contentPane.add(btnSwitch, "name_296590860265800");
		
	}

}
