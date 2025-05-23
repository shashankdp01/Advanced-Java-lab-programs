/*
Q 4a: Write a basic Hello program using Swing that displays the message:
   "Hello! VI C, Welcome to Swing Programming"
   The message should appear in Blue color, plain font, with a font size of 32,
   using JFrame and JLabel.
*/


package swing_operations;
import javax.swing.*;
import java.awt.*;
public class Q_4a_HelloSwingProgram {
	  public static void main(String[] args) {
	        // Create a new JFrame (window)
	        JFrame frame = new JFrame("Swing Hello Example");

	        // Create the message to display
	        String message = "Hello! VI C, Welcome to Swing Programming";

	        // Create a JLabel with the message
	        JLabel label = new JLabel(message);

	        // Set font: plain style, size 32
	        label.setFont(new Font("Arial", Font.PLAIN, 32));

	        // Set font color to Blue
	        label.setForeground(Color.BLUE);

	        // Center the text horizontally and vertically
	        label.setHorizontalAlignment(SwingConstants.CENTER);
	        label.setVerticalAlignment(SwingConstants.CENTER);

	        // Add the label to the frame
	        frame.add(label);

	        // Set the size of the frame
	        frame.setSize(800, 200);

	        // Exit the application when the frame is closed
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	        // Make the frame visible
	        frame.setVisible(true);
	    }
}
