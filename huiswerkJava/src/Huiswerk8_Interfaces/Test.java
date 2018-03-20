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
public class Test {

    public static void main(String[] args) {
        Rijbewijs r1 = new Rijbewijs("a", "Justin Altena", "sda");
        System.out.println(r1.getCategorie());
        System.out.println(r1.getNaam());

        Persoon persoon1 = new Persoon(new Paspoort("Hannie", "44320098"));
        Persoon persoon2 = new Persoon(new Identiteitskaart("Jennie", "44320098"));
        Persoon persoon3 = new Persoon(new Rijbewijs("Tonnie", "44320098", "BE"));

        persoon1.toonOverzicht();
    }
}
