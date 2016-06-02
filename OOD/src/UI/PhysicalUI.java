package UI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;

import ResourceManagment.PhysicalResource;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PhysicalUI {

	private JFrame frame;
	private JTextField textFieldpropertyNo;
	private JTextField textFieldtype;
	private JTextField textFieldnameModel;
	public PhysicalResource physicalResource;

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
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 434, 262);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel label = new JLabel("\u0627\u0637\u0644\u0627\u0639\u0627\u062A \u0645\u0646\u0628\u0639 \u0641\u06CC\u0632\u06CC\u06A9\u06CC:");
		label.setBounds(169, 23, 108, 14);
		panel.add(label);
		
		JLabel propertyNo = new JLabel("\u0634\u0645\u0627\u0631\u0647 \u06CC \u0627\u0645\u0648\u0627\u0644:");
		propertyNo.setBounds(285, 60, 83, 14);
		panel.add(propertyNo);
		
		JLabel type = new JLabel("\u0646\u0648\u0639:");
		type.setBounds(285, 106, 46, 14);
		panel.add(type);
		
		JLabel nameModel = new JLabel("\u0627\u0633\u0645/\u0645\u062F\u0644:");
		nameModel.setBounds(285, 164, 70, 14);
		panel.add(nameModel);
		
		textFieldpropertyNo = new JTextField();
		textFieldpropertyNo.setBounds(134, 57, 86, 20);
		panel.add(textFieldpropertyNo);
		textFieldpropertyNo.setColumns(10);
		
		textFieldtype = new JTextField();
		textFieldtype.setBounds(134, 103, 86, 20);
		panel.add(textFieldtype);
		textFieldtype.setColumns(10);
		
		textFieldnameModel = new JTextField();
		textFieldnameModel.setBounds(134, 161, 86, 20);
		panel.add(textFieldnameModel);
		textFieldnameModel.setColumns(10);
		
		JButton createPhysResBut = new JButton("\u062B\u0628\u062A \u0645\u0646\u0628\u0639");
		createPhysResBut.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				create(textFieldpropertyNo,textFieldtype,textFieldnameModel);
			}

			
		});
		createPhysResBut.setBounds(36, 214, 89, 23);
		panel.add(createPhysResBut);
	}
	public void create(JTextField textFieldpropertyNo, JTextField textFieldtype,
			JTextField textFieldnameModel) {
		// TODO Auto-generated method stub
		this.physicalResource = new PhysicalResource(Integer.parseInt(textFieldpropertyNo.getText()),textFieldtype.toString(),textFieldnameModel.toString());
	}

}
