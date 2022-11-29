package controller;

import java.awt.*;
import java.awt.event.*;

import view.AppView;
import view.DetailPanel;

import javax.swing.*;

public class DetailController{
	AppView appView;
	
	public DetailController(AppView appView) {
		this.appView = appView;
		this.addEvent1();
		
	}
	public void addEvent1() {

		//JButton returnbtn2 = (JButton) appView.detailPanel.getComponent(0);
		System.out.println(appView.detailPanel.getComponent(0));
		//returnbtn2.addActionListener(new DetailController.move2());


	}

	class move2 implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			appView.change("r");
		}



	}
}
