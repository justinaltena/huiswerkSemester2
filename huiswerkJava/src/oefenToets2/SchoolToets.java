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
public class SchoolToets {

    public static void main(String[] args) {
        Lokaal l1 = new LesLokaal("C5.21");
        Lokaal l2 = new ComputerLokaal("E3.21", 15);
        Lokaal l3 = new ComputerLokaal("A3.21", 19);
        Lokaal l4 = new ComputerLokaal("A3.21", 12);
        Lokaal l5 = new ComputerLokaal("B3.21", 1);
        Lokaal l6 = new ComputerLokaal("C3.21", 11);
        School s1 = new School();
        s1.voegLokaalToe(l2);
        s1.voegLokaalToe(l1);
        s1.voegLokaalToe(l6);
        s1.voegLokaalToe(l3);
        s1.voegLokaalToe(l4);
        s1.voegLokaalToe(l5);
        //s1.printLokalen();
        //(s1.zoekLokaal("C5.21")).printOmschrijving();
    }
}
