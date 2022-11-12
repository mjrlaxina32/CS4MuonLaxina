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
public class FireType extends Monster {
    public FireType(String n, int m, int base){
        super(n, "fire", "grass", "water", m, base);
        atk *= 1.3;
        def *= 0.7;
    }
    
    @Override
    public void special(){
        System.out.println(name + " did a pose!");
        atk += 2;
        hp -= maxHP*0.10;
    }
}
