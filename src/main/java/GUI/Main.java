package GUI;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

import org.DS.keithproject.SmartHomeGRPC.valRequest;
import org.DS.keithproject.SmartHomeGRPC.valResponse;

import GRPC.TVServer;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import org.DS.keithproject.SmartHomeGRPC.*;
import org.DS.keithproject.SmartHomeGRPC.LampServiceGrpc.LampServiceFutureStub;

import io.grpc.stub.StreamObserver;
import javax.swing.DefaultComboBoxModel;

public class Main {

	private JFrame frame;
	private JTextField device_name_text;
	private JTextField device_onOff_text;
	private JTextField device_extra_op_text;
	private JTextField device_extra_op2_text;
	
//	private JTextField lamp_name_text;
//	private JTextField lamp_onOff_text;
//	private JTextField lamp_extra_op_text;
//	private JTextField lamp_extra_op2_text;
//	
//	private JTextField speaker_name_text;
//	private JTextField speaker_onOff_text;
//	private JTextField speaker_extra_op_text;
//	private JTextField speaker_extra_op2_text;
//	
//	private JTextField cc_name_text;
//	private JTextField cc_onOff_text;
//	private JTextField cc_extra_op_text;
//	private JTextField cc_extra_op2_text;
//	
	//All Stubs and channels
	private static TvServiceGrpc.TvServiceBlockingStub tv_blockingStub;
	private static TvServiceGrpc.TvServiceStub tv_asyncStub;
	private static TvServiceGrpc.TvServiceFutureStub tv_futureStub;
	
	private static LampServiceGrpc.LampServiceBlockingStub lamp_blockingStub;
	private static LampServiceGrpc.LampServiceStub lamp_asyncStub;
	private static LampServiceGrpc.LampServiceFutureStub lamp_futureStub;
	
	private static SpeakerServiceGrpc.SpeakerServiceBlockingStub speaker_blockingStub;
	private static SpeakerServiceGrpc.SpeakerServiceStub speaker_asyncStub;
	private static SpeakerServiceGrpc.SpeakerServiceFutureStub speaker_futureStub;
	private JTextField tvName_tf;
	private JTextField tvStatus_tf;
	private JTextField tvChannel_tf;
	private JTextField speakerMute_tf;
	private JTextField ccApp_tf;
	private JTextField speakerName_tf;
	private JTextField ccName_tf;
	private JTextField lampName_tf;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	

	
	
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
		channels();
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	public void channels() {
		ManagedChannel tvChannel = ManagedChannelBuilder.forAddress("localhost", 50055).usePlaintext().build();
		ManagedChannel lampChannel = ManagedChannelBuilder.forAddress("localhost", 50052).usePlaintext().build();
		ManagedChannel speakerChannel = ManagedChannelBuilder.forAddress("localhost", 50053).usePlaintext().build();
		tv_blockingStub = TvServiceGrpc.newBlockingStub(tvChannel);
		tv_asyncStub = TvServiceGrpc.newStub(tvChannel);
		tv_futureStub = TvServiceGrpc.newFutureStub(tvChannel);
		
		speaker_blockingStub = SpeakerServiceGrpc.newBlockingStub(speakerChannel);
		speaker_asyncStub = SpeakerServiceGrpc.newStub(speakerChannel);
		speaker_futureStub = SpeakerServiceGrpc.newFutureStub(speakerChannel);
	}

	
	

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
		
		JLabel controller_lbl = new JLabel("Device Controller");
		controller_lbl.setFont(new Font("Tahoma", Font.BOLD, 15));
		controller_lbl.setBounds(10, 64, 143, 14);
		frame.getContentPane().add(controller_lbl);
		
		JLabel device_name_lbl = new JLabel("Device Name");
		device_name_lbl.setBounds(70, 90, 83, 14);
		frame.getContentPane().add(device_name_lbl);
		
		JLabel device_status_lbl = new JLabel("Device Status");
		device_status_lbl.setBounds(170, 90, 83, 14);
		frame.getContentPane().add(device_status_lbl);
		
		JLabel volume_lbl = new JLabel("Volume");
		volume_lbl.setBounds(270, 90, 45, 14);
		frame.getContentPane().add(volume_lbl);
		
