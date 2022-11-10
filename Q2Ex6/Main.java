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
        /**In the main method, create three Monsters, one of each type (you may
        choose the values for the Monsters). Simulate 3 separate battles, Grass 
        vs Fire, Fire vs Water, and Water vs Grass. Create a loop so that they 
        repeatedly attack each other until one or both HP is reduced to 0. There
        is no need for user input in the main method, so you may hardcode the 
        entire process.**/
        
        FireType fm = new FireType("fire9", 200, 10);
        GrassType gm = new GrassType("Ded", 150, 10);
        WaterType wm = new WaterType ("Wilkins", 250, 10);
    }
    
}
