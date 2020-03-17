package GUI;
import java.awt.GridLayout;
import java.awt.Insets;
 
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
 
public class Main_GUI {



	    public static void main(String[] args) {
	        // Define frame, label and panel
	        JFrame frame = new JFrame("Smart Home controller");
	        JLabel label = new JLabel("Manage your devices", JLabel.CENTER);
	        JPanel panel = new JPanel();
	         
	        // Setting for the panel
	        BoxLayout boxlayout = new BoxLayout(panel, BoxLayout.Y_AXIS);
	        panel.setLayout(boxlayout);
	        panel.setBorder(new EmptyBorder(new Insets(45, 70, 45, 70)));
	         
	        // Define new buttons
	        JButton devicesOn = new JButton("Turn On");
	        JButton searchForDevices = new JButton("Begin Search");      
	        JButton jb3 = new JButton("Button 3");
	         
	        // Add buttons to the frame (and spaces between buttons)
	        panel.add(devicesOn); 
	        panel.add(searchForDevices);
	        panel.add(jb3);
	         
	        // Add the label and panel to the frame
	        frame.setLayout(new GridLayout(2, 1));
	        frame.add(label);
	        frame.add(panel);
	         
	        // Settings for the frame
	        frame.pack();
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        frame.setVisible(true);
	 
	    }

}
