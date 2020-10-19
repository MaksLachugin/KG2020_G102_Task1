package ru.vsu.cs.kg2020.g102.lachugin_m_d.t1;

import java.awt.*;

public class drawMirrorDuo implements Drawable {
    private Polygon[] p = new Polygon[20];
    private Polygon p1, p2;
    private Color color = Color.GRAY;
    private int weigth, height, xPoz, yPoz, xSr, x, y;

    public drawMirrorDuo(int x, int y, int weight, int height, int xPoz, int yPoz) {

        this.weigth = weight;
        this.height = height;
        this.xPoz = xPoz;
        this.yPoz = yPoz;
        this.x = x;
        this.y = y;
        this.xSr = xPoz / 2;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void setPolygon(double[] arrX, double[] arrY) {
        manyPolygon(arrX, arrY, 10);

    }

    private void manyPolygon(double[] arrX, double[] arrY, int colvo) {

        for (int t = 0; t < colvo; t++) {
            this.p1 = new Polygon();
            this.p2 = new Polygon();

            for (int i = 0; i < arrX.length; i++) {
                p1.addPoint(x + (int) (weigth / xPoz * (xSr - arrX[i] - t)), y + (int) (height / yPoz * arrY[i]));
            }
            for (int i = arrX.length - 1; i > -1; i--) {
                p2.addPoint(x + (int) (weigth / xPoz * (xSr + arrX[i] + t)), y + (int) (height / yPoz * arrY[i]));
            }
            p[t*2+1] = p1;
            p[t*2] = p2;
        }
    }


    @Override
    public void draw(Graphics2D g) {
        g.setColor(color);
        for (Polygon pol: p
             ) {
            if (p != null)
            g.drawPolygon(pol);
        }


    }
}
