/* LetterCounterOOP
 * Student: Tania Diaz
 * Date: 10/05/2025
 * Purpose: This program counts the number of letters in a user-entered string using OOP.
 * Time Spent: 2 hours
 * Honor Code: I pledge that this program represents my own program code. I received help from no one.
 */


package LetterCounter;

import java.util.Scanner;

public class LetterCounter {
	
	//fields
	private String input;       
	private int letterCount;
	
	//constructor


	public LetterCounter(String input) {
	super();
	this.input = input;
	this.letterCount = 0;
	}
	
	//gettersandsetters

	public String getInput() {
		return input;
	}

	public void setInput(String input) {
		this.input = input;
	}

	public int getLetterCount() {
		return letterCount;
	}

	public void setLetterCount(int letterCount) {
		this.letterCount = letterCount;
	}
	
	//Method to count letter
    public void countLetters() {
        int count = 0; 
        String text = getInput();
        for (int i = 0; i < text.length(); i++) {
            if (Character.isLetter(text.charAt(i))) {
                count++;
            }
        }
        setLetterCount(count); 
    }
	
    
    @Override
    public String toString() {
        return "The string \"" + input + "\" contains " + letterCount + " letters.";
    }

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String userInput = sc.nextLine();
        
        LetterCounter counter = new LetterCounter(userInput);
        counter.countLetters();
        
        System.out.println(counter);
        
        sc.close();
    }
}
