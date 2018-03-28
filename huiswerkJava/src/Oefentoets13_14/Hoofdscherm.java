/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Oefentoets13_14;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author Justin Altena
 */
public class Hoofdscherm extends JFrame implements ActionListener {

    private Spelronde spelronde;
    private JTextField jtfSchatting;
    private JButton jbProbeer;
    private JButton jbVolgende;
    private TekenPanel tp;

    public Hoofdscherm(Spelronde spelronde) {
        this.spelronde = spelronde;
        setSize(800, 300);
        setTitle("Knikkers schatten");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        jtfSchatting = new JTextField(2);
        add(jtfSchatting);

        jbProbeer = new JButton("probeer");
        jbProbeer.addActionListener(this);
        add(jbProbeer);

        jbVolgende = new JButton("volgende ronde");
        jbVolgende.addActionListener(this);
        add(jbVolgende);

        tp = new TekenPanel(this.spelronde);
        add(tp);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == jbProbeer) {
            try {
                int input = Integer.parseInt(jtfSchatting.getText());
                spelronde.setSchatting(input);
            } catch (NumberFormatException nfe) {
                System.out.println("Invoer moet een getal zijn!");
            }
            System.out.println("opgave 3");
            System.out.println(spelronde);
        } else {
            TekenDialoog td = new TekenDialoog(this);
            td.setVisible(true);

            if (td.getIsMaakaan()) {
                spelronde = new Spelronde(td.getAantal(), td.getGrootte());
                tp.setSpelronde(spelronde);
            }
        }
        repaint();
    }
}
