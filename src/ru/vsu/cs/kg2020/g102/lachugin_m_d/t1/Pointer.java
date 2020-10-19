package ru.vsu.cs.kg2020.g102.lachugin_m_d.t1;

import java.awt.*;

public class Pointer {
    private int weigth, height, xPoz, yPoz, xSr, x, y;

    public Pointer(int weigth, int height, int xPoz, int yPoz, int xSr, int x, int y) {
        this.weigth = weigth;
        this.height = height;
        this.xPoz = xPoz;
        this.yPoz = yPoz;
        this.xSr = xSr;
        this.x = x;
        this.y = y;
    }

    public int getXer(double t){
        return x + (int) (weigth / xPoz * (xSr  - t));
    }

    public int getYer(double t){
        return y + (int) (height / yPoz * t);
    }
}
