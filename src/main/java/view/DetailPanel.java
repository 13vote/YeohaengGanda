package view;

import model.Model3;

import javax.swing.*;
import java.awt.*;

public class DetailPanel extends JPanel {

    private Model3 model3;
    private String[] content={"여행 설명여행 설명 여행 설명 여행 설명 여행 설명 여행 설명 여행 설명 여행 설명 여행 설명 여행 설명  "};
    private String[] name = {"경기도", "경상북도","경상남도","전라북도","전라남도"
            ,"충청북도","충청남도","강원도"};

    private ImageIcon[] images= {
            new ImageIcon("src/main/java/images/apple.jpg"),
            new ImageIcon("src/main/java/images/banana.jpg")
    };


    public DetailPanel() {
        // 패널 c

        setLayout(null);
        add(new JLabel("여행지 이름")).setBounds(18,24,120,30);
        JLabel j1 = new JLabel("여행지 설명 : "+content[0]);
        j1.setVerticalAlignment(JLabel.TOP);
        add(j1).setBounds(18,88,491,391);

        // 메뉴바


        Color c1 = new Color(99,195,249);
        setBackground(c1);


        for(int i=0; i<images.length; i++) {
            add(new JLabel(images[i])).setBounds(18+150*i,528,120,120);

        }

        setVisible(true);


    }




    public static void main(String[] args) {
        new AppView();
    }
}
