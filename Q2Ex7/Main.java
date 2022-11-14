/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise07muonlaxinamoniquejhoienyl;
/**
 *
 * @author MUON
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {        
        FireType fm = new FireType("NINE", 35, 10);
        GrassType gm = new GrassType("LEAF BOI", 45, 10);
        WaterType wm = new WaterType ("NATURE SPRINGS",50, 10);
        Location lf = new Location("Forge City", "Bargain CDs");
        Trainer mc = new Trainer("Ember",lf);
        NPC npc1 = new NPC("Jahn", lf, "Mornin, nice day for piracy ain't it! Huah-hah!");
        
        mc.inspect(gm);
        mc.inspect(npc1);
        mc.inspect(lf);
    }
    
}