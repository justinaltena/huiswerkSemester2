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
public class WeerberichtTest {
    public static void main(String[] args) {
        Weerbericht weerbericht = new Weerbericht(5.7, 7, "NO");
        System.out.println(weerbericht.getTemperatuur());
        System.out.println(weerbericht.getWindkracht());
        System.out.println(weerbericht.getWindrichting());
    }
}
