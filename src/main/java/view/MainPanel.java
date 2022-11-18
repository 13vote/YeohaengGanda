package view;

import controller.MainController;

import javax.swing.*;
import java.awt.*;


public class MainPanel extends JPanel {
    public JButton btn = new JButton("MainPanel");
    public MainPanel() {
        setBackground(new Color(99, 195, 249));
        JLabel label = new JLabel(new ImageIcon("resource/map.png"));
        add(label);
        add(btn);
        setVisible(true);
    }
}
