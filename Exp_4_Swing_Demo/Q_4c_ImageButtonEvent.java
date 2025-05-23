/*
Q4c. Develop a Swing program in Java to display a message 
     “Digital Clock is pressed” or “Hour Glass is pressed” depending upon the JButton
     with image either Digital Clock or Hour Glass is pressed by implementing the 
     event handling mechanism with addActionListener().
*/



package swing_operations;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Q_4c_ImageButtonEvent {
	  public static void main(String[] args) {
	        // Create the main frame
	        JFrame frame = new JFrame("Image Button Example");
	        frame.setSize(500, 300);
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        frame.setLayout(new FlowLayout());

	        // Load images (ensure the image files are in the correct path)
	        ImageIcon digitalClockIcon = new ImageIcon("src/swing_operations/digital_clock.png");
	        ImageIcon hourGlassIcon = new ImageIcon("src/swing_operations/hour_glass.png");
	        
	        Image scaledClock = digitalClockIcon.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);
	        digitalClockIcon = new ImageIcon(scaledClock);

	        Image scaledClock1 = hourGlassIcon.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);
	        hourGlassIcon = new ImageIcon(scaledClock1);

	        // Create buttons with images
	        JButton digitalClockButton = new JButton(digitalClockIcon);
	        JButton hourGlassButton = new JButton(hourGlassIcon);

	        // Set tool tips for clarity
	        digitalClockButton.setToolTipText("Digital Clock");
	        hourGlassButton.setToolTipText("Hour Glass");

	        // Create a label to display messages
	        JLabel messageLabel = new JLabel("Click an image button");
	        messageLabel.setFont(new Font("Arial", Font.PLAIN, 20));

	        // Add ActionListener for Digital Clock button
	        digitalClockButton.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent e) {
	                messageLabel.setText("Digital Clock is pressed");
	            }
	        });

	        // Add ActionListener for Hour Glass button
	        hourGlassButton.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent e) {
	                messageLabel.setText("Hour Glass is pressed");
	            }
	        });

	        // Add buttons and label to frame
	        frame.add(digitalClockButton);
	        frame.add(hourGlassButton);
	        frame.add(messageLabel);

	        // Make frame visible
	        frame.setVisible(true);
	    }
}
