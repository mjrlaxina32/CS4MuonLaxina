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
        boolean end  = false;
        boolean cont  = true;
        char cC = 'x';
        String option; //to configure equals
        int randN = 0;
        int guessCount = 5;
        int lRand = 1;
        int hRand = 5;
        int guessUser = 0;
        main:
            do{ 
                cont = true;
                System.out.println("Options \n [+] Start Game \n [+] Change Settings \n [+] End Application");
                option = sc.nextLine(); 
                switch(option){
                    case "Start Game": //game, probs needs equals for case
                        while (cont==true){
                            System.out.println("Start Game!");
                            randN = (int) (Math.floor(Math.random()*hRand) + lRand); //sets a random int
                            //System.out.println(randN); // for testing purposes
                                for (int counter = guessCount; counter >= 1; counter--){ //the game 
                                    System.out.println("You have " + counter + " guess(es) left."); //guess counter
                                    System.out.println("What is your guess: ");
                                    guessUser = Integer.parseInt(sc.nextLine());
                                    if (guessUser == randN){ //if the guess is correct
                                        System.out.println("Congratulations! You Win!");
                                        System.out.println("Number: " + randN + "\nGuess(es) left: " + counter + "\n");
                                        break;
                                    }
                                    else if (guessUser < randN) { //if guess is low
                                        System.out.println("Go Higher!");
                                    }
                                    else if (guessUser > randN) { //if guess is higher
                                        System.out.println("Go Lower!");
                                    } 
                                } //loop terminates once guess runs out
                            if (guessUser != randN){ //if the user didnt successfully guess within the number of guesses
                                System.out.println("You Lose :P the number was " + randN); 
                            }
                            System.out.println("Play again? y/n"); //back to menu/ends game
                            cC = sc.nextLine().charAt(0);
                            if (cC=='n'){
                                cont = false;
                                break;
                            }
                        } 
                    break;
                    case "Change Settings":  //settings, works fine, probs needs equal for case
                        System.out.println("Settings: \n (1) Lowest random number \n (2) Highest random number \n (3) Number of guesses");
                        System.out.printf("  (1) ");
                            lRand =  Integer.parseInt(sc.nextLine());
                        System.out.printf("  (2) ");
                            hRand =  Integer.parseInt(sc.nextLine());
                        System.out.printf("  (3) ");
                            guessCount =  Integer.parseInt(sc.nextLine());
                    break;
                    case "End Application": //ends button, works fine, probs needs equal for case
                        System.out.println("Thank you for playing");
                        end = true;
                    break;
                }
            } while (end==false);
    }
    
}
