/*
 * Scissor-Rock-Paper Game – Object-Oriented Program
 * Author: Tania Diaz
 * Date: 09/14/2025
 * What this program does: This program plays the Rock-Paper-Scissors game. The user enters a choice, 
 * the computer randomly generates its choice, and the program determines the winner.
 * Time spent: 4 hours
 * Honor Code: I pledge that this program represents my own program code. I received help from (enter the names of others that 
   helped with the assignment, write no one if you received no help) in designing and debugging my program
 */



package scisrockpapergame;

import java.util.Random;
import java.util.Scanner;

public class ScisRockPaperG {

    // Fields
    private int myChoice;
    private int computerChoice;

    // Constructor
    public ScisRockPaperG() {
        // Default constructor
    }

    // Getters & Setters
    public int getMyChoice() {
        return myChoice;
    }

    public void setMyChoice(int myChoice) {
        this.myChoice = myChoice;
    }

    public int getComputerChoice() {
        return computerChoice;
    }

    public void setComputerChoice(int computerChoice) {
        this.computerChoice = computerChoice;
    }

    //computer's choice (random), 0 = Scissor, 1 = Rock, 2 = Paper
    public void generateComputerChoice() {
        Random rand = new Random();
        this.computerChoice = rand.nextInt(3); 
    }

    // Get input from user
    public void getInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Choose one number: 0(Scissor), 1(Rock), 2(Paper): ");
        this.myChoice = scanner.nextInt();
    }

    // Determine the winner (3 else-if)
    public String determineWinner() {
        if (getMyChoice() == getComputerChoice()) {
            return "Draw!";
        } 
        else if (getMyChoice() == 0 && getComputerChoice() == 2) {
            return "You win! Scissor cuts Paper";
        } 
        else if (getMyChoice() == 1 && getComputerChoice() == 0) {
            return "You win! Rock breaks Scissor";
        } 
        else if (getMyChoice() == 2 && getComputerChoice() == 1) {
            return "You win! Paper covers Rock";
        } 
        else {
            return "You lost!";
        }
    }

    // Main method to run the game
    public static void main(String[] args) {
        ScisRockPaperG game = new ScisRockPaperG();

        game.getInput();
        game.generateComputerChoice();

        System.out.println("Computer chose: " + game.getComputerChoice());
        System.out.println(game.determineWinner());
    }
}

		 
		
