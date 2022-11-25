package view;

import javax.swing.*;
import java.awt.*;

import java.util.List;

public class RegionPanel extends JSplitPane {
	//GridLayoutPanel
	private final int hGap = 27, vGap = 30;
	private final Color clr = new Color(6538238);
	//GridLayoutPanel-btn
	private final Dimension btnSize = new Dimension(160, 120);
	//UtilPanel
	private final Dimension utilPanelSize = new Dimension(600, 150);
	//UtilPanel-RegionCombobox
	private final Dimension regComboSize = new Dimension(100,30);
	private final Point regComboLocation = new Point((utilPanelSize.width - regComboSize.width) - 25 , (utilPanelSize.height - regComboSize.height) - 10);
	//UtilPanel-returnButton
	private final Dimension rtnBtnSize = new Dimension(75, 25);
	private final Point rtnBtnLocation = new Point(10,10);

	public GridLayoutPanel gridLayoutPanel = new GridLayoutPanel();
	public UtilPanel utilPanel = new UtilPanel();
	
	static Image regionPic;
	static String[] regions = {"경기도", "경기", "충청도"};
	static String[] YeohaengJi = {"남산타워", "경복궁", "청와대"};
	static Image[] YeohaengJiPic = {};

	public RegionPanel() {//public RegionPanel(Image regionPic,String[] regions, String[] YehaengJi)
		super(JSplitPane.VERTICAL_SPLIT);
		//UtilPanel util = new UtilPanel(regionPic, regions);
		//this.setTopComponent(util);
		
		//GridLayoutPanel grid = new GridLayoutPanel(YeohaengJiPic);
		this.setTopComponent(utilPanel);
		this.setBottomComponent(gridLayoutPanel);
		this.setDividerLocation(0.25);
		this.setDividerSize(0);
		
	}

	public RegionPanel(String[] regions, ImageIcon regionProfilePicture, ImageIcon[] tripPic) {
		super(JSplitPane.VERTICAL_SPLIT);
		this.utilPanel = new UtilPanel(regions, regionProfilePicture);
		this.setTopComponent(utilPanel);
		
		this.gridLayoutPanel = new GridLayoutPanel(tripPic);
		this.setBottomComponent(gridLayoutPanel);
		
		
		this.setDividerLocation(0.25);
		this.setDividerSize(0);

	}

	public class GridLayoutPanel extends JPanel {
		public JButton[] btnList = {new JButton(), new JButton(), new JButton(), new JButton(), new JButton(), new JButton(), new JButton(), new JButton(), new JButton(), new JButton(), new JButton(), new JButton(), new JButton(), new JButton(),new JButton()};
		public GridLayoutPanel() {
			this.setBackground(Color.WHITE);
			this.setLayout(null);
			for(int i = 0; i< 12; i++) {
				btnList[i].setText(Integer.toString(i));
				btnList[i].setSize(btnSize);
				btnList[i].setLocation((i % 3) * (hGap + btnSize.width) + hGap, (i / 3) * (vGap + btnSize.height) + vGap);
				//System.out.println(i + ": " +(i % 3) * (hGap + btnSize.width) + hGap +" " + (i / 3) * (vGap + btnSize.height) + vGap);
				btnList[i].setBackground(clr);
				this.add(btnList[i]);
			}
    	}
		public GridLayoutPanel(ImageIcon[] tripPic) {
			this.setBackground(Color.WHITE);
			this.setLayout(null);
			
			for(int i = 0; i < tripPic.length; i++) {
				btnList[i].setIcon(tripPic[i]);
				btnList[i].setSize(btnSize);
				btnList[i].setLocation((i % 3) * (hGap + btnSize.width) + hGap, (i / 3) * (vGap + btnSize.height) + vGap);
				btnList[i].setBackground(clr);
				this.add(btnList[i]);
			}
		}
	}

	public class UtilPanel extends JPanel {
		public UtilPanel() {
			this.setBackground(Color.BLUE);
			this.setLayout(null);
			
			//JComboBox<String> reg = new JComboBox<String>(regions);
			RegionCombo reg = new RegionCombo();
			this.add(reg);
			
			JButton rtnBtn = new JButton("지도");
			rtnBtn.setBounds(new Rectangle(rtnBtnLocation, rtnBtnSize));
			this.add(rtnBtn);
			
			this.setPreferredSize(utilPanelSize);
			
		}
		public UtilPanel(String[] regions, ImageIcon regionProfilePicture) {
			// TODO Auto-generated constructor stub
			this.setBackground(Color.BLUE);
			this.setLayout(null);
			
			JComboBox<String> reg = new JComboBox<String>(regions);
			this.add(reg);
			
			JLabel regProfile = new JLabel(regionProfilePicture);
			this.add(regProfile);
			
			JButton rtnBtn = new JButton("지도");
			rtnBtn.setBounds(new Rectangle(rtnBtnLocation, rtnBtnSize));
			this.add(rtnBtn);
			
			this.setPreferredSize(utilPanelSize);
		}
	}
	
	private class RegionCombo extends JComboBox<String>{
		public RegionCombo() {
			super(regions);
			this.setLocation(regComboLocation);
			this.setSize(regComboSize);
		}
	}
}
