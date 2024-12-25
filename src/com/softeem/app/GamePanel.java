package com.softeem.app;

import javax.swing.*;
import java.awt.*;

/**
 * 游戏主面板：用于绘制界面中出现的任何游戏元素
 * 通常情况下，面板是要组装到窗体中使用，所以需要继承 JPanel
 */
public class GamePanel extends JPanel {

    public GamePanel() {
        // 设置背景颜色
        setBackground(Color.blue);
     }
}
