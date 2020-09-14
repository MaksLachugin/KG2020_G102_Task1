package ru.vsu.cs.kg2020.g102.lachugin_m_d.t1;

import java.awt.*;

public class Golf implements Drawable {
    private int weigth;
    private int height;

    public Golf(int weigth, int height) {
        this.weigth = weigth;
        this.height = height;
    }

    public void draw(Graphics2D g) {
        g.setColor(Color.blue);
        logoW(g, 10, 10, 500, 500, Color.GRAY, Color.LIGHT_GRAY);
    }

    public static void logoW(Graphics2D g, int x, int y, int weigth, int height, Color Background, Color Logo) {
        g.setColor(Logo);
        g.fillOval(x, y, weigth, height);
        g.setColor(Background);
        g.fillOval(x + weigth / 10, y + height / 10, (int) (weigth * 0.8), (int) (height * 0.8));
        g.setColor(Color.blue);
        g.drawLine(x + weigth / 10, y + height / 10, x + weigth, y + height / 10);
        g.drawLine(x + weigth / 10, y + height / 10, x + weigth / 10, y + height);
    }
}
