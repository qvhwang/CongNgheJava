package BaiTap;

import java.awt.EventQueue;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Bai60 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JButton btnDownload;
	private JButton btnCancel;
	private JButton btnStop;
	private JLabel lblStatus;
	private JProgressBar progressBar;
	private SwingWorker<Void, Integer> worker;
	private boolean isStopped = false; // Biến kiểm soát stop
	private int currentProgress = 0;   // Lưu tiến độ hiện tại

	public static void main(String[] args) {
		EventQueue.invokeLater(() -> {
			try {
				Bai60 frame = new Bai60();
				frame.setLocationRelativeTo(null);
				frame.setVisible(true);
			} catch (Exception e) {
				e.printStackTrace();
			}
		});
	}

	public Bai60() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 400, 250);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		progressBar = new JProgressBar();
		progressBar.setStringPainted(true); // Hiển thị %

		btnDownload = new JButton("Download");
		btnCancel = new JButton("Cancel");
		btnStop = new JButton("Stop");
		lblStatus = new JLabel("Status");
		lblStatus.setHorizontalAlignment(SwingConstants.CENTER);

		btnDownload.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				startDownload();
			}
		});

		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cancelDownload();
			}
		});

		btnStop.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				stopDownload();
			}
		});

		btnCancel.setEnabled(false);
		btnStop.setEnabled(false);

		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(GroupLayout.Alignment.CENTER)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(50)
					.addGroup(gl_contentPane.createParallelGroup(GroupLayout.Alignment.CENTER)
						.addComponent(progressBar, GroupLayout.PREFERRED_SIZE, 300, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(btnDownload, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE)
							.addGap(10)
							.addComponent(btnStop, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE)
							.addGap(10)
							.addComponent(btnCancel, GroupLayout.PREFERRED_SIZE, 90, GroupLayout.PREFERRED_SIZE))
						.addComponent(lblStatus, GroupLayout.PREFERRED_SIZE, 300, GroupLayout.PREFERRED_SIZE))
					.addGap(50))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createSequentialGroup()
				.addGap(20)
				.addComponent(progressBar, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
				.addGap(18)
				.addGroup(gl_contentPane.createParallelGroup(GroupLayout.Alignment.BASELINE)
					.addComponent(btnDownload, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
					.addComponent(btnStop, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
					.addComponent(btnCancel, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
				.addGap(18)
				.addComponent(lblStatus, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
				.addGap(54)
		);
		contentPane.setLayout(gl_contentPane);
	}

	private void startDownload() {
		btnDownload.setEnabled(false);
		btnCancel.setEnabled(true);
		btnStop.setEnabled(true);

		lblStatus.setText("Downloading...");

		worker = new SwingWorker<Void, Integer>() {
			@Override
			protected Void doInBackground() throws Exception {
				for (int i = currentProgress; i <= 100; i++) {
					if (isCancelled()) {
						break;
					}
					if (isStopped) {
						currentProgress = i; // Lưu lại vị trí khi Stop
						break;
					}
					Thread.sleep(50);
					publish(i);
				}
				return null;
			}

			@Override
			protected void process(java.util.List<Integer> chunks) {
				int value = chunks.get(chunks.size() - 1);
				progressBar.setValue(value);
				lblStatus.setText(value + "%");
			}

			@Override
			protected void done() {
				if (isCancelled()) {
					lblStatus.setText("Download Cancelled");
					currentProgress = 0; // Reset tiến độ
					progressBar.setValue(0);
					btnStop.setEnabled(false);
				} else if (!isStopped) {
					lblStatus.setText("Download Complete");
					currentProgress = 0;
					progressBar.setValue(100);
					btnStop.setEnabled(false);
				} else {
					lblStatus.setText("Download Stopped at " + currentProgress + "%");
				}
				btnDownload.setEnabled(true);
				btnCancel.setEnabled(false);
			}
		};

		isStopped = false;
		worker.execute();
	}

	private void stopDownload() {
		if (worker != null && !worker.isDone()) {
			isStopped = true;
		}
	}

	private void cancelDownload() {
		if (worker != null && !worker.isDone()) {
			worker.cancel(true);
		}
	}
}
