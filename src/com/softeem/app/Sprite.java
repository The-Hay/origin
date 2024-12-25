package com.softeem.app;

import java.awt.*;

/**
 * 游戏精灵类（玩家，敌人，道具，攻击特效）
 */
public abstract class Sprite {

    //图片元素
    private Image img;
    //坐标
    private int x, y;
    //尺寸
    private int w, h;
    //可见性(是否消失)
    private boolean died;

    public Sprite(){
        //对象构造时初始化精灵元素（设计模式之模版方法模式）
        init();
    }

    public Image getImg() {
        return img;
    }

    public void setImg(Image img) {
        this.img = img;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getW() {
        return w;
    }

    public void setW(int w) {
        this.w = w;
    }

    public int getH() {
        return h;
    }

    public void setH(int h) {
        this.h = h;
    }

    public boolean isDied() {
        return died;
    }

    public void setDied(boolean died) {
        this.died = died;
    }

    //初始化精灵元素
    public abstract void init();
    //销毁
    public abstract void destroy();


    //绘制精灵元素
    public void draw(Graphics g){
        g.drawImage(img, x, y, w, h, null);
    }
}
