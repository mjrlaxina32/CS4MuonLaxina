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
        //cooldowns
        int rcd1 = 0; int rcd2 = 0;
        int gcd1 = 0; int gcd2 = 0;
        int ccd1 = 0; int ccd2 = 0;
        int scd1 = 0; int scd2 = 0;
        System.out.println("[Match 1 - Grass vs Fire]");
        while(fight = true){
            //monster 1 turn - grass
            if (rcd1>=2 && gm.getHP()<=10 && (int)Math.floor(Math.random()*(100-1+1)+1)>= 70){ //70% chance of resting
                gm.rest();
                rcd1=0;
            }
            else if (gcd1>=3 && (int)Math.floor(Math.random()*(100-1+1)+1)>= 30){ //30% chance of guard
                gm.guard();
                gcd1=0;
            }
            else if (ccd1>=3 &&(int)Math.floor(Math.random()*(100-1+1)+1)>= 30){ //30% chance of charging
                gm.charge();
                ccd1=0;
            }
            else {
                if (scd1>=3 && (int)Math.floor(Math.random()*(100-1+1)+1)>= 50){ //50% chance of special
                    gm.special();
                    scd1=0;
                }
                gm.attack(fm);
            }
            rcd1++; gcd1++; ccd1++; scd1++; 
            
            //monster 2 turn - fire
            if (rcd2>=3 && fm.getHP()<=10 && (int)Math.floor(Math.random()*(100-1+1)+1)>= 50){ //50% chance of resting
                fm.rest();
                rcd2=0;
            }
            else if (gcd2>=3 && (int)Math.floor(Math.random()*(100-1+1)+1)>= 30){ //30% chance of guard
                fm.guard();
                gcd2=0;
            }
            else if (ccd2>=3 && (int)Math.floor(Math.random()*(100-1+1)+1)>= 30){ //30% chance of charging
                fm.charge();
                ccd2=0;
            }
            else {
                if (scd2>=3 && (int)Math.floor(Math.random()*(100-1+1)+1)>= 70){ //70% chance of special
                    fm.special();
                    scd2=0;
                }
                fm.attack(gm);
            }
            rcd2++; gcd2++; ccd2++; scd2++; 
            
            //game end condition
            if(gm.getHP()==0 || fm.getHP()==0){
                    System.out.println("Match over!");
                    gm.resetHealth();
                    fm.resetHealth();
                    fight = false;
                    break;    
            }            
        }
        rcd1 = 0; rcd2 = 0;
        gcd1 = 0; gcd2 = 0;
        ccd1 = 0; ccd2 = 0;
        scd1 = 0; scd2 = 0;
        fight = true;
        
        System.out.println("\n[Match 2 - Fire vs Water]");
        while(fight = true){
            //monster 1 turn - fire
            if (rcd1>=3 && fm.getHP()<=10 && (int)Math.floor(Math.random()*(100-1+1)+1)>= 50){ //50% chance of resting
                fm.rest();
                rcd1=0;
            }
            else if (gcd1>=3 && (int)Math.floor(Math.random()*(100-1+1)+1)>= 30){ //30% chance of guard
                fm.guard();
                gcd1=0;
            }
            else if (ccd1>=3 && (int)Math.floor(Math.random()*(100-1+1)+1)>= 30){ //30% chance of charging
                fm.charge();
                ccd1=0;
            }
            else {
                if (scd1>=3 && (int)Math.floor(Math.random()*(100-1+1)+1)>= 70){ //70% chance of special
                    fm.special();
                    scd1=0;
                }
                fm.attack(wm);
            }
            rcd1++; gcd1++; ccd1++; scd1++; 
            
            //monster 2 turn - water
            if (rcd2>=3 && wm.getHP()<=10 && (int)Math.floor(Math.random()*(100-1+1)+1)>= 50){ //50% chance of resting
                wm.rest();
                rcd2=0;
            }
            else if (gcd2>=3 && (int)Math.floor(Math.random()*(100-1+1)+1)>= 30){ //30% chance of guard
                wm.guard();
                gcd2=0;
            }
            else if (ccd2>=3 && (int)Math.floor(Math.random()*(100-1+1)+1)>= 30){ //30% chance of charging
                wm.charge();
                ccd2=0;
            }
            else {
                if (scd2>=3 && (int)Math.floor(Math.random()*(100-1+1)+1)>= 70){ //70% chance of special
                    wm.special();
                    scd2=0;
                }
                wm.attack(fm);
            }
            rcd2++; gcd2++; ccd2++; scd2++; 
            
            //game end condition
            if(fm.getHP()==0 || wm.getHP()==0){
                    System.out.println("Match over!");
                    fm.resetHealth();
                    wm.resetHealth();
                    fight = false;
                    break;    
            }            
        }
        rcd1 = 0; rcd2 = 0;
        gcd1 = 0; gcd2 = 0;
        ccd1 = 0; ccd2 = 0;
        scd1 = 0; scd2 = 0;
        fight = true;
        
        System.out.println("\n[Match 3 - Water vs Grass]");
        while(fight = true){
            //monster 1 turn - water
            if (rcd1>=3 && wm.getHP()<=10 && (int)Math.floor(Math.random()*(100-1+1)+1)>= 50){ //50% chance of resting
                wm.rest();
                rcd1=0;
            }
            else if (gcd1>=3 && (int)Math.floor(Math.random()*(100-1+1)+1)>= 30){ //30% chance of guard
                wm.guard();
                gcd1=0;
            }
            else if (ccd1>=3 && (int)Math.floor(Math.random()*(100-1+1)+1)>= 30){ //30% chance of charging
                wm.charge();
                ccd1=0;
            }
            else {
                if (scd1>=3 && (int)Math.floor(Math.random()*(100-1+1)+1)>= 70){ //70% chance of special
                    wm.special();
                    scd1=0;
                }
                wm.attack(gm);
            }
            rcd1++; gcd1++; ccd1++; scd1++; 
            
            //monster 2 turn - grass
            if (rcd2>=2 && gm.getHP()<=10 && (int)Math.floor(Math.random()*(100-1+1)+1)>= 70){ //70% chance of resting
                gm.rest();
                rcd2=0;
            }
            else if (gcd2>=3 && (int)Math.floor(Math.random()*(100-1+1)+1)>= 30){ //30% chance of guard
                gm.guard();
                gcd2=0;
            }
            else if (ccd2>=3 &&(int)Math.floor(Math.random()*(100-1+1)+1)>= 30){ //30% chance of charging
                gm.charge();
                ccd2=0;
            }
            else {
                if (scd2>=3 && (int)Math.floor(Math.random()*(100-1+1)+1)>= 50){ //50% chance of special
                    gm.special();
                    scd2=0;
                }
                gm.attack(wm);
            }
            rcd2++; gcd2++; ccd2++; scd2++;
            
            //game end condition
            if(wm.getHP()==0 || gm.getHP()==0){
                    System.out.println("Match over!");
                    gm.resetHealth();
                    wm.resetHealth();
                    fight = false;
                    break;    
            }            
        }
        rcd1 = 0; rcd2 = 0;
        gcd1 = 0; gcd2 = 0;
        ccd1 = 0; ccd2 = 0;
        scd1 = 0; scd2 = 0;
        fight = true;
    
    }
    
}
