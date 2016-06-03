package UI;

import java.awt.EventQueue;

import javax.swing.JFrame;

public class PhysicalUI {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public void showPhysicalUI() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PhysicalUI window = new PhysicalUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public PhysicalUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
