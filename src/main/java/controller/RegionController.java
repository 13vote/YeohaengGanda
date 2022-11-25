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

		// System.out.println(appView.regionPanel.utilPanel.getComponent(1));
		JButton returnbtn = (JButton) appView.regionPanel.utilPanel.getComponent(1);
		returnbtn.addActionListener(new movePage1());

		for (Component btn : appView.regionPanel.gridLayoutPanel.btnList) {
			// System.out.println((JButton)btn);
			JButton actionButton = (JButton) btn;
			actionButton.addActionListener(new movePage3());
		}
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

}
