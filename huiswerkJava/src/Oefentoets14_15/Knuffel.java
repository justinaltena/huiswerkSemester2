/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Oefentoets14_15;

/**
 *
 * @author Justin Altena
 */
public class Knuffel {

    private String naam;

    public Knuffel(String naam) {
        this.naam = naam;
    }

    @Override
    public String toString() {
        return "Ik ben knuffel " + naam;
    }

}
