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
        	JButton btn = (JButton)e.getSource();
        	switch(btn.getText()) {
        	case "경기 지역":
        		appView.regionPanel.utilPanel.reg.setSelectedIndex(0);
        		break;
        	case  "강원도":
        		appView.regionPanel.utilPanel.reg.setSelectedIndex(1);
        		break;
        	case  "충청북도":
        		appView.regionPanel.utilPanel.reg.setSelectedIndex(2);
        		break;
        	case "충청남도":
        		appView.regionPanel.utilPanel.reg.setSelectedIndex(3);
        		break;
        	case "전라북도":
        		appView.regionPanel.utilPanel.reg.setSelectedIndex(4);
        		break;
        	case "전라남도":
        		appView.regionPanel.utilPanel.reg.setSelectedIndex(5);
        		break;
        	case"경상북도":
        		appView.regionPanel.utilPanel.reg.setSelectedIndex(6);
        		break;
        	case "경상남도":
        		appView.regionPanel.utilPanel.reg.setSelectedIndex(7);
        		break;
        	case "제주도":
        		appView.regionPanel.utilPanel.reg.setSelectedIndex(8);
        		break;
        	}
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