		JLabel lblChannel = new JLabel("Channel");
		lblChannel.setBounds(370, 90, 83, 14);
		frame.getContentPane().add(lblChannel);
		
		JLabel device_name2_lblabel = new JLabel("Device Name");
		device_name2_lblabel.setBounds(70, 135, 83, 14);
		frame.getContentPane().add(device_name2_lblabel);
		
		JLabel device_status2_lbl = new JLabel("Device Status");
		device_status2_lbl.setBounds(170, 135, 83, 14);
		frame.getContentPane().add(device_status2_lbl);
		
		JLabel volume2_lbl = new JLabel("Volume");
		volume2_lbl.setBounds(270, 135, 45, 14);
		frame.getContentPane().add(volume2_lbl);
		
		JLabel lblMute = new JLabel("Mute");
		lblMute.setBounds(370, 135, 45, 14);
		frame.getContentPane().add(lblMute);
		
		JLabel device_name3_lbl = new JLabel("Device Name");
		device_name3_lbl.setBounds(70, 180, 83, 14);
		frame.getContentPane().add(device_name3_lbl);
		
		JLabel volume_3_lbl = new JLabel("Volume");
		volume_3_lbl.setBounds(270, 180, 45, 14);
		frame.getContentPane().add(volume_3_lbl);
		
		JLabel lblApplication = new JLabel("Application");
		lblApplication.setBounds(365, 180, 83, 14);
		frame.getContentPane().add(lblApplication);
		
		JLabel device_status3_lbl = new JLabel("Device Status");
		device_status3_lbl.setBounds(170, 180, 83, 14);
		frame.getContentPane().add(device_status3_lbl);
		
		JLabel device_name4_lbl = new JLabel("Device Name");
		device_name4_lbl.setBounds(70, 225, 83, 14);
		frame.getContentPane().add(device_name4_lbl);
		
		JLabel device_status4_lbl = new JLabel("Device Status");
		device_status4_lbl.setBounds(170, 225, 83, 14);
		frame.getContentPane().add(device_status4_lbl);
		
		JLabel lblBrigtness = new JLabel("Brightness");
		lblBrigtness.setBounds(270, 225, 56, 14);
		frame.getContentPane().add(lblBrigtness);
		
		JButton tv_volumeUp_btn = new JButton("+");
		tv_volumeUp_btn.setFont(new Font("Tahoma", Font.BOLD, 5));
		tv_volumeUp_btn.setBounds(290, 104, 36, 20);
		frame.getContentPane().add(tv_volumeUp_btn);
		
		JButton tv_volumeDown_btn = new JButton("-");
		tv_volumeDown_btn.setFont(new Font("Tahoma", Font.BOLD, 5));
		tv_volumeDown_btn.setBounds(254, 104, 36, 20);
		frame.getContentPane().add(tv_volumeDown_btn);
		
		JButton speaker_volumeDown_btn = new JButton("-");
		speaker_volumeDown_btn.setFont(new Font("Tahoma", Font.BOLD, 5));
		speaker_volumeDown_btn.setBounds(254, 149, 36, 20);
		frame.getContentPane().add(speaker_volumeDown_btn);
		
		JButton speaker_volumeUp_btn = new JButton("+");
		speaker_volumeUp_btn.setFont(new Font("Tahoma", Font.BOLD, 5));
		speaker_volumeUp_btn.setBounds(290, 149, 36, 20);
		frame.getContentPane().add(speaker_volumeUp_btn);
		
		JButton cc_volumeUp_btn = new JButton("+");
		cc_volumeUp_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		cc_volumeUp_btn.setFont(new Font("Tahoma", Font.BOLD, 5));
		cc_volumeUp_btn.setBounds(290, 194, 36, 20);
		frame.getContentPane().add(cc_volumeUp_btn);
		
