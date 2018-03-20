/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oefenToets1;

import java.time.DayOfWeek;

/**
 *
 * @author Justin Altena
 */
public class MeldingTest {
    public static void main(String[] args) {
        Melding m1 = new Melding("De kroketten zijn op!");
        System.out.println(m1);
        int niveau = 2;
        Melding m2 = new Melding("De kantine is gesloten.", niveau);
        System.out.println(m2);
        Melding melding = new Melding("De kroketten zijn op!", 3);
        System.out.println(melding);
        melding.setAangepasteDag(DayOfWeek.FRIDAY);
        System.out.println(melding);
    }
}
