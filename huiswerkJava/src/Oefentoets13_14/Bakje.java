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
public class Bakje {

    private int aantal;
    private int lengte;

    public Bakje(Knikker k, int aantal) {
        this.aantal = aantal;
        lengte = aantal * k.getMaat();
    }

    public int getAantal() {
        return aantal;
    }

    public int getLengte() {
        return lengte;
    }

    @Override
    public String toString() {
        return "bakje (aantal: " + aantal + ", lengte: " + lengte + ")";
    }

}
