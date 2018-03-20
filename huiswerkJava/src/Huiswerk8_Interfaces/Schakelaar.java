/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Huiswerk8_Interfaces;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Justin Altena
 */
public class Schakelaar implements ActionListener {

    private boolean knopAan;

    public Schakelaar() {
        knopAan = true;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (knopAan) {
            System.out.println("Het licht is aan");
        } else {
            System.out.println("Het licht is uit");
        }
        knopAan = !knopAan;
    }

}
