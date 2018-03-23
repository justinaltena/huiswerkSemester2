/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Oefentoets14_15;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author Justin Altena
 */
public class Hoofdscherm extends JFrame implements ActionListener {

    private JTextField jtfNaam;
    private JButton jbSpongebob;
    private JButton jbRed;
    private JButton jbMeerdereSpongebobs;
    private Knuffelbase kb;

    public Hoofdscherm(Knuffelbase kb) {
        this.kb = kb;
        setSize(800, 300);
        setLayout(new FlowLayout());
        setTitle("Knuffelbase");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        jtfNaam = new JTextField(20);
        add(jtfNaam);
        jbSpongebob = new JButton("voeg Spongebob toe");
        jbSpongebob.addActionListener(this);
        add(jbSpongebob);
        jbRed = new JButton("voeg Red toe");
        jbRed.addActionListener(this);
        add(jbRed);
        jbMeerdereSpongebobs = new JButton("voeg meerdere Spongebobs toe");
        jbRed.addActionListener(this);
        add(jbMeerdereSpongebobs);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == jbSpongebob && !jtfNaam.getText().isEmpty()) {
            Spongebob s = new Spongebob(jtfNaam.getText());
            kb.addKnuffel(s);
            kb.printLijst();
        } else if (e.getSource() == jbRed && !jtfNaam.getText().isEmpty()) {
            Red r = new Red(jtfNaam.getText());
            kb.addKnuffel(r);
            kb.printLijst();
        }
        if (e.getSource() == jbMeerdereSpongebobs) {
            System.out.println("Dit is een test");
            Dialoog dialoog = new Dialoog(this);
            dialoog.setVisible(true);

            if (dialoog.getToevoegen() == true) {
                int aantal = dialoog.getAantal();
                String naam = dialoog.getNaam();
                for (int i = 0; i < aantal; i++) {
                    kb.addKnuffel(new Spongebob(naam));
                }
            }

        }
    }

}
