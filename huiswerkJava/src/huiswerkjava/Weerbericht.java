/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package huiswerkjava;

/**
 *
 * @author Justin Altena
 */
public class Weerbericht {
    private double temperatuur;
    private int windkracht;
    private String windrichting;
    private boolean bewolking;
    private boolean neerslag;
    private boolean zon;

    public Weerbericht(double temperatuur, int windkracht, String windrichting) {
        this.temperatuur = temperatuur;
        this.windkracht = windkracht;
        this.windrichting = windrichting;
        this.bewolking = false;
        this.neerslag = false;
        this.zon = zon;
    }
    
    
}
