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
public class Werknemer extends Persoon {

    private double salaris;

    public Werknemer(String naam, int leeftijd, double salaris) {
        super(naam, leeftijd);
        this.salaris = salaris;
    }

    @Override
    public String toString() {
        return super.toString() + " (salaris " + salaris + ")";
    }

    public void verhoogSalaris(double bedrag) {
        this.salaris += bedrag;
    }

}
