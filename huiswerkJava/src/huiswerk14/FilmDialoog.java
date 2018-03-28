/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package huiswerk14;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author W10
 */
public class FilmDialoog extends JDialog implements ActionListener {

    private JTextField jtfBeschrijving;
    private JTextField jtfTijd;
    private JButton jbOk;
    private JButton jbAnnuleren;

    public FilmDialoog(JFrame frame) {
        super(frame, true);
        setTitle("Scene toevoegen");
        setSize(500, 500);
        setLayout(new GridLayout(3, 2));
        JLabel jlBeschrijving = new JLabel("Beschrijving: ");
        add(jlBeschrijving);
        jtfBeschrijving = new JTextField();
        add(jtfBeschrijving);
        JLabel jlTijd = new JLabel("Tijd: ");
        add(jlTijd);
        jtfTijd = new JTextField();
        add(jtfTijd);
        jbOk = new JButton("Ok");
        jbOk.addActionListener(this);
        add(jbOk);
        jbAnnuleren = new JButton("Annuleren");
        jbAnnuleren.addActionListener(this);
        add(jbAnnuleren);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == jbOk) {

        }
    }

}
