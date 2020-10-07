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
    private Color color;
    private drawMirrorPolygon drawMirror;

    public Golf(int x, int y, int weigth, int height, Color color) {
        // height * 1.2 = weight
        this.x = x;
        this.y = y;
        this.weigth = weigth;
        this.height = height;
        this.color = color;
        int xPoz = 140;
        int yPoz = 122;
        drawMirror = new drawMirrorPolygon(g, x, y, weigth, height, xPoz, yPoz);
        drawMirror.setColor(color);
    }

    public void draw(Graphics2D g) {
        this.g = (Graphics2D) g;
        g.drawRect(x, y, weigth, height);
        g.setStroke(new BasicStroke(3));

        body();

    }

    private void body() {

        // основные точки корпуса
        int[] arrX = new int[]{28, 35, 38, 41, 43, 49, 63, 67, 68, 68, 67, 63, 58};
        int[] arrY = new int[]{2, 3, 4, 7, 11, 25, 57, 66, 70, 83, 85, 87, 88};
        drawMirror.setPolygon(arrX, arrY);
        drawMirror.draw(g);
        windshield();
        hood();


    }

    private void windshield() {
        int[] arrX = new int[]{28, 35, 37, 40, 42, 49, 50, 49};
        int[] arrY = new int[]{6, 7, 8, 10, 14, 31, 35, 36};
        drawMirror.setColor(Color.cyan);
        drawMirror.setPolygon(arrX, arrY);
        drawMirror.draw(g);
    }

    private void hood() {
        int[] arrX = new int[]{49, 51, 59, 60};
        int[] arrY = new int[]{40, 42, 63, 68};
        drawMirror.setColor(Color.green);
        drawMirror.setPolygon(arrX, arrY);
        drawMirror.draw(g);
        arrX = new int[]{10, 12};
        arrY = new int[]{};

    }

}
