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

    public Hoofdscherm(Spelronde spelronde) {
        spelronde = this.spelronde;
        setSize(800, 300);
        setTitle("Knikkers schatten");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        jtfSchatting = new JTextField(10);
        add(jtfSchatting);
        jbProbeer = new JButton("probeer");
        add(jbProbeer);
        jbVolgende = new JButton("volgende ronde");
        add(jbVolgende);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == jbProbeer) {
            int schatting;
            try {
                schatting = Integer.parseInt(jtfSchatting.getText());
                spelronde.setSchatting(schatting);
            } catch (NumberFormatException nfe) {
                schatting = 0;
            }
        }
    }
}
