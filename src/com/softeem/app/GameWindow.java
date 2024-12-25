package com.softeem.app;

import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * 游戏窗口
 * 继承：子类继承父类之后，父类中的非私有元素子类都可以直接使用，同时还可以扩展
 */
public class GameWindow extends JFrame {
    //构造器，创建窗口时执行一些初始化操作
    public GameWindow() {
        setTitle(Settings.Game_TITLE);
        //设置窗口大小
        setSize(Settings.Game_WIDTH, Settings.Game_HEIGHT);
        //设置窗口默认关闭按钮不做任何处理
        setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
        //为关闭按钮绑定事件
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                //弹出确认对话框
                int i = JOptionPane.showConfirmDialog(GameWindow.this, "确定退出游戏吗？", "退出游戏", JOptionPane.YES_NO_OPTION);
                if (i == 0) {
                    //点击了确定按钮，关闭窗口
                    System.exit(0);
                }
            }
        });
    }
    public void startGame(){
        //显示窗口
        setVisible(true);
    }
}
