package view;

import javax.swing.*;

public class MenuBar extends JMenuBar {
    public MenuBar() {
        JMenu screenMenu = new JMenu("메뉴");

        screenMenu.add(new JMenuItem("도움말"));
        screenMenu.addSeparator();
        screenMenu.add(new JMenuItem("프로그램 종료"));
        add(screenMenu);
    }
}
