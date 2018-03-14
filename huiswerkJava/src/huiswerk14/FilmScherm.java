/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package huiswerk14;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author W10
 */
public class FilmScherm extends JFrame implements ActionListener {

    private JLabel jlScenes;
    private JButton jbVoegSceneToe;

    public FilmScherm(Film film) {
        Film movie = film;
        setTitle(movie.getTitel());
        setSize(400, 300);
        setLayout(new FlowLayout());

        jlScenes = new JLabel("Aantal scenes: " + film.getScenario().getAantalScenes());
        add(jlScenes);
        jbVoegSceneToe = new JButton("Scene toevoegen");
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

}
