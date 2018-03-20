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
public class Rijbewijs implements LegitimatieBewijs {

    private String categorie;
    private String naam;
    private String BSN;

    public Rijbewijs(String naam, String BSN, String categorie) {
        this.naam = naam;
        this.BSN = BSN;
        this.categorie = categorie;
    }

    @Override
    public String getDocumentType() {
        return "Rijbewijs";
    }

    @Override
    public String getNaam() {
        return naam;
    }

    @Override
    public String getBSN() {
        return BSN;
    }

    public String getCategorie() {
        return categorie;
    }

    @Override
    public String toString() {
        return "Rijbewijs{" + "categorie=" + categorie + ", naam=" + naam + ", BSN=" + BSN + '}';
    }

}
