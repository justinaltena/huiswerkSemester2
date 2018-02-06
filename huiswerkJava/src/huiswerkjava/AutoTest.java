/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package huiswerkjava;

import static java.lang.Math.abs;
import static java.lang.Math.max;

/**
 *
 * @author W10
 */
public class AutoTest {

    private static int pkVerschl;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Auto auto1 = new Auto();
        System.out.println(auto1);
        auto1.setMerk("Skoda");
        auto1.setType("Fabia");
        auto1.setPk(60);
        System.out.println(auto1);
        Auto auto2 = new Auto();
        auto2.setMerk("Tesla");
        auto2.setType("S");
        auto2.setPk(400);
        System.out.println(auto2);
        int pkVerschil = abs(auto1.getPk() - auto2.getPk());
        if(auto1.getPk() > auto2.getPk()){
            String snelsteAuto = auto1.getMerk();
            String traagsteAuto = auto2.getMerk();
            System.out.println("de " + snelsteAuto + " heeft meer vermogen dan de " + traagsteAuto + ", het verschil is " + pkVerschil + " pk");

        }else if(auto1.getPk() < auto2.getPk()){
            String snelsteAuto = auto2.getMerk();
            String traagsteAuto = auto1.getMerk();
            System.out.println("de " + snelsteAuto + " heeft meer vermogen dan de " + traagsteAuto + ", het verschil is " + pkVerschil + " pk");

        }else{
            System.out.println("de " + auto1.getMerk() + " en de " + auto2.getMerk() + " hebben evenveel vermogen, namelijk "+ auto1.getPk() + "pk");
        }
        auto1.voerOp(abs(auto1.getPk() - auto2.getPk()));
        auto1.setPk(60); // Skoda weer terug naar af
        int maxOpvoer1 = auto1.berekenOpvoerMogelijkheid();
        System.out.println("max " + auto1.getMerk() + ": " + maxOpvoer1);
        int maxOpvoer2 = auto2.berekenOpvoerMogelijkheid();
        System.out.println("max " + auto2.getMerk() + ": " + maxOpvoer2);
        while (auto1.getPk() < auto2.getPk() & auto1.isOpgevoerd()== false) {
            auto1.voerOp(auto1.berekenOpvoerMogelijkheid());
        }

      }
    
    
}
