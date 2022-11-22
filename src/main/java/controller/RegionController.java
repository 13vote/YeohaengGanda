package controller;

import view.RegionPanel;
import view.AppView;
import view.DetailPanel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

public class RegionController {
	AppView appView;
	DetailPanel detailPanel;
	
	public RegionController(AppView appView) {
		this.appView = appView;
		
		Component[] list = appView.regionPanel.gridLayoutPanel.getComponents();
		for(Component btn: list) {
			System.out.println((JButton)btn);
			JButton actionButton = (JButton) btn;
			actionButton.addActionListener(new movePage3());
		}
	}
	
	class movePage3 implements ActionListener{
	@Override
    public void actionPerformed(ActionEvent e) {
        System.out.println(e.getSource());
        detailPanel = new DetailPanel();
        appView.change(detailPanel);
    }
}

}
