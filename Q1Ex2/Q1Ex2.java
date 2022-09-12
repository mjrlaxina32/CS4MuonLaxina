/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q1ex2;

import java.util.Scanner;

/**
 *
 * @author MUON
 */
public class Q1Ex2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("||||Welcome to Higher or Lower!||||");
        Scanner sc = new Scanner(System.in);
        boolean end = false;
        int option, randN = 0;
        int guess = 5;
        int lRand = 1;
        int hRand = 5;
        while (end==false){  
            System.out.println("Options \n [1] Start Game \n [2] Change Settings \n [3] End Application");
            option = sc.nextInt();
            switch(option){
                case 1:
                    System.out.println("Start Game!");
                    //insert game here
                    randN = (int) (Math.floor(Math.random()*hRand) + lRand);
                    System.out.println(randN); //to be erased later
                        for (guess!=0; guess--;){ //fix later
                            end = true;
                        }
                    }
                    break;
                case 2: 
                    System.out.println("Settings: \n (1) Lowest random number \n (2) Highest random number \n (3) Number of guesses");
                    System.out.printf("  (1) ");
                        lRand = sc.nextInt();
                    System.out.printf("  (2) ");
                        hRand = sc.nextInt();
                    System.out.printf("  (3) ");
                        guess = sc.nextInt();
                    break;
                case 3: 
                    System.out.println("Thank you for playing");
                    end = true;
                    break;
            }
        }
    }
    
}
