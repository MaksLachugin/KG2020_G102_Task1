package ru.vsu.cs.kg2020.g102.lachugin_m_d.t1;

import java.awt.*;
import java.awt.geom.AffineTransform;
import java.awt.geom.PathIterator;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;

public class Golf implements Drawable {
    private int x;
    private int y;
    private int weigth;
    private int height;
    private Graphics2D g;

    public Golf(Graphics g, int x, int y, int weigth, int height) {
        // height * 1.2 = weight
        this.x = x;
        this.y = y;
        this.g = (Graphics2D) g;
        this.weigth = weigth;
        this.height = height;

    }

    public void draw(Graphics2D g) {
        g.drawRect(x, y, weigth, height);
        g.setStroke(new BasicStroke(3));

        body();

    }

    private void body() {
        g.setColor(Color.darkGray);
        Polygon p = new Polygon();
        double xPoz = 140;
        double xSr = xPoz / 2;
        double yPoz = 122;
        // основные точки корпуса
        int[] arrX = new int[]{28, 35, 38, 41, 43, 49, 63, 67};
        int[] arrY = new int[]{2, 3, 4, 7, 11, 25, 57, 66};
        //
        for (int i = 0; i < arrX.length; i++) {
            p.addPoint(x + (int) (weigth / xPoz * (xSr - arrX[i])), y + (int) (height / yPoz * arrY[i]));
        }
        for (int i = arrX.length - 1; i > -1; i--) {
            p.addPoint(x + (int) (weigth / xPoz * (xSr + arrX[i])), y + (int) (height / yPoz * arrY[i]));
        }
        g.drawPolygon(p);
//        g.drawRoundRect(x + (int) (weigth / xPoz * (xSr - arrX[0] - 0.05)), y + (int) (height / yPoz * arrY[0]), (int) ((weigth / xPoz * (xSr + arrX[0] + 0.02)) - (weigth / xPoz * (xSr - arrX[0] - 0.02))), 20, 20, 20);
    }

    private void logoW(int x, int y, int weigth, int height, Color Background, Color Logo) {
    }
}
