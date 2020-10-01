package ru.vsu.cs.kg2020.g102.lachugin_m_d.t1;

import javax.swing.*;
import java.awt.*;

public class DrawPanel extends JPanel {

    @Override
    public void paint(Graphics g) {
        Graphics2D gr = (Graphics2D) g;
//      height * 1.2 = weight
        Golf golf = new Golf(gr, 10, 10, 720, 600);
        golf.draw(gr);

    }
}

