/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Huiswerk8_Interfaces;

import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author Justin Altena
 */
public class SchermMetKnop {

    public static void main(String[] args) {
        JFrame scherm = new JFrame("piep");
        scherm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        scherm.setSize(300, 300);
        JButton knop = new JButton("klik hier");
        // hier komt de code voor de actionlistener in opgave b
        Schakelaar s = new Schakelaar();
        knop.addActionListener(s);
        scherm.add(knop);
        scherm.setVisible(true);
    }
}
