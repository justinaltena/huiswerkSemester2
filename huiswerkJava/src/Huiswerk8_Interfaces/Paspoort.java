/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Huiswerk8_Interfaces;

/**
 *
 * @author Justin Altena
 */
public class Paspoort extends ReisDocument {

    public Paspoort(String naam, String bsn) {
        super.naam = naam;
        super.BSN = bsn;
    }

    @Override
    public String getDocumentType() {
        return "Paspoort";
    }

    @Override
    String getGeldigeLanden() {
        return "De hele wereld";
    }

}
