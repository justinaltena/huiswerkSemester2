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
public abstract class TVProgramma {

    private String titel;
    private int tijdsduur;
    private String zender;

    public TVProgramma(String titel, int tijdsduur, String zender) {
        this.titel = titel;
        this.tijdsduur = tijdsduur;
        this.zender = zender;
    }

    @Override
    public String toString() {
        return titel + "(" + tijdsduur + " min)" + " op zender " + zender;
    }

    public String getTitel() {
        return titel;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }

    public int getTijdsduur() {
        return tijdsduur;
    }

    public void setTijdsduur(int tijdsduur) {
        this.tijdsduur = tijdsduur;
    }

    public String getZender() {
        return zender;
    }

    public void setZender(String zender) {
        this.zender = zender;
    }

}
