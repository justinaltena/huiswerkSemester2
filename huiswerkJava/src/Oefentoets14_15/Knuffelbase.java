/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Oefentoets14_15;

import java.util.ArrayList;

/**
 *
 * @author Justin Altena
 */
public class Knuffelbase {

    private ArrayList<Knuffel> lijst;

    public Knuffelbase() {
        lijst = new ArrayList<>();
    }

    public void addKnuffel(Knuffel knuffel) {
        lijst.add(knuffel);
    }

    public void printLijst() {
        System.out.println("*** lijst met knuffels ***");
        for (Knuffel knuffel : lijst) {
            System.out.println(knuffel);
        }
    }

    public ArrayList<Knuffel> getLijst() {
        return lijst;
    }

}
