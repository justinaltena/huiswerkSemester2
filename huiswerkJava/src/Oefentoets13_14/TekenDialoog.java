/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Oefentoets13_14;

import java.awt.FlowLayout;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author W10
 */
public class TekenDialoog extends JDialog implements ActionListener {

    private JTextField jtfAantal;
    private JTextField jtfGrootte;
    private JButton jbMaakAan;

    private boolean isMaakAanKnop;

    public TekenDialoog(JFrame frame) {
        super(frame, true);
        setTitle("titel");
        setSize(350, 200);
        setLayout(new FlowLayout());

        add(new JLabel("aantal"));
        jtfAantal = new JTextField(20);
        add(jtfAantal);

        add(new JLabel("grootte"));
        jtfGrootte = new JTextField(20);
        add(jtfGrootte);

        jbMaakAan = new JButton("Maak aan");
        jbMaakAan.addActionListener(this);
        add(jbMaakAan);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == jbMaakAan) {
            System.out.println("Maak aan knop ingedrukt");
            isMaakAanKnop = true;
        } else {
            isMaakAanKnop = false;
        }
        System.out.println(isMaakAanKnop);
        setVisible(false);
    }

    public boolean getIsMaakaan() {
        return isMaakAanKnop;
    }

    public int getAantal() {
        return Integer.parseInt(jtfAantal.getText());
    }

    public int getGrootte() {
        return Integer.parseInt(jtfGrootte.getText());
    }
}
