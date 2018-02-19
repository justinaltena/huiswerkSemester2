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
public class TVTest {

    public static void main(String[] args) {
        TVProgramma tv1 = new TVProgramma("henk", 123, "npo1");
        Talkshow tv2 = new Talkshow("asdasda", 21, "npgfasasdo1", "henkie", "bier");
        TVSerie tv3 = new TVSerie("GoT", 70, "asda", "jan", 21);
        TVProgramma tv4 = new TVProgramma("voetbal", 90, "fox");
        TVGids gids1 = new TVGids();
        gids1.addProgramma(tv1);
        gids1.addProgramma(tv2);
        gids1.addProgramma(tv3);
        gids1.addProgramma(tv4);
        gids1.printGids();
    }
}
