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
public class Klant extends Persoon {

    private double budget;

    public Klant(String naam, int leeftijd, double budget) {
        super(naam, leeftijd);
        this.budget = budget;
    }

    @Override
    public String toString() {
        return super.toString() + " (budget " + budget + ")";
    }

    public void verhoogBudget(double bedrag) {
        this.budget += bedrag;
    }
}
