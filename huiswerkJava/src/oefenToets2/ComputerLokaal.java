/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oefenToets2;

/**
 *
 * @author W10
 */
public class ComputerLokaal extends Lokaal {

    private int aantalComputers;

    public ComputerLokaal(String code, int aantalComputers) {
        super(code);
        this.aantalComputers = aantalComputers;
    }

    @Override
    public void printOmschrijving() {
        System.out.println("Computerlokaal " + super.getCode() + " met " + aantalComputers + " computers");
    }

}
