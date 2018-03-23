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
public class KnikkerStart {

    public static void main(String[] args) {
        System.out.println("opgave 1a");
        Knikker knikker1 = new Knikker(50);
        System.out.println(knikker1);

        System.out.println("opgave 1b");
        Bakje bakje1 = new Bakje(knikker1, 7);
        System.out.println(bakje1);

        System.out.println("opgave 1c");
        Spelronde spelronde1 = new Spelronde(3, 50);
        System.out.println(spelronde1);

        System.out.println("opgave 1d");
        System.out.println(spelronde1);
        spelronde1.setSchatting(4);
        System.out.println(spelronde1);
        spelronde1.setSchatting(3);
        System.out.println(spelronde1);

        System.out.println("opgave 2");
        Spelronde spelronde = new Spelronde(3, 50);
        Hoofdscherm scherm = new Hoofdscherm(spelronde);
        scherm.setVisible(true);

        System.out.println("opgave 3");
        System.out.println(spelronde);

    }
}
