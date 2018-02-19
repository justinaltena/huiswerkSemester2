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
public class PersoonTest {

    public static void main(String[] args) {
        Persoon p1 = new Persoon("Hilde", 26);
        System.out.println(p1);
        Werknemer w1 = new Werknemer("Piet", 34, 1400.75);
        System.out.println(w1);
        Klant k1 = new Klant("Ashwin", 31, 75.50);
        System.out.println(k1);
        p1.jarig();
        System.out.println(p1);
        w1.jarig();
        System.out.println(w1);
        k1.jarig();
        System.out.println(k1);
        w1.verhoogSalaris(199.25);
        System.out.println(w1);
        k1.verhoogBudget(24.50);
        System.out.println(k1);
    }
}
