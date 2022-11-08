package view;

import controller.MainController;

import javax.swing.*;
import java.awt.*;


public class MainPanel extends JPanel {
    public JButton btn = new JButton("MainPanel");
    private static MainController mainController;
    public MainPanel() {
        setBackground(Color.BLACK);
        add(btn);



        setVisible(true);
    }


}
