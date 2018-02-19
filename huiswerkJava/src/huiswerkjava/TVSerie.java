/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package huiswerkjava;

/**
 *
 * @author W10
 */
public class TVSerie extends TVProgramma {

    private String regisseur;
    private int afleveringsnummer;

    public TVSerie(String titel, int tijdsduur, String zender, String regisseur, int afleveringsnummer) {
        super(titel, tijdsduur, zender);
        this.regisseur = regisseur;
        this.afleveringsnummer = afleveringsnummer;
    }

    @Override
    public String toString() {
        return super.toString() + "geregiseerd door:" + regisseur + ", afleveringsnummer: " + afleveringsnummer;
    }
}
