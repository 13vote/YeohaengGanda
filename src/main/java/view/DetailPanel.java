package view;

import javax.swing.*;
import java.awt.*;

public class DetailPanel extends JPanel {
    private String[] content={"여행 설명여행  설명 여행 설명 여행 설명 여행 설명 여행 설명 여행 설명 여행 설명 여행 설명 여행 설명  "};
    private String[] name = {"경기도", "경상북도","경상남도","전라북도","전라남도"
            ,"충청북도","충청남도","강원도"};

    private ImageIcon[] images= {
            new ImageIcon("src/main/java/images/apple.jpg"),
            new ImageIcon("src/main/java/images/banana.jpg")
    };


    public DetailPanel() {
        // 패널 c

        JPanel f1 = new JPanel();
        f1.setBounds(40, 36, 520, 660);
        setLayout(null);

        Color c1 = new Color(99,195,249);
        f1.setBackground(c1);
        f1.setLayout(null);
        f1.add(new JLabel("여행지 이름")).setBounds(18,24,120,30);
        JLabel j1 = new JLabel("여행지 설명 : "+content[0]);
        j1.setVerticalAlignment(JLabel.TOP);
        f1.add(j1).setBounds(18,88,491,391);
        this.setSize(600,900);
        add(f1);
        for(int i=0; i<images.length; i++) {
            f1.add(new JLabel(images[i])).setBounds(18+150*i,528,120,120);
        }

        btn();
        setVisible(true);


    }
    private void btn(){
        // JButton("여행지 저장하기") 생성
        JButton btn = new JButton("여행지 저장하기");
        add(btn).setBounds(132,721,335,56);
        add(btn).setBackground(new Color(99,195,249));
    }

}
