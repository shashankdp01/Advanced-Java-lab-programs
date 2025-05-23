/*5c. Develop a Swing program in Java to add the countries USA, India, Vietnam, Canada,
Denmark, France, Great Britain, Japan, Africa, Greenland, Singapore into a JList and
display the capital of the countries on console whenever the countries are selected on the list.*/

package swing;
import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;
import java.util.HashMap;
import java.util.Map;
public class Q_5c_CountryCapitalDisplay  extends JFrame{
	 private JList<String> countryList;
	    private Map<String, String> countryCapitalMap;

	    public Q_5c_CountryCapitalDisplay() {
	        setTitle("Country Capital Viewer");
	        setSize(300, 300);
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        setLocationRelativeTo(null);

	        // Country-capital data
	        countryCapitalMap = new HashMap<>();
	        countryCapitalMap.put("USA", "Washington, D.C.");
	        countryCapitalMap.put("India", "New Delhi");
	        countryCapitalMap.put("Vietnam", "Hanoi");
	        countryCapitalMap.put("Canada", "Ottawa");
	        countryCapitalMap.put("Denmark", "Copenhagen");
	        countryCapitalMap.put("France", "Paris");
	        countryCapitalMap.put("Great Britain", "London");
	        countryCapitalMap.put("Japan", "Tokyo");
	        countryCapitalMap.put("Africa", "No single capital (continent)");
	        countryCapitalMap.put("Greenland", "Nuuk");
	        countryCapitalMap.put("Singapore", "Singapore");

	        // JList of countries
	        String[] countries = countryCapitalMap.keySet().toArray(new String[0]);
	        countryList = new JList<>(countries);
	        countryList.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
	        countryList.addListSelectionListener(new ListSelectionListener() {
	            @Override
	            public void valueChanged(ListSelectionEvent e) {
	                if (!e.getValueIsAdjusting()) {
	                    for (String country : countryList.getSelectedValuesList()) {
	                        String capital = countryCapitalMap.get(country);
	                        System.out.println("Capital of " + country + " is " + capital);
	                    }
	                    System.out.println("----");
	                }
	            }
	        });

	        add(new JScrollPane(countryList), BorderLayout.CENTER);
	    }

	    public static void main(String[] args) {
	        SwingUtilities.invokeLater(() -> {
	            new Q_5c_CountryCapitalDisplay().setVisible(true);
	        });
	    }
}
