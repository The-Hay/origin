package com.softeem.app;

import javax.swing.*;
import java.awt.*;

/**
 * 游戏主面板：用于绘制界面中出现的任何游戏元素
 * 通常情况下，面板是要组装到窗体中使用，所以需要继承 JPanel
 */
public class GamePanel extends JPanel {
    // 背景图片(全局变量)
    private  Image bgImg;

    public GamePanel() {
        //获取图片
        bgImg = ImgUtils.maps[0];
     }

     /**
      *绘制组件到面板中
      */
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        //获取画笔对象（2d）
        Graphics2D g2d = (Graphics2D) g;
        //绘制背景图片
        g2d.drawImage(bgImg , 0 , 0 , Settings.Game_WIDTH, Settings.Game_HEIGHT, this);

    }
}
