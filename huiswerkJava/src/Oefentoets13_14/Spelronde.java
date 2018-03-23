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
public class Spelronde {

    private int schatting;
    private Knikker knikker;
    private Bakje bakje;

    public Spelronde(int aantal, int maat) {
        knikker = new Knikker(maat);
        bakje = new Bakje(knikker, aantal);
        schatting = -1;
    }

    public int getSchatting() {
        return schatting;
    }

    public Knikker getKnikker() {
        return knikker;
    }

    public Bakje getBakje() {
        return bakje;
    }

    public String toString() {
        if (schatting > -1) {
            if (controleerSchatting()) {
                return "SPELRONDE " + knikker.toString() + " - " + bakje.toString() + " - schatting: " + schatting + "(goed)";
            } else {
                return "SPELRONDE " + knikker.toString() + " - " + bakje.toString() + " - schatting: " + schatting + "(fout)";
            }
        } else {
            return "SPELRONDE " + knikker.toString() + " - " + bakje.toString();
        }
    }

    public void setSchatting(int schatting) {
        this.schatting = schatting;
    }

    public boolean controleerSchatting() {
        if (schatting == bakje.getAantal()) {
            return true;
        } else {
            return false;
        }
    }
}
