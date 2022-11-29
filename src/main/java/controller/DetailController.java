package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.AppView;

public class DetailController {
	AppView appView;
	
	public DetailController(AppView appview) {
		this.appView = appView;
		
		
	}
	
	class MovePage2 implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			appView.change("r");
		}
	}
}
