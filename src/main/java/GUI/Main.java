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
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
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
import javax.swing.JToggleButton;

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
	private JTextField speakerName_tf;
	private JTextField ccName_tf;
	private JTextField lampName_tf;
	

	
	
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
		ManagedChannel tvChannel = ManagedChannelBuilder.forAddress("localhost", 1235).usePlaintext().build();
		ManagedChannel lampChannel = ManagedChannelBuilder.forAddress("localhost", 50056).usePlaintext().build();
		ManagedChannel speakerChannel = ManagedChannelBuilder.forAddress("localhost", 50057).usePlaintext().build();
		tv_blockingStub = TvServiceGrpc.newBlockingStub(tvChannel);
		tv_asyncStub = TvServiceGrpc.newStub(tvChannel);
		tv_futureStub = TvServiceGrpc.newFutureStub(tvChannel);
		
		lamp_blockingStub = LampServiceGrpc.newBlockingStub(lampChannel);
		lamp_asyncStub = LampServiceGrpc.newStub(lampChannel);
		lamp_futureStub = LampServiceGrpc.newFutureStub(lampChannel);
		
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
		volume_lbl.setBounds(275, 90, 48, 14);
		frame.getContentPane().add(volume_lbl);
		
		JLabel lblChannel = new JLabel("Channel");
		lblChannel.setBounds(370, 90, 48, 14);
		frame.getContentPane().add(lblChannel);
		
		JLabel device_name2_lblabel = new JLabel("Device Name");
		device_name2_lblabel.setBounds(70, 135, 83, 14);
		frame.getContentPane().add(device_name2_lblabel);
		
		JLabel device_status2_lbl = new JLabel("Device Status");
		device_status2_lbl.setBounds(170, 135, 83, 14);
		frame.getContentPane().add(device_status2_lbl);
		
		JLabel volume2_lbl = new JLabel("Volume");
		volume2_lbl.setBounds(270, 135, 48, 14);
		frame.getContentPane().add(volume2_lbl);
		
		JLabel lblMute = new JLabel("Mute");
		lblMute.setBounds(370, 135, 38, 14);
		frame.getContentPane().add(lblMute);
		
		JLabel device_name3_lbl = new JLabel("Device Name");
		device_name3_lbl.setBounds(70, 180, 83, 14);
		frame.getContentPane().add(device_name3_lbl);
		
		JLabel volume_3_lbl = new JLabel("Volume");
		volume_3_lbl.setBounds(270, 180, 48, 14);
		frame.getContentPane().add(volume_3_lbl);
		
		JLabel lblApplication = new JLabel("Application");
		lblApplication.setBounds(355, 180, 63, 14);
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
		
		
		//////////////////////
		//TV Volume Buttons
		//////////////////////
		JButton tv_volumeUp_btn = new JButton("+");
		tv_volumeUp_btn.setFont(new Font("Tahoma", Font.BOLD, 5));
		tv_volumeUp_btn.setBounds(290, 104, 38, 20);
		frame.getContentPane().add(tv_volumeUp_btn);
		tv_volumeUp_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
		    	System.out.println(+1);
		    	changeVolume(1,"TV");
			}
		});
		
		JButton tv_volumeDown_btn = new JButton("-");
		tv_volumeDown_btn.setFont(new Font("Tahoma", Font.BOLD, 5));
		tv_volumeDown_btn.setBounds(254, 104, 38, 20);
		frame.getContentPane().add(tv_volumeDown_btn);
		tv_volumeDown_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
		    	System.out.println(-1);
		    	changeVolume(-1,"TV");
			}
		});
		
		
		//////////////////////
		//Speaker Volume Buttons
		//////////////////////
		JButton speaker_volumeDown_btn = new JButton("-");
		speaker_volumeDown_btn.setFont(new Font("Tahoma", Font.BOLD, 5));
		speaker_volumeDown_btn.setBounds(254, 149, 38, 20);
		frame.getContentPane().add(speaker_volumeDown_btn);
		speaker_volumeDown_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
		    	System.out.println(-1);
		    	changeVolume(-1,"Speaker");
			}
		});
		
		JButton speaker_volumeUp_btn = new JButton("+");

		speaker_volumeUp_btn.setFont(new Font("Tahoma", Font.BOLD, 5));
		speaker_volumeUp_btn.setBounds(290, 149, 38, 20);
		frame.getContentPane().add(speaker_volumeUp_btn);
		speaker_volumeUp_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println(+1);
		    	changeVolume(1,"Speaker");}
		});
		
		JButton cc_volumeUp_btn = new JButton("+");
		cc_volumeUp_btn.setFont(new Font("Tahoma", Font.BOLD, 5));
		cc_volumeUp_btn.setBounds(290, 194, 38, 20);
		frame.getContentPane().add(cc_volumeUp_btn);
		cc_volumeUp_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.out.println(+1);
		    	changeVolume(1,"Chromecast");
		    	}
			
		});
		
		
		
		JButton cc_volumeDown_btn = new JButton("-");
		cc_volumeDown_btn.setFont(new Font("Tahoma", Font.BOLD, 5));
		cc_volumeDown_btn.setBounds(254, 194, 38, 20);
		frame.getContentPane().add(cc_volumeDown_btn);
		cc_volumeDown_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.out.println(-1);
		    	changeVolume(-1,"Chromecast");
		    	}
			
		});
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
		
		/////////////////////////
		//Lamp Brightness Buttons
		/////////////////////////
		JButton lamp_brightnessDown_btn = new JButton("-");
		lamp_brightnessDown_btn.setFont(new Font("Tahoma", Font.BOLD, 5));
		lamp_brightnessDown_btn.setBounds(254, 240, 38, 20);
		frame.getContentPane().add(lamp_brightnessDown_btn);
		lamp_brightnessDown_btn.addActionListener(new ActionListener() {

		    @Override
		    public void actionPerformed(ActionEvent e) {
		    	System.out.println(-1);
		    	changeBrightness(-1);
		    }
		});
		
		JButton lamp_brightnessUp_btn = new JButton("+");
		lamp_brightnessUp_btn.setFont(new Font("Tahoma", Font.BOLD, 5));
		lamp_brightnessUp_btn.setBounds(290, 240, 38, 20);
		frame.getContentPane().add(lamp_brightnessUp_btn);
		lamp_brightnessUp_btn.addActionListener(new ActionListener() {

		    @Override
		    public void actionPerformed(ActionEvent e) {
		    	System.out.println(1);
		    	changeBrightness(1);
		    }
		});
		
		
		
		
		
		JLabel lblTv = new JLabel("TV");
		lblTv.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblTv.setBounds(4, 105, 36, 14);
		frame.getContentPane().add(lblTv);
		
		JLabel lblSpeaker = new JLabel("Speaker");
		lblSpeaker.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblSpeaker.setBounds(4, 155, 45, 14);
		frame.getContentPane().add(lblSpeaker);
		
		JLabel lblChromecast = new JLabel("ChromeC");
		lblChromecast.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblChromecast.setBounds(4, 200, 56, 14);
		frame.getContentPane().add(lblChromecast);
		
		JLabel lblLamp = new JLabel("Lamp");
		lblLamp.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblLamp.setBounds(4, 241, 45, 14);
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
		
		final JToggleButton tvOnOff_tgl = new JToggleButton("On");
		tvOnOff_tgl.setSelected(true);
		tvOnOff_tgl.setBounds(160, 104, 86, 20);
		frame.getContentPane().add(tvOnOff_tgl);
		tvOnOff_tgl.addChangeListener(new ChangeListener() {

			@Override
			public void stateChanged(ChangeEvent event) {
				 if (tvOnOff_tgl.isSelected()){
					 tvOnOff_tgl.setText("On");
					 onOff(true,"TV");
	            } else {
	            	tvOnOff_tgl.setText("Off");
					 onOff(false,"TV");

	            }
				
			}
	    });
		
		final JToggleButton speakerOnOff_tgl = new JToggleButton("On");
		speakerOnOff_tgl.setSelected(true);
		speakerOnOff_tgl.setBounds(160, 149, 86, 20);
		frame.getContentPane().add(speakerOnOff_tgl);
		speakerOnOff_tgl.addChangeListener(new ChangeListener() {

			@Override
			public void stateChanged(ChangeEvent event) {
				 if (speakerOnOff_tgl.isSelected()){
					 speakerOnOff_tgl.setText("On");
					 onOff(true,"Speaker");

	            } else {
	            	speakerOnOff_tgl.setText("Off");
	            	 onOff(false,"Speaker");
	            }
				
			}
	    });
		
		final JToggleButton ccOnOff_tgl = new JToggleButton("On");
		ccOnOff_tgl.setSelected(true);
		ccOnOff_tgl.setBounds(160, 194, 86, 20);
		frame.getContentPane().add(ccOnOff_tgl);
		ccOnOff_tgl.addChangeListener(new ChangeListener() {

			@Override
			public void stateChanged(ChangeEvent event) {
				 if (ccOnOff_tgl.isSelected()){
					 ccOnOff_tgl.setText("On");
					 onOff(true,"Chromecast");

	            } else {
	            	ccOnOff_tgl.setText("Off");
					 onOff(true,"TV");

	            }
				
			}
	    });
		
		final JToggleButton lampOnOff_tgl = new JToggleButton("On");
		lampOnOff_tgl.setSelected(true);
		lampOnOff_tgl.setBounds(160, 240, 86, 20);
		frame.getContentPane().add(lampOnOff_tgl);
		lampOnOff_tgl.addChangeListener(new ChangeListener() {

			@Override
			public void stateChanged(ChangeEvent event) {
				 if (lampOnOff_tgl.isSelected()){
					 lampOnOff_tgl.setText("On");
					 onOff(true,"Lamp");
	            } else {
	            	lampOnOff_tgl.setText("Off");
	            	onOff(false,"Lamp");
	            }
				
			}
	    });
	
		
		final JToggleButton speakerMute_tgl = new JToggleButton("Mute");
		speakerMute_tgl.setBounds(345, 149, 86, 20);
		frame.getContentPane().add(speakerMute_tgl);
		speakerMute_tgl.addChangeListener(new ChangeListener() {

				@Override
				public void stateChanged(ChangeEvent event) {
					 if (speakerMute_tgl.isSelected()){
						 speakerMute_tgl.setText("Muted");
						 
		            } else {
		            	speakerMute_tgl.setText("Mute");
		            }
					
				}
		    });
		
		
		
		
		
		JButton tvChannelDown_btn = new JButton("-");
		tvChannelDown_btn.setFont(new Font("Tahoma", Font.BOLD, 5));
		tvChannelDown_btn.setBounds(355, 104, 38, 20);
		frame.getContentPane().add(tvChannelDown_btn);
		tvChannelDown_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		    	System.out.println(1);
		    	changeChannel(-1);
			}
		});
		
		JButton tvChannelUp_btn = new JButton("+");
		tvChannelUp_btn.setFont(new Font("Tahoma", Font.BOLD, 5));
		tvChannelUp_btn.setBounds(391, 104, 38, 20);
		frame.getContentPane().add(tvChannelUp_btn);
		tvChannelUp_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println(+1);
		    	changeChannel(1);
			}
		});
		
		String[] appNames = {"Select an Application","Youtube", "Netflix", "Hulu", "Disney +", "RTE Player", "ScreenShare" };
		JComboBox appList = new JComboBox(appNames);
		appList.setFont(new Font("Tahoma", Font.PLAIN, 10));
		appList.setBounds(345, 194, 86, 20);
		frame.getContentPane().add(appList);
		appList.addActionListener(new ActionListener()  {
			
		    public void actionPerformed(ActionEvent e) {
		        JComboBox cb = (JComboBox)e.getSource();
		        String appName = (String)cb.getSelectedItem();
		        System.out.println(appName);
		    }		
	});
		
		///////////////////
		//GRPC Methods
		///////////////////
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
		}
		else if(device.equals("Speaker")) {
			System.out.println("Device is a Speaker");
			StringResponse response = speaker_blockingStub.changeDeviceName(req);
				System.out.println("Speaker Response "+response.getText());
		}
		else if(device.equals("Lamp")) {
			System.out.println("Device is a Lamp");
			StringResponse response = lamp_blockingStub.changeDeviceName(req);
			System.out.println("Lamp Response "+response.getText());
		}
		else if(device.equals("Chromecast")) {
			System.out.println("Device is a Chromecast but not set up yet");
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
		}else if(device.equals("Chromecast")) {
			//valResponse response = speaker_blockingStub.changeVolume(req);
			System.out.println("Chromecast Response");
		}

	}
	public static void changeBrightness(int value) {
		valRequest req = valRequest.newBuilder().setLength(value).build();
		System.out.println("Changing Brightness");
		valResponse response = lamp_blockingStub.changeBrightness(req);
		System.out.println("Lamp Brightness response"+response.getLength());

	}
	public static void changeChannel(int value) {
		valRequest req = valRequest.newBuilder().setLength(value).build();
		System.out.println("Changing Channel");
		valResponse response =tv_blockingStub.changeChannel(req);
		System.out.println("TV channel response"+response.getLength());

	}
	public static void onOff(boolean onOff, String device) {
		BooleanReq req = BooleanReq.newBuilder().setMsg(onOff).build();
		System.out.println("On Off");


	//Handle device to work with
		if(device.equals("TV")) {
			BooleanRes response = tv_blockingStub.onOff(req);
				System.out.println("TV response"+response.getMsg());
		}else if(device.equals("Speaker")) {
			BooleanRes response = speaker_blockingStub.onOff(req);
				System.out.println("Speaker Response"+response.getMsg());
		}else if(device.equals("Chromecast")) {
			System.out.println("Chromecast Response not set up yet");
		}else if(device.equals("Lamp")) {
			BooleanRes response = lamp_blockingStub.onOff(req);
			System.out.println("Lamp Response"+response.getMsg());
		}
	}
}
