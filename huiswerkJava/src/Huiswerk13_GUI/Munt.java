/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Huiswerk13_GUI;

/**
 *
 * @author Justin Altena
 */
public class Munt {

    private String naam;
    private String teken;

    public Munt(String naam, String teken) {
        this.naam = naam;
        this.teken = teken;
    }

    public String getNaam() {
        return naam;
    }

    public String getTeken() {
        return teken;
    }

}
