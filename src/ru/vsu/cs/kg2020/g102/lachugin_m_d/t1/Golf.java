package ru.vsu.cs.kg2020.g102.lachugin_m_d.t1;

import java.awt.*;


public class Golf implements Drawable {
    private int x;
    private int y;
    private int weigth;
    private int height;
    private Graphics2D g;
    private Color color;
    private drawMirrorPolygon drawMirror;
    private drawMirrorDuo drawMirrorDuo;

    public Golf(int x, int y, int weigth, int height, Color color) {
        // height * 1.2 = weight
        this.x = x;
        this.y = y;
        this.weigth = weigth;
        this.height = height;
        this.color = color;
        int xPoz = 140;
        int yPoz = 122;
        drawMirror = new drawMirrorPolygon(x, y, weigth, height, xPoz, yPoz);
        drawMirrorDuo = new drawMirrorDuo(x, y, weigth, height, xPoz, yPoz);
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
        double[] arrX = new double[]{23, 28, 33, 36, 40, 41, 42, 43, 45, 49, 52.5, 56, 59, 63, 64.5, 65.5, 66.5, 67, 67.5, 68, 67.8, 67.5, 67, 66, 59, 57, 49, 42, 35, 28};
        double[] arrY = new double[]{2, 2.5, 3, 3.5, 6, 7, 9.5, 12, 16.5, 25.5, 33.5, 41.5, 48, 57, 62, 64.5, 66.5, 68, 72.5, 76, 78, 81, 84, 86, 101, 103, 105, 106, 107, 107.5};
        drawMirror.setPolygon(arrX, arrY);
        drawMirror.draw(g);
        windshield();
        hood();


    }

    private void windshield() {
        double[] arrX = new double[]{7, 14, 21, 28, 35, 36, 37, 38, 39, 40.5, 41.5, 48, 49, 49.5, 49, 48, 47, 14};
        double[] arrY = new double[]{5.5, 5.7, 5.8, 6, 6.5, 6.7, 7, 7.7, 9, 11, 14, 30, 32.5, 34, 35, 36, 36.5, 37};
        drawMirror.setColor(Color.cyan);
        drawMirror.setPolygon(arrX, arrY);
        drawMirror.draw(g);
    }

    private void hood() {
        double[] arrX = new double[]{7, 28, 30, 48, 50, 54, 57.5, 60, 60.5, 60.5,};
        double[] arrY = new double[]{39.5, 40, 39, 39, 40, 49, 56, 63, 65, 69,};
        drawMirror.setColor(Color.green);
        drawMirror.setPolygon(arrX, arrY);
        drawMirror.draw(g);
        sieve();
    }

    private void sieve() {
        double[] arrX = new double[]{4.2, 4.9, 5.2, 4.5};
        double[] arrY = new double[]{41, 41, 42.5 , 42.5};
        drawMirrorDuo.setColor(Color.BLACK);
        drawMirrorDuo.setPolygon(arrX, arrY);
        drawMirrorDuo.draw(g);

    }
    private void frontBumper() {
        double[] arrX = new double[]{};
        double[] arrY = new double[]{};
        drawMirror.setColor(Color.cyan);
        drawMirror.setPolygon(arrX, arrY);
        drawMirror.draw(g);
    }


}
