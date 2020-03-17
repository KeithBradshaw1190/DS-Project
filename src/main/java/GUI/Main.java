package GUI;

import java.awt.CardLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JScrollPane;

import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JSeparator;
import javax.swing.JTable;
import javax.swing.ScrollPaneConstants;
import javax.swing.table.JTableHeader;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class Main {

	private JFrame frame;
	private JTable table;
	private JTable table_1;
	private JTable table_2;
	private JTable table_3;
	private JTextField device_name_text;
	private JTextField device_onOff_text;
	private JTextField device_extra_op_text;
	private JTextField device_extra_op2_text;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main window = new Main();
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
	public Main() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 468, 507);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		

		/*Heading Label*/
		JLabel headLabel = new JLabel("Smart Home Device Manager");
		headLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		headLabel.setBounds(101, 11, 245, 14);
		frame.getContentPane().add(headLabel);
		
		JButton toggleRegister = new JButton("Turn On Device Register");
		toggleRegister.setBounds(83, 50, 150, 23);
		frame.getContentPane().add(toggleRegister);
		
		JButton search = new JButton("Search For Devices");
		search.setBounds(243, 50, 125, 23);
		frame.getContentPane().add(search);
		
		JLabel deviceRegLabel = new JLabel("Step One");
		deviceRegLabel.setBounds(83, 36, 46, 14);
		frame.getContentPane().add(deviceRegLabel);
		
		JLabel searchLabel = new JLabel("Step Two");
		searchLabel.setBounds(245, 36, 46, 14);
		frame.getContentPane().add(searchLabel);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 84, 414, 14);
		frame.getContentPane().add(separator);
		
		JLabel devicesLabel = new JLabel("Device Information");
		devicesLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		devicesLabel.setBounds(162, 95, 166, 14);
		frame.getContentPane().add(devicesLabel);
		
		JLabel TVLabel = new JLabel("TV");
		TVLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		TVLabel.setBounds(10, 120, 46, 14);
		frame.getContentPane().add(TVLabel);
		
		JLabel lampLabel = new JLabel("Lamp");
		lampLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		lampLabel.setBounds(242, 125, 46, 14);
		frame.getContentPane().add(lampLabel);
		
		JLabel speakerLabel = new JLabel("Speaker");
		speakerLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		speakerLabel.setBounds(10, 205, 66, 14);
		frame.getContentPane().add(speakerLabel);
		
		JLabel chromecastLabel = new JLabel("Chromecast");
		
		chromecastLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		chromecastLabel.setBounds(242, 205, 86, 14);
		frame.getContentPane().add(chromecastLabel);
		
		JLabel lblNewLabel = new JLabel("Device Name");
		lblNewLabel.setBounds(10, 150, 66, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblCurrentChannel = new JLabel("Current Channel");
		lblCurrentChannel.setBounds(10, 165, 86, 14);
		frame.getContentPane().add(lblCurrentChannel);
		
		JLabel lblVolume = new JLabel("Volume");
		lblVolume.setBounds(10, 180, 66, 14);
		frame.getContentPane().add(lblVolume);
		
		JLabel lblOnoff = new JLabel("On/Off");
		lblOnoff.setBounds(10, 135, 46, 14);
		frame.getContentPane().add(lblOnoff);
		
		JLabel lblBrightness = new JLabel("Brightness");
		lblBrightness.setBounds(242, 174, 86, 14);
		frame.getContentPane().add(lblBrightness);
		
		JLabel label_2 = new JLabel("Device Name");
		label_2.setBounds(242, 159, 66, 14);
		frame.getContentPane().add(label_2);
		
		JLabel label_3 = new JLabel("On/Off");
		label_3.setBounds(242, 144, 46, 14);
		frame.getContentPane().add(label_3);
		
		JLabel label = new JLabel("Volume");
		label.setBounds(10, 275, 66, 14);
		frame.getContentPane().add(label);
		
		JLabel lblMute = new JLabel("Mute");
		lblMute.setBounds(10, 260, 86, 14);
		frame.getContentPane().add(lblMute);
		
		JLabel label_4 = new JLabel("Device Name");
		label_4.setBounds(10, 245, 66, 14);
		frame.getContentPane().add(label_4);
		
		JLabel label_5 = new JLabel("On/Off");
		label_5.setBounds(10, 226, 46, 14);
		frame.getContentPane().add(label_5);
		
		JLabel label_1 = new JLabel("On/Off");
		label_1.setBounds(243, 226, 46, 14);
		frame.getContentPane().add(label_1);
		
		JLabel label_6 = new JLabel("Device Name");
		label_6.setBounds(243, 241, 66, 14);
		frame.getContentPane().add(label_6);
		
		JLabel label_7 = new JLabel("Current Channel");
		label_7.setBounds(243, 256, 86, 14);
		frame.getContentPane().add(label_7);
		
		JLabel label_8 = new JLabel("Volume");
		label_8.setBounds(243, 271, 66, 14);
		frame.getContentPane().add(label_8);
		
		String[] deviceNames = { "Select Device","TV", "Lamp", "Speaker", "Chromecast"};
		JComboBox comboBox = new JComboBox(deviceNames);
		//Text1
		device_name_text = new JTextField();
		device_name_text.setBounds(10, 392, 86, 20);
		frame.getContentPane().add(device_name_text);
		device_name_text.setColumns(10);
		device_name_text.setText("TV");
		
        //Text2

		device_onOff_text = new JTextField();
		device_onOff_text.setColumns(10);
		device_onOff_text.setBounds(124, 392, 86, 20);
		frame.getContentPane().add(device_onOff_text);
		device_onOff_text.setText("On");
		
        //Text3
		device_extra_op_text = new JTextField();
		device_extra_op_text.setColumns(10);
		device_extra_op_text.setBounds(243, 392, 86, 20);
		frame.getContentPane().add(device_extra_op_text);
		device_extra_op_text.setText("Extra 1");
		
        //Text4
		device_extra_op2_text = new JTextField();
		device_extra_op2_text.setColumns(10);
		device_extra_op2_text.setBounds(356, 392, 86, 20);
		frame.getContentPane().add(device_extra_op2_text);
		device_extra_op2_text.setText("Extra 2");
		
		
	
	
		comboBox.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent event) {
				  JComboBox combo = (JComboBox) event.getSource();
			        String selectedDevice = (String) combo.getSelectedItem();
			 
			        if (selectedDevice.equals("TV")) {
			          //Text1
			    		device_name_text = new JTextField();
			    		device_name_text.setBounds(10, 392, 86, 20);
			    		frame.getContentPane().add(device_name_text);
			    		device_name_text.setColumns(10);
			    		device_name_text.setText("TV");
			    		
				        //Text2

			    		device_onOff_text = new JTextField();
			    		device_onOff_text.setColumns(10);
			    		device_onOff_text.setBounds(124, 392, 86, 20);
			    		frame.getContentPane().add(device_onOff_text);
			    		device_onOff_text.setText("On");
			    		
				        //Text3
			    		device_extra_op_text = new JTextField();
			    		device_extra_op_text.setColumns(10);
			    		device_extra_op_text.setBounds(243, 392, 86, 20);
			    		frame.getContentPane().add(device_extra_op_text);
			    		device_extra_op_text.setText("Extra 1");
			    		
				        //Text4
			    		device_extra_op2_text = new JTextField();
			    		device_extra_op2_text.setColumns(10);
			    		device_extra_op2_text.setBounds(356, 392, 86, 20);
			    		frame.getContentPane().add(device_extra_op2_text);
			    		device_extra_op2_text.setText("Extra 2");

			            
			            
			        } else if (selectedDevice.equals("Lamp")) {
				          //Text1
					    		device_name_text = new JTextField();
					    		device_name_text.setBounds(10, 392, 86, 20);
					    		frame.getContentPane().add(device_name_text);
					    		device_name_text.setColumns(10);
					    		device_name_text.setText("Lamp");
					    		
						        //Text2

					    		device_onOff_text = new JTextField();
					    		device_onOff_text.setColumns(10);
					    		device_onOff_text.setBounds(124, 392, 86, 20);
					    		frame.getContentPane().add(device_onOff_text);
					    		device_onOff_text.setText("On");
					    		
						        //Text3
					    		device_extra_op_text = new JTextField();
					    		device_extra_op_text.setColumns(10);
					    		device_extra_op_text.setBounds(243, 392, 86, 20);
					    		frame.getContentPane().add(device_extra_op_text);
					    		device_extra_op_text.setText("Extra 1");
					    		
						        //Text4
					    		device_extra_op2_text = new JTextField();
					    		device_extra_op2_text.setColumns(10);
					    		device_extra_op2_text.setBounds(356, 392, 86, 20);
					    		frame.getContentPane().add(device_extra_op2_text);
					    		device_extra_op2_text.setText("Extra 2");
					    	}else if (selectedDevice.equals("Speaker")) {
					    		//Text1
					    		device_name_text = new JTextField();
					    		device_name_text.setBounds(10, 392, 86, 20);
					    		frame.getContentPane().add(device_name_text);
					    		device_name_text.setColumns(10);
					    		device_name_text.setText("Speaker");
					    		
						        //Text2

					    		device_onOff_text = new JTextField();
					    		device_onOff_text.setColumns(10);
					    		device_onOff_text.setBounds(124, 392, 86, 20);
					    		frame.getContentPane().add(device_onOff_text);
					    		device_onOff_text.setText("On");
					    		
						        //Text3
					    		device_extra_op_text = new JTextField();
					    		device_extra_op_text.setColumns(10);
					    		device_extra_op_text.setBounds(243, 392, 86, 20);
					    		frame.getContentPane().add(device_extra_op_text);
					    		device_extra_op_text.setText("Extra 1");
					    		
						        //Text4
					    		device_extra_op2_text = new JTextField();
					    		device_extra_op2_text.setColumns(10);
					    		device_extra_op2_text.setBounds(356, 392, 86, 20);
					    		frame.getContentPane().add(device_extra_op2_text);
					    		device_extra_op2_text.setText("Extra 2");
			        }else if (selectedDevice.equals("Chromecast")) {
			        	//Text1
			    		device_name_text = new JTextField();
			    		device_name_text.setBounds(10, 392, 86, 20);
			    		frame.getContentPane().add(device_name_text);
			    		device_name_text.setColumns(10);
			    		device_name_text.setText("Chromecast");
			    		
				        //Text2

			    		device_onOff_text = new JTextField();
			    		device_onOff_text.setColumns(10);
			    		device_onOff_text.setBounds(124, 392, 86, 20);
			    		frame.getContentPane().add(device_onOff_text);
			    		device_onOff_text.setText("On");
			    		
				        //Text3
			    		device_extra_op_text = new JTextField();
			    		device_extra_op_text.setColumns(10);
			    		device_extra_op_text.setBounds(243, 392, 86, 20);
			    		frame.getContentPane().add(device_extra_op_text);
			    		device_extra_op_text.setText("Extra 1");
			    		
				        //Text4
			    		device_extra_op2_text = new JTextField();
			    		device_extra_op2_text.setColumns(10);
			    		device_extra_op2_text.setBounds(356, 392, 86, 20);
			    		frame.getContentPane().add(device_extra_op2_text);
			    		device_extra_op2_text.setText("Extra 2");
			        }
			    }
				
			});
				
		
		comboBox.setBounds(59, 348, 99, 20);
		frame.getContentPane().add(comboBox);
		
		JLabel lblDeviceController = new JLabel("Device Controller");
		lblDeviceController.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblDeviceController.setBounds(10, 323, 166, 14);
		frame.getContentPane().add(lblDeviceController);
		
		JLabel label_9 = new JLabel("Device");
		label_9.setBounds(10, 352, 66, 14);
		frame.getContentPane().add(label_9);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(172, 434, 125, 23);
		frame.getContentPane().add(btnNewButton);
		
		JLabel device_name_label = new JLabel("Device Name");
		device_name_label.setFont(new Font("Tahoma", Font.BOLD, 11));
		device_name_label.setBounds(10, 379, 86, 14);
		frame.getContentPane().add(device_name_label);
		
		JLabel device_onOff_label = new JLabel("Device Status");
		device_onOff_label.setFont(new Font("Tahoma", Font.BOLD, 11));
		device_onOff_label.setBounds(124, 379, 86, 14);
		frame.getContentPane().add(device_onOff_label);
		
		JLabel device_extra_op_label = new JLabel("Channel");
		device_extra_op_label.setFont(new Font("Tahoma", Font.BOLD, 11));
		device_extra_op_label.setBounds(243, 379, 86, 14);
		frame.getContentPane().add(device_extra_op_label);
		
		JLabel device_extra_op2_label = new JLabel("Volume");
		device_extra_op2_label.setFont(new Font("Tahoma", Font.BOLD, 11));
		device_extra_op2_label.setBounds(356, 379, 86, 14);
		frame.getContentPane().add(device_extra_op2_label);
		

	

	
	

	}
}
