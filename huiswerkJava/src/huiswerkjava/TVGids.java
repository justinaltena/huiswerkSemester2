/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package huiswerkjava;

import java.util.ArrayList;

/**
 *
 * @author W10
 */
public class TVGids {

    private ArrayList<TVProgramma> programmas;

    public TVGids() {
        programmas = new ArrayList<>();
    }

    public void addProgramma(TVProgramma programma) {
        programmas.add(programma);
    }

    public void printGids() {
        for (TVProgramma programma : programmas) {
            System.out.println(programma);
        }
    }

}
