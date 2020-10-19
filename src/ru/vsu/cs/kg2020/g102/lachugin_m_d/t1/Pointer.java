package ru.vsu.cs.kg2020.g102.lachugin_m_d.t1;

import java.awt.*;

public class Pointer {
    private int weigth, height, xPoz, yPoz, xSr, x, y;

    public Pointer(int x, int y, int weight, int height, int xPoz, int yPoz) {
        this.weigth = weight;
        this.height = height;
        this.xPoz = xPoz;
        this.yPoz = yPoz;
        this.x = x;
        this.y = y;
        this.xSr = xPoz / 2;
    }

    public int getXer(double t) {
        return x + (int) (weigth / xPoz * (xSr - t));
    }

    public int getYer(double t) {
        return y + (int) (height / yPoz * t);
    }
}
