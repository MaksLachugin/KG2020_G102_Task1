package ru.vsu.cs.kg2020.g102.lachugin_m_d.t1;

import java.awt.*;

public class drawDuplicationPolygon implements Drawable {

    private Polygon[] p;
    private Color color = Color.DARK_GRAY;
    private int weigth, height, xPoz, yPoz, xSr, x, y;

    public drawDuplicationPolygon(int x, int y, int weight, int height, int xPoz, int yPoz) {
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

    public void setPolygon(int[] arrX, int[] arrY) {
        Polygon p1 = new Polygon();

        for (int i = 0; i < arrX.length; i++) {
            p1.addPoint(x + (int) (weigth / xPoz * (xSr - arrX[i])), y + (int) (height / yPoz * arrY[i]));
        }

        Polygon p2 = new Polygon();
        for (int i = arrX.length - 1; i > -1; i--) {
            p2.addPoint(x + (int) (weigth / xPoz * (xSr + arrX[i])), y + (int) (height / yPoz * arrY[i]));
        }

    }

    @Override
    public void draw(Graphics2D g) {
        g.setColor(this.color);

    }
}
