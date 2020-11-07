package ru.vsu.cs.kg2020.g102.lachugin_m_d.t1;

import java.awt.*;

public class Lattice implements Drawable {
    private int x;
    private int y;
    private int weight;
    private int height;
    private int arcWeight;
    private int arcHeight;
    private int lightX;
    private int lightY;

    public Lattice(int x, int y, int weight, int height, int arcWeight, int arcHeight, int lightX, int lightY) {
        this.x = x;
        this.y = y;
        this.weight = weight;
        this.height = height;
        this.arcWeight = arcWeight;
        this.arcHeight = arcHeight;
        this.lightX = lightX;
        this.lightY = lightY;
    }


    @Override
    public void draw(Graphics2D g) {
        g.fillRoundRect(x, y, weight, height, arcWeight, arcHeight);
        g.setColor(Color.GRAY);
        for (int i = y; i < y + height; i += height / 8)
            g.drawLine(x + arcWeight / 2, i, x + weight - arcWeight / 2, i);
        g.setColor(Color.darkGray);
        g.drawRoundRect(x, y, weight, height, arcWeight, arcHeight);
        g.setColor(Color.YELLOW);
        g.fillOval(x + lightX, lightY, height, height);
        g.fillOval(weight + x - lightX - height, lightY, height, height);
        g.setColor(Color.orange);
        g.drawOval(x + lightX, lightY, height, height);
        g.drawOval(weight + x - lightX - height, lightY, height, height);
    }


}
