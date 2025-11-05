/*
 * StringClass Object-Oriented Program
 * Author: Tania Diaz
 * Date: 09/30/2025
 * What this program does: Gets a word from the user and demonstrates
 * 5 String class functions (length, toUpperCase, toLowerCase, trim, isEmpty).
 * Time spent: 3 hours
 * Honor Code: I pledge that this program represents my own program code.
 */

package StringClass;

import java.util.Scanner;

public class StringClass {

    private String text;

    // Constructor
    public StringClass(String text) {
        this.text = text;
    }

    // Getter&Setters
    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    // Ask user for input
    public void inputString() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a word:");
        text = scanner.nextLine(); 
    }

    // 1. Length of the string
    public int getLength() {
        return text.length();
    }

    // 2. Convert to uppercase
    public String toUpper() {
        return text.toUpperCase();
    }

    // 3. Convert to lowercase
    public String toLower() {
        return text.toLowerCase();
    }

    // 4. Trim spaces at start and end
    public String trimText() {
        return text.trim();
    }

    // 5. Check if empty
    public boolean isEmptyText() {
        return text.isEmpty();
    }

    // toString 
    @Override
    public String toString() {
        return "Word: \"" + text + "\", Length: " + getLength()
               + ", Uppercase: " + toUpper()
               + ", Lowercase: " + toLower()
               + ", Trimmed: \"" + trimText() + "\""
               + ", Empty: " + isEmptyText();
    }

    // Main
    public static void main(String[] args) {
        StringClass myWord = new StringClass("");
        myWord.inputString();
        System.out.println(myWord);
    }
}
