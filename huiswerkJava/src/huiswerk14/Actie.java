/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package huiswerk14;

/**
 *
 * @author W10
 */
public class Actie {

    private Rol rol;
    private String gedrag;
    private String tekst;

    public Actie(Rol rol, String tekst) {
        this.rol = rol;
        this.tekst = tekst;
    }

    public Actie(Rol rol, String tekst, String gedrag) {
        this.rol = rol;
        this.tekst = tekst;
        this.gedrag = gedrag;
    }

}
