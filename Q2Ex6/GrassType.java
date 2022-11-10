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
public class GrassType extends Monster{
    public GrassType(String n, int m, int base){
        super(n, "grass", "water", "fire", m, base);
    }
    
    @Override
    public void special(){
        atk += 2;
        hp += maxHP*0.20;
    }
    
    @Override
    public void rest(){
        hp += maxHP * 0.50;
        if(hp > maxHP) hp = maxHP;
        System.out.println(getName() + " rested. It's health is now " + hp + ".");
    }
}
