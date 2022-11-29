package view;

import javax.swing.*;
import java.awt.*;

public class DetailPanel extends JPanel {

    private ImageIcon[] images= {
            new ImageIcon("src/main/java/images/"),
            new ImageIcon("src/main/java/images/")
    };

    public int i1;

    public int i2;
    public int i3;
    public int i4;
    public String name2;
    public DetailPanel(String name, String positions , String informations) {
    	this.images = images;
    	
    	// 패널 c

        JPanel f1 = new JPanel();
        f1.setBounds(40, 36, 520, 660);
        setLayout(null);
        Font Font1 = new Font("pretendard", Font.PLAIN, 24);

        Color c1 = new Color(99,195,249);
        f1.setBackground(c1);
        f1.setLayout(null);
        JLabel j1 = new JLabel("여행지 이름");
        f1.add(j1).setBounds(18,24,130,30);
        JLabel j5 = new JLabel(name);

        f1.add(j5).setBounds(150,24,341,30);

        JPanel p1 = new JPanel();
        p1.setBackground(Color.WHITE);
        f1.add(p1).setBounds(0,71,520,1);
        JPanel p2 = new JPanel();
        p2.setBackground(Color.WHITE);
        f1.add(p2).setBounds(0,511,520,1);

        JLabel j4 = new JLabel("여행지 위치:");
        f1.add(j4).setBounds(18,88,145,30);

        JLabel j6 = new JLabel(positions);
        f1.add(j6).setBounds(155,88,341,30);

        JLabel j2 = new JLabel("여행지 설명:");
        f1.add(j2).setBounds(18,148,145,30);

        JLabel j3 = new JLabel(informations);
        j3.setVerticalAlignment(JLabel.TOP);
        f1.add(j3).setBounds(18,178,491,391);
        this.setSize(600,900);
        add(f1);
        j1.setFont(Font1);
        j2.setFont(Font1);
        j3.setFont(Font1);
        j4.setFont(Font1);
        j5.setFont(Font1);
        j6.setFont(Font1);

        btn();

        setVisible(true);
    }
    private void btn(){
        // JButton("뒤로가기") 생성
        JButton btn = new JButton("뒤로가기");
        add(btn).setBounds(132,721,335,56);
        add(btn).setBackground(new Color(99,195,249));
        Font Font1 = new Font("pretendard", Font.PLAIN, 24);
        this.setFont(Font1);
    }

}
