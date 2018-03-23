/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Oefentoets14_15;

import javax.swing.JFrame;

/**
 *
 * @author Justin Altena
 */
public class Program {

    public static void main(String[] args) {
//        Knuffel k = new Knuffel("Bert");
//        System.out.println(k.toString());
//        Spongebob s = new Spongebob("Gertrude");
//        Red r = new Red("Jan");
//        System.out.println(s.toString());
//        System.out.println(r.toString());
//        Knuffelbase kb = new Knuffelbase();
//        Spongebob s = new Spongebob("Gertrude");
//        Red r = new Red("Jan");
//        kb.addKnuffel(s);
//        kb.addKnuffel(r);
//        kb.printLijst();
        Knuffelbase kb = new Knuffelbase();
        Hoofdscherm h = new Hoofdscherm(kb);
        h.setVisible(true);

    }
}
