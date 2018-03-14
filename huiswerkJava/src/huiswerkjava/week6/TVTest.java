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
        TVSerie tv1 = new TVSerie("henk", 123, "npo1", "Regie", 2);
        Talkshow tv2 = new Talkshow("asdasda", 21, "npgfasasdo1", "henkie", "bier");
        TVSerie tv3 = new TVSerie("GoT", 70, "asda", "jan", 21);
        Talkshow tv4 = new Talkshow("voetbal", 90, "fox", "kees", "voetbal");
        TVGids gids1 = new TVGids();
        gids1.addProgramma(tv1);
        gids1.addProgramma(tv2);
        gids1.addProgramma(tv3);
        gids1.addProgramma(tv4);
        gids1.printGids();
    }
}
