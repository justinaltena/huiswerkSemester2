/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oefenToets2;

import java.util.ArrayList;

/**
 *
 * @author W10
 */
public class School {

    private ArrayList<Lokaal> lokalen;

    public School() {
        lokalen = new ArrayList<>();
    }

    public void voegLokaalToe(Lokaal lokaal) {
        lokalen.add(lokaal);
    }

    public void printLokalen() {
        System.out.println("Er zijn " + lokalen.size() + " lokalen:");
        for (Lokaal lokaal : lokalen) {
            lokaal.printOmschrijving();
        }
    }

    public Lokaal zoekLokaal(String code) {
        for (Lokaal lokaal : lokalen) {
            if (lokaal.getCode() == code) {
                return lokaal;
            }
        }
        return null;
    }

    public ArrayList<Lokaal> zoekLokalen(String gebouw) {
        ArrayList<Lokaal> goedeLokalen = new ArrayList<>();
        for (Lokaal lokaal : lokalen) {
            if (lokaal.getCode().startsWith(gebouw)) {
                goedeLokalen.add(lokaal);
            }
        }
        return goedeLokalen;
    }
}
