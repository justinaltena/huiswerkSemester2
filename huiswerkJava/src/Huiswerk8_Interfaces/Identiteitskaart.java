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
public class Identiteitskaart extends ReisDocument {

    public Identiteitskaart(String naam, String bsn) {
        super.naam = naam;
        super.BSN = bsn;
    }

    @Override
    public String getDocumentType() {
        return "ID-kaart";
    }

    @Override
    String getGeldigeLanden() {
        return "Europa";
    }
}
