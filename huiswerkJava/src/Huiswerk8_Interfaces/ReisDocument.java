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
public abstract class ReisDocument implements LegitimatieBewijs {

    protected String naam;
    protected String BSN;

    abstract String getGeldigeLanden();

    @Override
    public String toString() {
        return "ReisDocument{" + "naam=" + naam + ", BSN=" + BSN + "type: " + getDocumentType() + " geldig in " + getGeldigeLanden();
    }

    public String getNaam() {
        return naam;
    }

    public String getBSN() {
        return BSN;
    }

}
