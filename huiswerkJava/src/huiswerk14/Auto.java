/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package huiswerk14;

/**
 *
 * @author W10
 */
public class Auto {

    private String merk;
    private String kenteken;
    private double prijs;
    private Persoon eigenaar;

    public void Auto(String m, String kt, double pr, Persoon p) {
        merk = m;
        kenteken = kt;
        prijs = pr;
        eigenaar = p;
    }

    public String print() {
        System.out.println("Auto " + merk + "-" + kenteken + "-"
                + prijs + " met eigenaar " + eigenaar.getNaam());
    }
}
