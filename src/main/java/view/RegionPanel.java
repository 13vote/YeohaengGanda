package view;

import javax.swing.*;
import java.awt.*;

import java.util.List;

public class RegionPanel extends JSplitPane {
	private final int hGap = 10, vGap = 10;
	static String[] regions = {"辑匡", "版扁", "面没", "力林"};

	public RegionPanel() {
		super(JSplitPane.VERTICAL_SPLIT);
		this.setTopComponent(new UtilPanel());
		this.setBottomComponent(new GridLayoutPanel());
		this.setDividerLocation(0.25);
		
	}

	public RegionPanel(List<String> regionNames) {
		setBackground(Color.BLUE);
		this.setLayout(new GridLayout((regionNames.size() / 3) + 1, 3, hGap, vGap));
		for (String name : regionNames) {
			this.add(new JButton(name));
		}
		setVisible(true);

	}

	public class GridLayoutPanel extends JPanel {
		public GridLayoutPanel() {
			this.setBackground(Color.BLUE);
			this.setLayout(new GridLayout(4, 3, hGap, vGap));
			for(int i = 0; i< 12; i++) {
				JButton btn = new JButton(Integer.toString(i));
				this.add(btn);
			}
    	}
	}

	private class UtilPanel extends JPanel {
		public UtilPanel() {
			this.setBackground(Color.BLUE);
			this.setLayout(null);
			
			//JComboBox<String> reg = new JComboBox<String>(regions);
			RegionCombo reg = new RegionCombo();
			reg.setSize(100, 50);
			reg.setLocation(600, 50);
			this.add(reg);
			
			JButton rtnBtn = new JButton("第肺");
			rtnBtn.setBounds(10,10, 50, 25);
			this.add(rtnBtn);
			
			this.setPreferredSize(new Dimension(720,100));
			
		}
	}
	
	private class RegionCombo extends JComboBox<String>{
		public RegionCombo() {
			super(regions);
		}
	}
}
