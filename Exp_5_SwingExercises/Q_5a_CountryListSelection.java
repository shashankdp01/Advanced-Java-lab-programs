/*
Q5a. Develop a Swing program in Java to add the countries USA, India, Vietnam, Canada,
     Denmark, France, Great Britain, Japan, Africa, Greenland, Singapore into a JList and
     display them on console whenever the countries are selected on the list.
*/

package swing;
import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;
public class Q_5a_CountryListSelection {
	 public static void main(String[] args) {
	        // Create frame
	        JFrame frame = new JFrame("Country JList Example");
	        frame.setSize(400, 300);
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        frame.setLayout(new FlowLayout());

	        // List of countries
	        String[] countries = {
	            "USA", "India", "Vietnam", "Canada",
	            "Denmark", "France", "Great Britain", "Japan",
	            "Africa", "Greenland", "Singapore"
	        };

	        // Create JList with country names
	        JList<String> countryList = new JList<>(countries);
	        countryList.setVisibleRowCount(6);
	        countryList.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);

	        // Add scroll pane in case list is too long
	        JScrollPane scrollPane = new JScrollPane(countryList);
	        scrollPane.setPreferredSize(new Dimension(200, 150));

	        // Add ListSelectionListener to display selected countries on console
	        countryList.addListSelectionListener(new ListSelectionListener() {
	            public void valueChanged(ListSelectionEvent e) {
	                if (!e.getValueIsAdjusting()) {
	                    java.util.List<String> selectedCountries = countryList.getSelectedValuesList();
	                    System.out.println("Selected countries:");
	                    for (String country : selectedCountries) {
	                        System.out.println(country);
	                    }
	                    System.out.println();
	                }
	            }
	        });

	        // Add components to frame
	        frame.add(new JLabel("Select Countries:"));
	        frame.add(scrollPane);

	        // Set frame visible
	        frame.setVisible(true);
	    }
}
