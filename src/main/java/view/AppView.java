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
        setSize(600,900);
        mainPanel = new MainPanel();
        getContentPane().add(mainPanel);

        MenuBar menuBar = new MenuBar();
        this.setJMenuBar(menuBar);
        setVisible(true);
    }

    public void change(JComponent panelName) {
        getContentPane().removeAll();
        getContentPane().add(panelName);
        revalidate();
        repaint();
    }


}
