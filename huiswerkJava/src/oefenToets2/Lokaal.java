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
public abstract class Lokaal {

    protected String code;

    public Lokaal(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public abstract void printOmschrijving();
}
