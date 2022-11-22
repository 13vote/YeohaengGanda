package view;

import controller.MainController;
import controller.RegionController;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AppView extends JFrame{
    public MainPanel mainPanel;
    public RegionPanel regionPanel;
    public DetailPanel detailPanel;
    private static MainController mainController;
    private static RegionController regionController;

    public AppView() {
        setTitle("main");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600,900);
        mainPanel = new MainPanel();
        regionPanel = new RegionPanel();
        detailPanel = new DetailPanel();
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
