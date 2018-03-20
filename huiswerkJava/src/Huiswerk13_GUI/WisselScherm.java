/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Huiswerk13_GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author Justin Altena
 */
public class WisselScherm extends JFrame implements ActionListener {

    private Wisselkoers wisselkoers;
    private JLabel euroLabel;
    private JLabel dollarLabel;
    private JTextField euroTf;
    private JTextField dollarTf;
    private JButton JbLinksNaarRechts;
    private JButton JbRechtsNaarLinks;

    public WisselScherm(Wisselkoers wisselkoers) {
        setTitle("Euro - Dollar converter");
        this.wisselkoers = wisselkoers;
        euroLabel = new JLabel("€");
        add(euroLabel);
        dollarLabel = new JLabel("$");
        add(dollarLabel);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
