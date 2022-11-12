/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise06muonlaxinamoniquejhoienyl;

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
        
        boolean fight = true;
        System.out.println("[Match 1 - Grass vs Fire]");
        while(fight = true){
            gm.attack(fm );
            fm.attack(gm);
            if(gm.getHP()==0 || fm.getHP()==0){
                System.out.println("Match over!");
                gm.resetHealth();
                fm.resetHealth();
                fight = false;
                break;
            } 
        }
        fight = true;
        
        System.out.println("\n[Match 2 - Fire vs Water]");
        while(fight = true){
        fm.attack(wm );
        wm.attack(fm);
            if(fm.getHP()==0 || wm.getHP()==0){
                System.out.println("Match over!");
                fm.resetHealth();
                wm.resetHealth();
                fight = false;
                break;
            }
        }
        fight = true;
        
        System.out.println("\n[Match 3 - Water vs Grass]");
        while(fight = true){
        wm.attack(gm );
        gm.attack(wm);
            if (gm.getHP()<=10){
                gm.rest();
            }
            if(wm.getHP()==0 || gm.getHP()==0){
                System.out.println("Match over!");
                wm.resetHealth();
                gm.resetHealth();
                fight = false;
                break;
            }
        }
    }
    
}
