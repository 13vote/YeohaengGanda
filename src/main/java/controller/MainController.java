package controller;

import view.AppView;
import view.DetailPanel;
import view.RegionPanel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

public class MainController {
    AppView appView;
    RegionPanel regionPanel;

    public MainController(AppView appView) {
        this.appView = appView;

        Component[] list = appView.mainPanel.backgroundImage.getComponents();
        for (Component btn: list) {
            JButton actionButton = (JButton) btn;
            actionButton.addActionListener(new movePage2());
        }
    }

    class movePage2 implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            appView.change("r");
        }
    }

    class movePage3 implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println(e.getSource());
        }
    }
}

