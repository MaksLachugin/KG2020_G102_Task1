package ru.vsu.cs.kg2020.g102.lachugin_m_d.t1;

import javax.swing.*;
import java.awt.*;

public class DrawPanel extends JPanel {

    @Override
    public void paint(Graphics g) {
        Graphics2D gr = (Graphics2D) g;
//      height * 1.2 = weight
        int height = 800;
        Golf golf = new Golf(0, 0, (int)(1.2 * height), height, Color.red);
        golf.draw(gr);

    }
}

