/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Oefentoets13_14;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author W10
 */
public class TekenPanel extends JPanel {

    private Spelronde spelronde;

    public TekenPanel(Spelronde ronde) {
        this.spelronde = ronde;
        setPreferredSize(new Dimension(700, 150));
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        int maat = spelronde.getKnikker().getMaat();
        int lengte = spelronde.getBakje().getLengte();
        System.out.println("paintcomponent: " + maat + " " + lengte + " " + spelronde.getSchatting());
        g.setColor(Color.BLUE);
        g.fillOval(0, 0, maat, maat);

        g.setColor(Color.BLACK);
        g.fillRect(maat + 5, 0, lengte, maat);

        if (spelronde.controleerSchatting()) {
            g.setColor(Color.green);
        } else {
            g.setColor(Color.blue);
        }
        int x = maat + 5;
        for (int i = 0; i < spelronde.getSchatting(); i++) {
            g.fillOval(x, 0, maat, maat);
            x += maat;
        }
    }

    public void setSpelronde(Spelronde spelronde) {
        this.spelronde = spelronde;
    }

}
