package view;

import javax.swing.*;
import java.awt.*;
import java.util.HashMap;

public class MainPanel extends JPanel {
    private HashMap<String, int[]> regionList = new HashMap<String, int[]>() {{
        put("경기 지역", new int[]{120, 140});
        put("강원도", new int[]{260, 120});
        put("충청북도", new int[]{190, 230});
        put("충청남도", new int[]{90, 280});
        put("전라북도", new int[]{130, 390});
        put("전라남도", new int[]{100, 480});
        put("경상북도", new int[]{300, 300});
        put("경상남도", new int[]{250, 450});
        put("제주도", new int[]{50, 680});
    }};

    public JLabel backgroundImage;

    public MainPanel() {
        // 배경 이미지
        setBackground(new Color(99, 195, 249));
        backgroundImage = new JLabel(new ImageIcon("src/main/java/images/map.png"));
        backgroundImage.setBounds(77, 140, 446, 729);
        this.add(backgroundImage);

        setVisible(true);
        regionList.forEach(this::newButton);
    }

    private void newButton(String buttonText, int[] point) {
        JButton btn = new JButton(buttonText);
        Font btnFont = new Font("pretendard", Font.BOLD, 15);
        btn.setFont(btnFont);
        btn.setBounds(point[0], point[1], 80, 40);
        backgroundImage.add(btn);
    }
}
