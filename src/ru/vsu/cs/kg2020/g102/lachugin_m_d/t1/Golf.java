package ru.vsu.cs.kg2020.g102.lachugin_m_d.t1;

import java.awt.*;

public class Golf implements Drawable {
    private int x;
    private int y;
    private int weigth;
    private int height;
    private Graphics2D g;

    public Golf(Graphics g, int x, int y, int weigth, int height) {
        this.x = x;
        this.y = y;
        this.g = (Graphics2D) g;
        this.weigth = weigth;
        this.height = height;

    }

    public void draw(Graphics2D g) {
        body();

    }

    private void body() {
        g.setColor(Color.darkGray);
        Polygon p = new Polygon();
        double xPoz = 6.8;
        double xSr = xPoz / 2;
        double yPoz = 5.7;
        // основные точки корпуса
        double[] arrX = new double[]{1.8, 2.4, 2.5, 2.9, 3.0, 2.5, 2.3};
        double[] arrY = new double[]{0.2, 1.5, 1.7, 3.0, 3.8, 4.8, 4.9};
        //
        for (int i = 0; i < arrX.length; i++) {
            p.addPoint((int) (weigth / xPoz * (xSr - arrX[i])), (int) (height / yPoz * arrY[i]));
        }
        for (int i = arrX.length - 1; i > -1; i--) {
            p.addPoint((int) (weigth / xPoz * (xSr + arrX[i])), (int) (height / yPoz * arrY[i]));
        }


        g.drawPolygon(p);
    }

    private void logoW(int x, int y, int weigth, int height, Color Background, Color Logo) {
    }
}
