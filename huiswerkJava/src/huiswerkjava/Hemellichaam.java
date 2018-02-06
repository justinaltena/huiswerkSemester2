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
public class Hemellichaam {
    private String naam;
    private String type;
    private int tempMin;
    private int tempMax;
    
    public Hemellichaam(String naam, String type){
        this.naam = naam;
        this.type = type;
        tempMin = 0;
        tempMax = 0;
    }
    
    public Hemellichaam(String naam){
        this.naam = naam;
        this.type = "onbekend";
        tempMin = 0;
        tempMax = 0;
    }

    public String getNaam() {
        return naam;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        System.out.println("Het type van de planeet is veranderd van "+ this.type + " naar " + type);
        this.type = type;
    }
    

    @Override
    public String toString() {
        return naam + "(" + type + ')';
    }
    
    public void setTemperatuur(int minTemp, int maxTemp){
        this.tempMax = maxTemp;
        this.tempMin = minTemp;
    }
    
    public void setTemperatuur(int temp){
        this.tempMax = temp;
        this.tempMin = temp;
    }
    public void printTemperatuur(){
        if (this.tempMax == this.tempMin) {
            System.out.println("De temperatuur is ongeveer " + this.tempMax + " graden");
        } else {
            System.out.println("Het is minimaal " + tempMin + " graden, en maximaal " + tempMax + " graden"); 
        }
        
    }
}
