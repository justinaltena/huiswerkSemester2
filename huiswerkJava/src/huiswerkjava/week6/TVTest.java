/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package huiswerkjava.week6;

/**
 *
 * @author W10
 */
public class TVTest {

    public static void main(String[] args) {
        TVProgramma tv1 = new TVSerie("LotR", 123, "npo1", "", 2);
        TVGids gids1 = new TVGids();
        gids1.addProgramma(tv1);
        gids1.printGids();
    }
}
