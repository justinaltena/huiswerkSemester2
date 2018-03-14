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
public class LesLokaal extends Lokaal {

    public LesLokaal(String code) {
        super(code);
    }

    @Override
    public void printOmschrijving() {
        System.out.println("Leslokaal " + super.getCode());
    }

}
