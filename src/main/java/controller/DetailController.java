package controller;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import view.AppView;

public class DetailController {
	AppView appView;
	
	public DetailController(AppView appview) {
		this.appView = appview;
		System.out.println(appView.detailPanel.getComponent(1));
		JButton returnbtn2 = (JButton) appView.detailPanel.getComponent(1);
		returnbtn2.addActionListener(new move2());
	}
	
	class move2 implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			appView.change("r");
		}
	}
}
