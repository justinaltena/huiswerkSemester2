/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package huiswerk14;

import java.util.ArrayList;

/**
 *
 * @author W10
 */
public class Scenario {

    private ArrayList<Scene> scenes;

    public Scenario() {
        scenes = new ArrayList<>();
    }

    public void voegSceneToe(Scene scene) {
        scenes.add(scene);
    }

    public int getAantalScenes() {
        return scenes.size();
    }

}
