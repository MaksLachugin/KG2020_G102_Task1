package ru.vsu.cs.kg2020.g102.lachugin_m_d.t1;

import java.awt.*;

public class golf {
    public static void drawGolf(Graphics2D g, int weigth, int height) {
        g.fillRect(0, 0, weigth, height);
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
