package controller;

import view.RegionPanel;
import view.RegionPanel.GridLayoutPanel;
import view.AppView;
import view.DetailPanel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.Arrays;

public class RegionController {
	AppView appView;

	public RegionController(AppView appView) {
		this.appView = appView;

		this.addEvent();
		
	}
	
	public void addEvent() {
		JButton returnbtn = (JButton) appView.regionPanel.utilPanel.getComponent(1);
		returnbtn.addActionListener(new movePage1());

		for (Component btn : appView.regionPanel.gridLayoutPanel.btnList) {
			// System.out.println((JButton)btn);
			JButton actionButton = (JButton) btn;
			actionButton.addActionListener(new movePage3());
		}
		
		appView.regionPanel.utilPanel.reg.addItemListener(new regionChange());
	}

	class movePage3 implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			appView.change("d");
		}
	}

	class movePage1 implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			appView.change("m");
		}
	}
	
	class regionChange implements ItemListener{

		@Override
		public void itemStateChanged(ItemEvent e) {
			// TODO Auto-generated method stub
			if(e.getStateChange() == e.SELECTED) {
				JComboBox<String> regionCombo = (JComboBox<String>)e.getSource();
				int regionInt = regionCombo.getSelectedIndex();
				System.out.println(regionCombo.getSelectedItem().toString());
				
				appView.regionChange(regionInt);
				new RegionController(appView);
			}
		
	}

}}