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
public class Talkshow extends TVProgramma {

    private String presentator;
    private String onderwerp;

    public Talkshow(String titel, int tijdsduur, String zender, String presentator, String onderwerp) {
        super(titel, tijdsduur, zender);
        this.presentator = presentator;
        this.onderwerp = onderwerp;
    }

    @Override
    public String toString() {
        return super.toString() + "wordt gepresenteerd door:" + presentator + ", onderwerp " + onderwerp;
    }

}
