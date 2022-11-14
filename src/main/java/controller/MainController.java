package controller;

import view.AppView;
import view.DetailPanel;
import view.RegionPanel;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainController {
    AppView appView;
    public MainController(AppView appView) {
        this.appView = appView;
        appView.mainPanel.btn.addActionListener(new movePage2());
        appView.regionPanel.btn.addActionListener(new movePage2());
    }

    class  movePage2 implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            JButton b = (JButton) e.getSource();
            if(b.getText().equals("버튼1")) {
                RegionPanel regionPanel = new RegionPanel();
                appView.change(regionPanel);
            } else if (b.getText().equals("버튼1")) {
                DetailPanel detailPanel = new DetailPanel();
                appView.change(detailPanel);
            }

        }
        }


    }




