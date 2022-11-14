package view;

import controller.MainController;

import model.Model3;

import javax.swing.*;
import java.awt.*;

public class AppView extends JFrame{
    public MainPanel mainPanel;
    public RegionPanel regionPanel;
    private DetailPanel detailPanel = new  DetailPanel();
    private static MainController mainController;
    private String[] name = {"경기도", "경상북도","경상남도","전라북도","전라남도"
            ,"충청북도","충청남도","강원도"};
    Model3 mm = new Model3(name);

    public AppView() {
        //main
        setTitle("main");
        setSize(600,900);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        JMenuBar mb = new JMenuBar();
        mb.setLayout(null);
        mb.add(new JMenu("메뉴"));
        mb.add(new JMenu("도움말"));


        JComboBox screenMenu = new JComboBox(name);

        mb.setSize(600,40);
        mb.add(screenMenu).setBounds(496,0,70,30);
        setJMenuBar(mb);

        add(detailPanel).setBounds(40, 36, 520, 660);


        setVisible(true);
        btn();

    }

    public void btn(){
        // JButton("여행지 저장하기") 생성
        JButton btn = new JButton("여행지 저장하기");
        btn.setBounds(132,721,335,56);
        add(btn).setBackground(new Color(99,195,249));;
        setVisible(true);

    }

    public void change(JPanel panelName) {
        getContentPane().removeAll();
        getContentPane().add(panelName);
        revalidate();
        repaint();
    }

    public static void main(String[] args) {
        new AppView();
    }


}
