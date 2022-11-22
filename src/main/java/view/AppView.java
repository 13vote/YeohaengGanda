package view;

import controller.MainController;

import model.Model3;

import javax.swing.*;
import java.awt.*;

public class AppView extends JFrame{
    public MainPanel mainPanel;
    public RegionPanel regionPanel;
    private DetailPanel detailPanel = new  DetailPanel();
    private static MainController mainController;
    private String[] name = {"경기도", "경상북도","경상남도","전라북도","전라남도"
            ,"충청북도","충청남도","강원도"};


    public AppView() {
        //main
        setTitle("main");
        setSize(600,900);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        add(detailPanel);

        setVisible(true);

    }



    public void change(JPanel panelName) {
        getContentPane().removeAll();
        getContentPane().add(panelName);
        revalidate();
        repaint();
    }



}
