package com.softeem.app;

/**
 * 玩家类
 */
public class Hero extends Sprite{
    @Override
    public void init() {
        //设置图片
        setImg(ImgUtils.heroImgs[0]);
        //设置玩家初始坐标
        setX(300);
        setY(700);
    }

    @Override
    public void destroy() {

    }
}
