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
public class Persoon {

    private String naam;
    private Rijbewijs rijbewijs;
    private ReisDocument reisdocument;

    public Persoon(Rijbewijs rijbewijs) {
        this.rijbewijs = rijbewijs;
        this.naam = rijbewijs.getNaam();
    }

    public Persoon(ReisDocument reisDocument) {
        this.reisdocument = reisDocument;
        this.naam = reisDocument.getNaam();
    }

    public void setRijbewijs(Rijbewijs rijbewijs) {
        this.rijbewijs = rijbewijs;
    }

    public void setReisdocument(ReisDocument reisdocument) {
        this.reisdocument = reisdocument;
    }

    @Override
    public String toString() {
        return "Persoon{" + "naam=" + naam + ", rijbewijs=" + rijbewijs + ", reisdocument=" + reisdocument + '}';
    }

    public LegitimatieBewijs getLegitimatieBewijs() {
        if (rijbewijs != null) {
            return rijbewijs;
        } else if (reisdocument != null) {
            return reisdocument;
        } else {
            return null;
        }
    }

    public void toonOverzicht() {
        System.out.println(reisdocument.getNaam() + ", BSN: " + reisdocument.getBSN());
        if (rijbewijs != null) {
            System.out.println(rijbewijs);
        }
        if (reisdocument != null) {
            System.out.println(reisdocument);
        }
        if (reisdocument == null && rijbewijs == null) {
            System.out.println("Kan zich niet legitimeren");
        }
    }
}
