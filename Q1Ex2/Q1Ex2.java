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
        
        /*String myStr1 = "Hello"; //testing how equals work, how do i apply this?????
        String myStr2 = "HELLO";
        String myStr3 = "Another String";
        System.out.println(myStr1.equalsIgnoreCase(myStr2)); // true
        System.out.println(myStr1.equalsIgnoreCase(myStr3)); // false*/
        
        Scanner sc = new Scanner(System.in);
        boolean end = false;
        String option;
        int randN = 0;
        int guessCount = 5;
        int lRand = 1;
        int hRand = 5;
        int guessUser;
        char cont;
        while (end==false){  
            System.out.println("Options \n [+] Start Game \n [+] Change Settings \n [+] End Application");
            option = sc.nextLine();
            switch(option){
                case "Start Game":
                    System.out.println("Start Game!");
                    //insert game here
                    randN = (int) (Math.floor(Math.random()*hRand) + lRand);
                    System.out.println(randN); //to be erased later
                    for (int counter = guessCount; counter >= 1; counter--){
                        System.out.println("You have " + counter + " guess(es) left.");
                        System.out.println("What is your guess: ");
                        guessUser = sc.nextInt();
                        if (guessUser == randN){
                            System.out.println("Congratulations! You Win!");
                            System.out.println("Number: " + randN + "\nGuess(es) left: " + counter + "\n");
                            break;
                        } 
                    }
                    System.out.println("Continue? y/n");
                    //cont = next().charAt(0);//to fix!!!!
                break;
                case "Change Settings": 
                    System.out.println("Settings: \n (1) Lowest random number \n (2) Highest random number \n (3) Number of guesses");
                    System.out.printf("  (1) ");
                        lRand = sc.nextInt();
                    System.out.printf("  (2) ");
                        hRand = sc.nextInt();
                    System.out.printf("  (3) ");
                        guessCount = sc.nextInt();
                break;
                case "End Application": 
                    System.out.println("Thank you for playing");
                    end = true;
                break;
            }
        }
    }
    
}
