/*5b. Develop a Swing program in Java to create a Tabbed Pan of RED, BLUE and GREEN and
display the concerned color whenever the specific tab is selected in the Pan.*/



package swing;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;

public class Q_5b_ColorTabbedPane extends JFrame {

    private JTabbedPane tabbedPane;
    private JPanel redPanel, bluePanel, greenPanel;

    public Q_5b_ColorTabbedPane() {
        setTitle("Color Tabbed Pane");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        tabbedPane = new JTabbedPane();

        // Create panels for each tab
        redPanel = new JPanel();
        bluePanel = new JPanel();
        greenPanel = new JPanel();

        // Add tabs with empty panels
        tabbedPane.addTab("RED", redPanel);
        tabbedPane.addTab("BLUE", bluePanel);
        tabbedPane.addTab("GREEN", greenPanel);

        // Set initial background color for first tab (RED)
        redPanel.setBackground(Color.RED);

        // Add a listener to change color when tab changes
        tabbedPane.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                int selectedIndex = tabbedPane.getSelectedIndex();
                switch (selectedIndex) {
                    case 0:
                        redPanel.setBackground(Color.RED);
                        break;
                    case 1:
                        bluePanel.setBackground(Color.BLUE);
                        break;
                    case 2:
                        greenPanel.setBackground(Color.GREEN);
                        break;
                }
            }
        });

        add(tabbedPane);

    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new Q_5b_ColorTabbedPane().setVisible(true);
        });
    }
}
