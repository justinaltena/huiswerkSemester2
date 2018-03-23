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
public class Dialoog extends JDialog implements ActionListener {

    private JTextField jtfNaam;
    private JTextField jtfAantal;
    private JButton jbAnnuleren;
    private JButton jbVoegToe;
    private boolean toevoegen;

    public Dialoog(JFrame frame) {
        super(frame, true);
        setLayout(new FlowLayout());
        setSize(400, 300);

        jtfNaam = new JTextField(10);
        add(jtfNaam);

        jtfAantal = new JTextField(4);
        add(jtfAantal);

        jbAnnuleren = new JButton("Annuleren");
        jbAnnuleren.addActionListener(this);
        add(jbAnnuleren);

        jbVoegToe = new JButton("Voeg toe");
        jbVoegToe.addActionListener(this);
        add(jbVoegToe);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == jbVoegToe) {
            toevoegen = true;
        } else {
            toevoegen = false;
        }
        setVisible(false);
    }

    public String getNaam() {
        return jtfNaam.getText();
    }

    public int getAantal() {
        try {
            int aantal = Integer.parseInt(jtfAantal.getText());
            return aantal;
        } catch (NumberFormatException nfe) {
            return 0;
        }
    }

    public boolean getToevoegen() {
        return toevoegen;
    }

}
