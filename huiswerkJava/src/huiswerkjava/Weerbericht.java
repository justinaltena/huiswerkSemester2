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

    public Weerbericht(double temperatuur, int windkracht, String windrichting, boolean bewolking, boolean neerslag, boolean zon) {
        this.temperatuur = temperatuur;
        this.windkracht = windkracht;
        this.windrichting = windrichting;
        this.bewolking = bewolking;
        this.neerslag = neerslag;
        this.zon = zon;
    }
    
    

    public void setTemperatuur(double temperatuur) {
        this.temperatuur = temperatuur;
    }

    public void setWindkracht(int windkracht) {
        this.windkracht = windkracht;
    }

    public void setWindrichting(String windrichting) {
        this.windrichting = windrichting;
    }

    public void setBewolking(boolean bewolking) {
        this.bewolking = bewolking;
    }

    public void setNeerslag(boolean neerslag) {
        this.neerslag = neerslag;
    }

    public void setZon(boolean zon) {
        this.zon = zon;
    }

    public double getTemperatuur() {
        return temperatuur;
    }

    public int getWindkracht() {
        return windkracht;
    }

    public String getWindrichting() {
        return windrichting;
    }

    @Override
    public String toString() {
        if(!bewolking & !zon & !neerslag){
            return "Weerbericht - " + "temperatuur=" + temperatuur + ", windkracht=" + windkracht + ", windrichting=" + windrichting + ", bewolking=" + bewolking + ", neerslag=" + neerslag + ", zon=" + zon + '}'; 
        }
        return "Weerbericht - " + "temperatuur=" + temperatuur + ", windkracht=" + windkracht + ", windrichting=" + windrichting + ", bewolking=" + bewolking + ", neerslag=" + neerslag + ", zon=" + zon + '}';
    }
    
    
    
}
