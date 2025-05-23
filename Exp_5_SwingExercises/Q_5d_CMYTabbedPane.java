/*5d. Develop a Swing program in Java to create a Tabbed Pan of Cyan, Magenta and Yellow and
display the concerned color whenever the specific tab is selected in the Pan*/


package swing;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;

public class Q_5d_CMYTabbedPane extends JFrame {

    private JTabbedPane tabbedPane;
    private JPanel cyanPanel, magentaPanel, yellowPanel;

    public Q_5d_CMYTabbedPane() {
        setTitle("CMY Color Tabbed Pane");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        tabbedPane = new JTabbedPane();

        cyanPanel = new JPanel();
        magentaPanel = new JPanel();
        yellowPanel = new JPanel();

        tabbedPane.addTab("Cyan", cyanPanel);
        tabbedPane.addTab("Magenta", magentaPanel);
        tabbedPane.addTab("Yellow", yellowPanel);

        // Set initial color for the first tab
        cyanPanel.setBackground(Color.CYAN);

        tabbedPane.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                int selectedIndex = tabbedPane.getSelectedIndex();
                switch (selectedIndex) {
                    case 0:
                        cyanPanel.setBackground(Color.CYAN);
                        break;
                    case 1:
                        magentaPanel.setBackground(Color.MAGENTA);
                        break;
                    case 2:
                        yellowPanel.setBackground(Color.YELLOW);
                        break;
                }
            }
        });

        add(tabbedPane);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new Q_5d_CMYTabbedPane().setVisible(true);
        });
    }
}
