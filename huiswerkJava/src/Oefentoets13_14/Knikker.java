/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Oefentoets13_14;

/**
 *
 * @author Justin Altena
 */
public class Knikker {

    private int maat;

    public Knikker(int maat) {
        this.maat = maat;
    }

    public int getMaat() {
        return maat;
    }

    public String toString() {
        return "knikker (maat: " + maat + ")";
    }
}
