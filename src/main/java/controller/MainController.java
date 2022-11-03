package controller;

import view.AppView;
import view.RegionPanel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainController {
    AppView appView;

    public MainController(AppView appView) {
        this.appView = appView;
        appView.mainPanel.btn.addActionListener(new movePage2());
    }

    class  movePage2 implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
                RegionPanel regionPanel = new RegionPanel();
                appView.change(regionPanel);


            }
        }


    }




