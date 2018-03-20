/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Huiswerk13_GUI;

import javax.swing.JFrame;

/**
 *
 * @author Justin Altena
 */
public class Program {

    public static void main(String[] args) {
        Munt euro = new Munt("Euro", "€");
        Munt dollar = new Munt("Dollar", "$");

        Wisselkoers koers = new Wisselkoers(euro, dollar, 1.12);
        WisselScherm scherm = new WisselScherm(koers);
        scherm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
