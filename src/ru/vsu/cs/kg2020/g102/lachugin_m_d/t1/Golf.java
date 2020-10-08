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
        double[] arrX = new double[]{23, 28, 33, 36, 40, 41, 42, 43, 45, 49, 52.5, 56, 59, 63, 64.5, 65.5, 66.5, 67, 67.5,68, 67.8, 67.5, 67, 66};
        double[] arrY = new double[]{2, 2.5, 3, 3.5, 6, 7, 9.5, 12, 16.5, 25.5, 33.5, 41.5, 48, 57, 62,64.5,66.5,68, 72.5, 76, 78, 81,84, 86};
        drawMirror.setPolygon(arrX, arrY);
        drawMirror.draw(g);
//        windshield();
//        hood();


    }

    private void windshield() {
        double[] arrX = new double[]{28, 35, 37, 40, 42, 49, 50, 49};
        double[] arrY = new double[]{6, 7, 8, 10, 14, 31, 35, 36};
        drawMirror.setColor(Color.cyan);
        drawMirror.setPolygon(arrX, arrY);
        drawMirror.draw(g);
    }

    private void hood() {
        double[] arrX = new double[]{49, 51, 59, 60};
        double[] arrY = new double[]{40, 42, 63, 68};
        drawMirror.setColor(Color.green);
        drawMirror.setPolygon(arrX, arrY);
        drawMirror.draw(g);
        arrX = new double[]{10, 12};
        arrY = new double[]{};

    }

}