		JButton cc_volumeDown_btn = new JButton("-");
		cc_volumeDown_btn.setFont(new Font("Tahoma", Font.BOLD, 5));
		cc_volumeDown_btn.setBounds(254, 194, 36, 20);
		frame.getContentPane().add(cc_volumeDown_btn);
		/////////////
		//Text Fields
		/////////////
		tvName_tf = new JTextField();
		tvName_tf.setBounds(56, 105, 86, 20);
		frame.getContentPane().add(tvName_tf);
		tvName_tf.setColumns(10);
		tvName_tf.getDocument().addDocumentListener(new DocumentListener() {
			  public void changedUpdate(DocumentEvent e) {
					System.out.println("changedUpdate "+tvName_tf.getText());
				  }
				  public void removeUpdate(DocumentEvent e) {
					  changeDeviceName(tvName_tf.getText(),"TV");
				  }
				  public void insertUpdate(DocumentEvent e) {
					  System.out.println("insertUpdate "+tvName_tf.getText());
					  changeDeviceName(tvName_tf.getText(),"TV");

				  }

	
				});
		
		
		
		
		tvStatus_tf = new JTextField();
		tvStatus_tf.setColumns(10);
		tvStatus_tf.setBounds(160, 105, 86, 20);
		frame.getContentPane().add(tvStatus_tf);
		
		tvChannel_tf = new JTextField();
		tvChannel_tf.setColumns(10);
		tvChannel_tf.setBounds(345, 105, 86, 20);
		frame.getContentPane().add(tvChannel_tf);
		
		speakerMute_tf = new JTextField();
		speakerMute_tf.setColumns(10);
		speakerMute_tf.setBounds(345, 150, 86, 20);
		frame.getContentPane().add(speakerMute_tf);
		
		ccApp_tf = new JTextField();
		ccApp_tf.setColumns(10);
		ccApp_tf.setBounds(345, 195, 86, 20);
		frame.getContentPane().add(ccApp_tf);
		
		speakerName_tf = new JTextField();
		speakerName_tf.setColumns(10);
		speakerName_tf.setBounds(56, 150, 86, 20);
		frame.getContentPane().add(speakerName_tf);
		speakerName_tf.getDocument().addDocumentListener(new DocumentListener() {
			  public void changedUpdate(DocumentEvent e) {
					
				  }
				  public void removeUpdate(DocumentEvent e) {
					  changeDeviceName(speakerName_tf.getText(),"Speaker");
				  }
				  public void insertUpdate(DocumentEvent e) {
				
					  changeDeviceName(speakerName_tf.getText(),"Speaker");
				  }

	
				});
		
		
		
		
		ccName_tf = new JTextField();
		ccName_tf.setColumns(10);
		ccName_tf.setBounds(56, 194, 86, 20);
		frame.getContentPane().add(ccName_tf);
		ccName_tf.getDocument().addDocumentListener(new DocumentListener() {
			  public void changedUpdate(DocumentEvent e) {
					
				  }
				  public void removeUpdate(DocumentEvent e) {
					  changeDeviceName(ccName_tf.getText(),"Chromecast");
				  }
				  public void insertUpdate(DocumentEvent e) {
					  System.out.println("insertUpdate "+tvName_tf.getText());
					  changeDeviceName(ccName_tf.getText(),"Chromecast");
				  }

	
				});
		
		
		lampName_tf = new JTextField();
		lampName_tf.setColumns(10);
		lampName_tf.setBounds(56, 238, 86, 20);
		frame.getContentPane().add(lampName_tf);
		lampName_tf.getDocument().addDocumentListener(new DocumentListener() {
			  public void changedUpdate(DocumentEvent e) {
					
				  }
				  public void removeUpdate(DocumentEvent e) {
					  changeDeviceName(lampName_tf.getText(),"Lamp");
				  }
				  public void insertUpdate(DocumentEvent e) {
					  changeDeviceName(lampName_tf.getText(),"Lamp");
				  }

	
				});
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(158, 150, 86, 20);
		frame.getContentPane().add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(158, 194, 86, 20);
		frame.getContentPane().add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(160, 238, 86, 20);
		frame.getContentPane().add(textField_7);
		
		JButton lamp_volumeDown_btn = new JButton("-");
		lamp_volumeDown_btn.setFont(new Font("Tahoma", Font.BOLD, 5));
		lamp_volumeDown_btn.setBounds(254, 240, 36, 20);
		frame.getContentPane().add(lamp_volumeDown_btn);
		
		JButton lamp_volumeUp_btn = new JButton("+");
		lamp_volumeUp_btn.setFont(new Font("Tahoma", Font.BOLD, 5));
		lamp_volumeUp_btn.setBounds(290, 240, 36, 20);
		frame.getContentPane().add(lamp_volumeUp_btn);
		
