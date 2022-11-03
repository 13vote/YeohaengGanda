package view;

import controller.MainController;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AppView extends JFrame{
    public MainPanel mainPanel;
    private static MainController mainController;

    public AppView() {
        setTitle("main");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(720,480);
        mainPanel = new MainPanel();
        getContentPane().add(mainPanel);
        setVisible(true);
    }

    public void change(JPanel panelName) {
        getContentPane().removeAll();
        getContentPane().add(panelName);
        revalidate();
        repaint();
    }


}