		JLabel lblTv = new JLabel("TV");
		lblTv.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblTv.setBounds(1, 105, 36, 14);
		frame.getContentPane().add(lblTv);
		
		JLabel lblSpeaker = new JLabel("Speaker");
		lblSpeaker.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblSpeaker.setBounds(1, 155, 45, 14);
		frame.getContentPane().add(lblSpeaker);
		
		JLabel lblChromecast = new JLabel("ChromeC");
		lblChromecast.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblChromecast.setBounds(1, 200, 56, 14);
		frame.getContentPane().add(lblChromecast);
		
		JLabel lblLamp = new JLabel("Lamp");
		lblLamp.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblLamp.setBounds(1, 241, 45, 14);
		frame.getContentPane().add(lblLamp);
		
		JLabel label = new JLabel("TV");
		label.setFont(new Font("Tahoma", Font.BOLD, 10));
		label.setBounds(10, 313, 36, 14);
		frame.getContentPane().add(label);
		
		JLabel label_1 = new JLabel("Speaker");
		label_1.setFont(new Font("Tahoma", Font.BOLD, 10));
		label_1.setBounds(10, 357, 45, 14);
		frame.getContentPane().add(label_1);
		
		JLabel label_2 = new JLabel("ChromeC");
		label_2.setFont(new Font("Tahoma", Font.BOLD, 10));
		label_2.setBounds(10, 402, 56, 14);
		frame.getContentPane().add(label_2);
		
		JLabel label_3 = new JLabel("Lamp");
		label_3.setFont(new Font("Tahoma", Font.BOLD, 10));
		label_3.setBounds(10, 443, 45, 14);
		frame.getContentPane().add(label_3);
		
		JLabel lblDeviceStatus = new JLabel("Device Info");
		lblDeviceStatus.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblDeviceStatus.setBounds(10, 288, 143, 14);
		frame.getContentPane().add(lblDeviceStatus);
		
		JLabel tvInfo_Name = new JLabel("");
		tvInfo_Name.setBounds(48, 313, 83, 14);
		frame.getContentPane().add(tvInfo_Name);
		
		JLabel tvInfo_Status = new JLabel("");
		tvInfo_Status.setBounds(148, 313, 83, 14);
		frame.getContentPane().add(tvInfo_Status);
		
		JLabel tvInfo_NameVolume = new JLabel("");
		tvInfo_NameVolume.setBounds(248, 313, 45, 14);
		frame.getContentPane().add(tvInfo_NameVolume);
		
		JLabel tvInfo_Channel = new JLabel("");
		tvInfo_Channel.setBounds(348, 313, 83, 14);
		frame.getContentPane().add(tvInfo_Channel);

		
	}
	public static void changeDeviceName(String newName, String device) {
		
		System.out.println("New Name "+ newName);
		System.out.println("Device "+ device);

		StringRequest req = StringRequest.newBuilder().setText(newName).build();
		System.out.println("Changing device Name");


	//Handle device
		if(device.equals("TV")) {
			System.out.println("Device is a TV");

			StringResponse response = tv_blockingStub.changeDeviceName(req);
				System.out.println("TV response "+response.getText());
		}else if(device.equals("Speaker")) {
			System.out.println("Device is a Speaker");
			StringResponse response = speaker_blockingStub.changeDeviceName(req);
				System.out.println("Speaker Response "+response.getText());
		}else if(device.equals("Lamp")) {
			System.out.println("Device is a Lamp");
			StringResponse response = lamp_blockingStub.changeDeviceName(req);
			System.out.println("Lamp Response "+response.getText());
		}else if(device.equals("Chromecast")) {
			System.out.println("Device is a Chromecast");
			//StringResponse response = cc_blockingStub.changeDeviceName(req);
			//System.out.println("Chromecast Response "+response.getText());
		}

	}
	
	public static void changeVolume(int volume, String device) {
		valRequest req = valRequest.newBuilder().setLength(volume).build();
		System.out.println("Changing volume");


	//Handle device to work with
		if(device.equals("TV")) {
			valResponse response = tv_blockingStub.changeVolume(req);
				System.out.println("TV response"+response.getLength());
		}else if(device.equals("Speaker")) {
			valResponse response = speaker_blockingStub.changeVolume(req);
				System.out.println("Speaker Response"+response.getLength());
		}

	}
}
